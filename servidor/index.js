
var http = require( "http");

var bodyParser = require( "body-parser");

var express = require( "express");

var mongodb = require("mongodb")

var dbo = client.db("exemplo_bd");

var usuarios = dbo.collection("usuarios");

const MongoClient = mongodb.MongoClient

const uri = "mongodb+srv://Xermoneys:462404LuVentura@faculdade.qd9zggt.mongodb.net/?retryWrites=true&w=majority&appName=Faculdade";

const client = new MongoClient(uri, {useNewUrlParser: true});

var app = express();

app.use(express. static('./public' ));

app. use(express .static( "./public") ) ;

var server = http.createServer(app) ;


server. listen(3000);

app.post("/cadastrar_usuario", function(req, resp) {
    var data = { db_nome: req.body.nome, db_login: req.body.login, db_senha: req.body.senha };
    usuarios.insertOne(data, function (err) {
    if (err) {
    resp.render('resposta_usuario', {resposta: "Erro ao cadastrar usuário!"})
    }else {
    resp.render('resposta_usuario', {resposta: "Usuário cadastrado com sucesso!"})
    };
    });
   
    });
   
app.post("/logar_usuario", function(req, resp) {
    var data = {db_login: req.body.login, db_senha: req.body.senha };
    usuarios.find(data).toArray(function(err, items) {
    console.log(items);
    if (items.length == 0) {
    resp.render('resposta_usuario', {resposta: "Usuário/senha não encontrado!"})
    }else if (err) {
    resp.render('resposta_usuario', {resposta: "Erro ao logar usuário!"})
    }else {
    resp.render('resposta_usuario', {resposta: "Usuário logado comsucesso!"})
    };
    });
    });
   
   
console.log("servidor rodando... " ) ;