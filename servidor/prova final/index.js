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
server.listen(3000);
console.log('Servidor rodando ...');

client.connect().then(() => {
    const dbo = client.db("exemplo_bd"); //conecta no banco de dados
    const usuarios = dbo.collection("votos");

app.get('/', (req, resp) => {
    usuarios.find().toArray((err, resultado) => {
        if (err) {
            resp.status(500).send(" ");
        } else {
            resp.render('home', { usuarios: resultado });
        }
    });
});

app.post('/cadastro', function (req, resp) {
    const data = {
        codigo: req.body.codigo
    };
    usuarios.insertOne(data, (err) => {
        if (err) {
            resp.status(400).json({ success: false, message: "Erro ao submeter o voto!" });
        } else {
            resp.render('registro');
        }
    });
});

app.get('/listagem', function (requisicao, resposta) {
    usuarios.find().toArray((err, usuario) => {
        if (err) {
            resposta.status(500).send("Erro ao buscar votos.");
        } else {
            const html = (usuario.codigo == "1");
            const node = (usuario.codigo == "2");
            const mongo = (usuario.codigo == "3");
            resposta.render('home', { codigo_html: html, codigo_node: node, codigo_mongo: mongo });
        }
    });
});
});
