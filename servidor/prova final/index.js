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

app.get('/', async (req, resp) => {
    try {
        const votos = await usuarios.find().toArray();

        let html = 0, node = 0, mongo = 0;

        votos.forEach(voto => {
            if (voto.codigo == "1") html++;
            else if (voto.codigo == "2") node++;
            else if (voto.codigo == "3") mongo++;
        });

        resp.render('home', {
            usuarios: votos,
            codigo_html: html,
            codigo_node: node,
            codigo_mongo: mongo
        });
    } catch (err) {
        resp.status(500).send("Erro ao carregar votos.");
    }
});


app.post('/cadastro', function (req, resp) {
    const codigo = req.body.codigo;

    if (!["1", "2", "3"].includes(codigo)) {
        return resp.status(400).json({ success: false, message: "Código inválido!" });
    }

    const data = { codigo };
    usuarios.insertOne(data, (err) => {
        if (err) {
            resp.status(400).json({ success: false, message: "Erro ao submeter o voto!" });
        } else {
            resp.render('registro'); // ou redirecionar para /listagem
        }
    });
});


app.get('/listagem', async function (requisicao, resposta) {
    try {
        const votos = await usuarios.find().toArray();

        // Contar votos por tecnologia
        let html = 0, node = 0, mongo = 0;

        votos.forEach(voto => {
            if (voto.codigo == "1") html++;
            else if (voto.codigo == "2") node++;
            else if (voto.codigo == "3") mongo++;
        });

        resposta.render('home', {
            codigo_html: html,
            codigo_node: node,
            codigo_mongo: mongo,
            usuarios: votos // manter isso para o loop do EJS se necessário
        });
    } catch (err) {
        resposta.status(500).send("Erro ao buscar votos.");
    }
});

});
