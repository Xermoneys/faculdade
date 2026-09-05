import React from "react";
import {createRoot} from "react-dom/client"

function App(){
    document.body.style.backgroundColor = "lightgrey";
    
    return (
        <div>
                <Titulo/>
                <Cabecalho/>
                <Introduçao/>
                <Livros/>
                <VideoFEI/>
                <Mapa/>
                <Contatos/>
                <Consultas/>
                <Rodape/>  
        </div>
    )
}
function Titulo(){
    const titulo = {        
        border: "solid 5px navy",
        color: "green",
        backgroundColor: "bisque",
        textAlign: "center",
        flexDirection: "row",
        fontSize:"30pt",
        margin: "0px"
    } 
    return <p style={titulo}>APRENDENDO REACT PARA DESENVOLVIMENTO WEB</p>
        
    }
function Cabecalho(){
    const cabeçalho = {
        display: 'flex',
        color: "darkred",
        justifyContent: "space-evenly",        
        backgroundColor: "lightskyblue",
        alignItems: "center",
        textAlign: "center",
        fontSize:"20PX",
        margin: "0px"
        
        } 
    return <p style={cabeçalho}>
                <a href="..">HOME</a>
                <a href="..">LIVROS</a>
                <a href="..">VÍDEOS</a>
                <a href="..">CONTATOS</a>
            </p>
}
    
function Introduçao(){
    const textoMaior = {
        color: "dark",
        textAlign:"center",
        fontSize: "25pt",
        fontFamily:"SansSerif",
    }
    const textoMenor = {
        color: "purple",
        display: "flex",
        flexDirection: "row",
        textAlign:"center",
        fontSize: "20pt",
        fontFamily:"SansSerif",
        
    }
    return (<div>
                <p style={textoMaior}> Introdução</p>
                <p style={textoMenor}>Com o React, você cria interfaces organizadas em componentes reutilizáveis, que controlam tanto a exibição quanto o comportamento da aplicação. Ele permite atualizar elementos de forma dinâmica, sem recarregar a página inteira, além de facilitar a aplicação de estilos, animações e recursos interativos de maneira escalável.
                </p>
                <p style={textoMenor}>O React é uma das bibliotecas mais populares do ecossistema JavaScript e tornou-se
                referência no desenvolvimento de interfaces modernas. Sua principal força está na criação de componentes reutilizáveis, que tornam o código mais organizado e facilitam a construção de aplicações escaláveis e de fácil manutenção.
                </p>
            </div>)
    
}
function Livros(){
    const container={
        display:"flex",
        justifyContent: "space-evenly"
        
    }
    const textoMaior = {
        color: "dark",
        textAlign:"center",
        fontSize: "25pt",
        fontFamily:"SansSerif",
    }
    const imagem1 = {
        width:"15%"
    }
    const imagem2 = {
        width:"15%"
    }
    const imagem3 = {
        width:"15%"
    }
    return (<div>
        <p style={textoMaior}>Livros</p>
        <div style={container}>
        <img style={imagem1} alt = "" src="https://m.media-amazon.com/images/I/91oS8DEdYgL.jpg"></img>
        <img style={imagem2} alt = "" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrRjcyJ_tKt4VqbNrtoaMjh1IaVLvN1yrmo-jJeQqLs_j5HnH30tR0VTU&s=10"></img>
        <img style={imagem3} alt = "" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfnc_HcbWWc2w67K-PDlfp-lbFQf9TQkz3hDRbKZ5ANQ&s=10"></img>
        </div>
        </div>)
}

function VideoFEI(){
    const iframecontainer={
        display: "flex",
        justifyContent: "center",
        width: "100%"
    }
    const textoMaior = {
        color: "dark",
        textAlign:"center",
        fontSize: "25pt",
        fontFamily:"SansSerif",
    }
    const video={
        
        display: "flex",
        textAlign: "center",
        justifyContent: "center"

    }
    return (<div>
                <p style={textoMaior}>Aprenda React na FEI
                </p>
                <div style={iframecontainer}>
                <iframe title=" " width="460" height="315" style={video} src="https://www.youtube.com/embed/4MHAOPxcnsQ">
                </iframe>
                </div>
            </div>)
}
function Mapa(){
    const mapa={
        display: "flex",
        textAlign: "center",
        justifyContent: "center"
    }
    return (<div style={mapa}>
                <iframe title=" " src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3657.106896901098!2d-46.63827502391428!3d-23.56460396171277!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94ce59a26b5ea441%3A0xc48c297ac39eb42f!2sUniversity%20Center%20of%20FEI%20Campus%20S%C3%A3o%20Paulo.!5e0!3m2!1sen!2sbr!4v1740603081664!5m2!1sen!2sbr" width="600" height="450">
                </iframe>
            </div>)
}
function Contatos(){
    const textoMaior = {
        color: "dark",
        textAlign:"center",
        fontSize: "25pt",
        fontFamily:"SansSerif",
    }
    const tabelacontainer={
        display:"flex",
        justifyContent:"center"
    }
    const tabela={
        border: "2px dashed red",
        borderCollapse: "collapse",
        margin: "20px",
    }
    const td = {
        border: "1px solid red",
        padding: "8px 12px",
        textAlign: "center"
    }
    const th = {
        color: "red",
        border:"1px solid red",
        fontWeight: "bold"
    }
    return (<div>
                <p style={textoMaior}>Contatos</p>
                <div style={tabelacontainer}>
                    <table style={tabela}>
                        <thead>
                            <tr>
                                <th style={th}>Nome</th>
                                <th style={th}>email</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td style={td}>Prof. Dr. Isaac</td>
                                <td style={td}>isaacjesus@fei.edu.br</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>)
}
function Consultas(){
    const consultas = {        
        color: "dark",
        backgroundColor: "yellow",
        padding:"20px 20px 20px 40px",
        flexDirection: "column",
        width:"35%"
    }
    const consultascontainer = {
        width:"100%",
        display:"flex",
        justifyContent:"center",
        marginBottom: "10px"

    }
    const links={
        color: "darkred"
    }
    return (<div style={consultascontainer}>
                <div style={consultas}>
                    <p>Sites para consulta:</p>
                    <ul>
                        <li>HTMS- <a style={links} href="https://www.w3schools.com/REACT/DEFAULT.ASP
">https://www.w3schools.com/REACT/</a></li>
                        <li>HTMS- <a style={links} href="https://www.w3schools.com/html/">https://www.w3schools.com/html/</a></li>
                        <li>CSS- <a style={links} href="https://www.w3schools.com/css/">https://www.w3schools.com/css/</a></li> 
                        <li>JavaScript- <a style={links} href="https://www.w3schools.com/js/">https://www.w3schools.com/js/</a></li>
                    </ul>
                </div>
            </div>)
}
function Rodape() {

    const rodape = {
        color: "dark",
        backgroundColor: "bisque",
        width: "100%",
        display: "flex",
        justifyContent: "space-between",
        alignItems: "center",
    }

    const textomenor = {
        fontFamily: "Comic Sans MS",
        fontSize: "15pt"
    }

    const imagem = {
        width: "6%"
    }

    return (
        <div style={rodape}>
            <img
                style={imagem}
                alt=""
                src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRuTqzYEV1OdNSCwaaYRqImexL9Wo9Zc6MvqQJZbMaHjw&s=10"
            />

            <p style={textomenor}>
                Desejamos um excelente semestre a todos.
            </p>

            <img
                style={imagem}
                alt=""
                src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNrurcR0ZLYAWuQp1Pwhc8FwY7weNpfBqzk2ITA3U5rg&s=10"
            />
        </div>
    )
}
const container = document.getElementById("root");
const root = createRoot(container);
root.render(<App/>);