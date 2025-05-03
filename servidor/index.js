var http = require("http");

var express = require("express");

var mongodb = require("mongodb");

const uri = "mongodb+srv://luciano:240904lu@projeto.vgvfhxf.mongodb.net/?retryWrites=true&w=majority&appName=Projeto";

const MongoClient = mongodb.MongoClient;

const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

var app = express();

app.use(express.json()); 
app.use(express.urlencoded({ extended: true })); 

app.use(express.static('./public'));

var server = http.createServer(app);
server.listen(3000, () => {
console.log("servidor rodando...");
});

client.connect().then(() => {
    var dbo = client.db("exemplo_bd");
    var usuarios = dbo.collection("usuarios");

    app.post("/cadastrar_usuario", function (req, resp) {
        var data = {db_nome:req.body.nome, db_login: req.body.login, db_senha: req.body.senha };
        usuarios.insertOne(data, function (err) {
            if (err) {
                resp.status(500).send("Erro ao cadastrar usuário!");
            } else {
                resp.status(200).send("Usuário cadastrado com sucesso!");
            }
        });
    });

    app.post("/logar_usuario", function (req, resp) {
        var data = { db_login: req.body.login, db_senha: req.body.senha };
        usuarios.find(data).toArray(function (err, items) {
            if (err) {
                resp.status(500).send("Erro ao logar usuário!");
            } else if (items.length == 0) {
                resp.status(200).send("Usuário/senha não encontrado!");
            } else {
                resp.status(200).send("Usuário logado com sucesso!");
            }
        });
    });

}).catch(err => {
    console.error("Erro ao conectar no MongoDB:", err);
});