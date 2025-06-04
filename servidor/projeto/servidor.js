var http = require("http");

var express = require("express");

var mongodb = require("mongodb");

const cors = require('cors'); 

const uri = "mongodb+srv://luciano:240904lu@projeto.vgvfhxf.mongodb.net/?retryWrites=true&w=majority&appName=Projeto";

const MongoClient = mongodb.MongoClient;

const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

const app = express();
app.use(cors()); 
app.use(express.json()); 
app.use(express.urlencoded({ extended: true })); 
app.use(express.static('./public'));

const server = http.createServer(app);
server.listen(3000, () => {
    console.log("servidor rodando...");
});
//Conectando ao mongodb
client.connect().then(() => {
    const dbo = client.db("exemplo_bd"); //conecta no banco de dados
    const usuarios = dbo.collection("usuarios"); //acessa a coleção "usuarios"

//rota post para uma nova patente ser cadastrada no banco de dados
app.post("/submeter_patente", (req, resp) => {
        const data = {
            db_nome: req.body.nome,
            db_proprietário: req.body.proprietario,
            db_data_expedição: req.body.expedicao
        };
//insere os dados no banco de dados
        usuarios.insertOne(data, (err) => {
            if (err) {
                resp.status(400).json({ success: false, message: "Erro ao cadastrar patente!" }); //retorna a mensagem de erro se algo der errado
            } else {
                resp.status(200).json({ success: true, message: "Patente cadastrada com sucesso!" }); //retorna a mensgem de sucesso se der tudo certo
            }
        });
    });
//rota get para pegar as patentes cadastradas em /submeter_patente
 app.get("/buscar_patentes", (req, resp) => {
        usuarios.find({}).toArray((err, patentes) => { 
            if (err) {
                resp.status(500).json({ success: false, message: "Erro ao buscar patentes" });
            } else {
                resp.status(200).json({ success: true, patentes });
            }
        });
    });

    const { ObjectId } = require('mongodb');
//rota para atualizar o status de uma patente
app.post("/atualizar_status", async (req, resp) => {
    const { id, status } = req.body;

    if (!id || !status) {
        return resp.status(400).json({ success: false, message: "ID ou status ausente" });
    }

    try { //atualiza o banco de dados com o id fornecido
        await usuarios.updateOne(
            { _id: new ObjectId(id) },
            { $set: { db_status: status } }
        );
        resp.status(200).json({ success: true, message: "Status atualizado" });
    } catch (error) {
        console.error("Erro ao atualizar status:", error);
        resp.status(500).json({ success: false, message: "Erro interno do servidor" });
    }
});
//caso literalmente tudo dê errado ao conectar no banco de dados mostra no terminar cmd
}).catch(err => {
    console.error("Erro ao conectar no MongoDB:", err);
});

