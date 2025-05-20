
var http = require( "http");

var bodyParser = require( "body-parser");

var express = require( "express");

var app = express();
app.use(express. static('./public' ));
app.use(bodyParser. urlencoded({ extended : false}))
app.use(bodyParser. json())
app. use(express .static( "./public") ) ;

var server = http.createServer(app) ;

server. listen(3000);

var x = Math.floor(Math.random() * 11);

app.post("/number", function(requisicao,resposta){
    var number = requisicao.body.number;
    
    {
        if (number == x) {
            resposta.status(200).send("Você acertou!");
        } else if (number > x) {
            resposta.status(200).send("O número é menor!");
        } else {
            resposta.status(200).send("O número é maior!");
        }
    }
});

console.log("servidor rodando... " ) ;