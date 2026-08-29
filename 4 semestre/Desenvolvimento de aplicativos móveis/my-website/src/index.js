import React from "react";
import {createRoot} from "react-dom/client"

function App(){
        const cor = {
            backgroundColor: "lightgrey"
        }
    return (
        
        <div style={cor}>
            
            <Titulo/>
            <Cabeçalho/>
            <Introduçao/>
            <Livros/>
            <VideoFEI/>
            {/* {//<Mapa/>}
            <Contatos/>
            <//Rodape/>   */}
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
function Cabeçalho(){
    const cabeçalho = {
        display: 'flex',
        color: "darkred",
        justifyContent: "space-evenly",        
        backgroundColor: "lightskyblue",
        alignItems: "center",
        textAlign: "center",
        fontSize:"20PX",
        
    } 
    return <p style={cabeçalho}>
        <a href="">HOME</a>
        <a href="">LIVROS</a>
        <a href="">VÍDEOS</a>
        <a href="">CONTATOS</a>
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
    return (<div><p style={textoMaior}> Introdução</p>
    <p style={textoMenor}>Com o React, você cria interfaces organizadas em componentes reutilizáveis, que controlam tanto a exibição quanto o comportamento da aplicação. Ele permite atualizar elementos de forma dinâmica, sem recarregar a página inteira, além de facilitar a aplicação de estilos, animações e recursos interativos de maneira escalável.
    </p>
<p style={textoMenor}>O React é uma das bibliotecas mais populares do ecossistema JavaScript e tornou-se
referência no desenvolvimento de interfaces modernas. Sua principal força está na criação de componentes reutilizáveis, que tornam o código mais organizado e facilitam a construção de aplicações escaláveis e de fácil manutenção.</p></div>)
    
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
const textoMaior = {
        color: "dark",
        textAlign:"center",
        fontSize: "25pt",
        fontFamily:"SansSerif",
    }
    const video={
        width: "25%",
        display: "flex",
        textAlign: "center"

    }
    return (<div>
        <p style={textoMaior}>Aprenda React na FEI</p>
    <iframe style={video} src="https://www.youtube.com/embed/4MHAOPxcnsQ"></iframe>
            </div>)
}
// function Mapa(){

// }
// function Contatos(){

// }
// function Rodape(){

// }
const container = document.getElementById("root");
const root = createRoot(container);
root.render(<App/>);