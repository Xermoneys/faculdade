var http = require("http");

var express = require("express");

var mongodb = require("mongodb");

const cors = require('cors'); 

const uri = "mongodb+srv://luciano:240904lu@projeto.vgvfhxf.mongodb.net/?retryWrites=true&w=majority&appName=Projeto";

const MongoClient = mongodb.MongoClient;

const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

const app = express();
app.use(cors()); // Habilita CORS para todas as rotas
app.use(express.json()); 
app.use(express.urlencoded({ extended: true })); 
app.use(express.static('./public'));

const server = http.createServer(app);
server.listen(3000, () => {
    console.log("servidor rodando...");
});

client.connect().then(() => {
    const dbo = client.db("exemplo_bd");
    const usuarios = dbo.collection("usuarios");


app.post("/submeter_patente", (req, resp) => {
        const data = {
            db_nome: req.body.nome,
            db_proprietário: req.body.proprietario,
            db_data_expedição: req.body.expedicao
        };

        usuarios.insertOne(data, (err) => {
            if (err) {
                resp.status(400).json({ success: false, message: "Erro ao cadastrar patente!" });
            } else {
                resp.status(200).json({ success: true, message: "Patente cadastrada com sucesso!" });
            }
        });
    });

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

app.post("/atualizar_status", async (req, resp) => {
    const { id, status } = req.body;

    if (!id || !status) {
        return resp.status(400).json({ success: false, message: "ID ou status ausente" });
    }

    try {
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

}).catch(err => {
    console.error("Erro ao conectar no MongoDB:", err);
});

