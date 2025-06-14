var http = require("http");

var express = require("express");

var mongodb = require("mongodb")

const uri = "mongodb+srv://luciano:240904lu@projeto.vgvfhxf.mongodb.net/?retryWrites=true&w=majority&appName=Projeto";

const MongoClient = mongodb.MongoClient;

const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

var bodyParser = require("body-parser");

var app = express() ;
app.use(express. static("./public" ));
app.use(express.json());
app.use(bodyParser. urlencoded({ extended : false}))
app.use(bodyParser. json())
app.set("view engine" , "ejs")
app.set("views", "./views" );

var server = http. createServer (app);
server.listen(2000);
console.log('Servidor rodando ...');

client.connect().then(() => {
    const dbo = client.db("exemplo_bd"); //conecta no banco de dados
    const usuarios = dbo.collection("lembretes");

app.get('/', (req, res) => {
res.render('home');
});

app.post('/cadastro_lembrete', function (req, resp) {
    const data = {
        titulo: req.body.titulo,
        descricao: req.body.descricao,
        local: req.body.local,
        data: req.body.data,
        hora: req.body.hora
    };
    usuarios.insertOne(data, (err) => {
        if (err) {
            resp.status(400).json({ success: false, message: "Erro ao cadastrar usuário!" });
        } else {
            resp.render('cadastrado_com_sucesso');
        }
    });
});

app.get('/listagem', function (requisicao, resposta) {
    usuarios.find().toArray((err, resultado) => {
        if (err) {
            resposta.status(500).send("Erro ao buscar usuários.");
        } else {
            resposta.render('listaem', { usuarios: resultado });
        }
    });
});
});
