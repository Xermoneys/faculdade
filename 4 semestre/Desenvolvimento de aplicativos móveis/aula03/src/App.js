// import logo from './logo.svg';
// import './App.css';
// import {useState} from "react";


// function Saudacao(props){
//   return <h1>Olá, {props.nome}!</h1>
// }

// function Perfil({nome, idade, cidade }) {
//    return (
//      <div>
//       <h2>{nome}</h2>
//       <p>Idade: {idade}</p>
//       <p>Cidade: {cidade}</p>
//     </div>
//   );
//  }

//  function Card({nome, idade, profissao}) {
//       const estilo = {
//         border: "1px solid #ccc",
//         borderRadius: "8px",
//         padding: "16px",
//         margin: "8px",
//         width: "200px",
//         display: "inline-block"
//       };
//       return (
//         <div style={estilo}>
//           <h3>{nome}</h3>
//           <p>Idade: {idade}</p>
//           <p>Profissao: {profissao}</p>
//         </div>
//         );
//   }
// function Contador() {
//     const estilo = {
//         border: "1px solid #b12727ff",
//          borderRadius: "20px",
//          padding: "40px",
//          margin: "8px",
//          width: "300px",
//          display: "inline-block"

//     }
//     const botaoestilo = {
//       border: "none",
//       fontWeight: "bold",
//       color: "black",
//       padding: "15px 32px",
//       textAlign: "center",
//       textDecoration: "none",
//       display: "inline-block",
//       fontSize: "16px",
//       margin: "4px 2px",
//       cursor: "pointer"
//     }
//     const [valor, setValor] = useState(0);
//       function incrementar() {
//       setValor(valor + 1);
//       }
//       function decrementar() {
//         if (valor < 0)
//           setValor(valor - 1);
//       }
//       function zerar() {
//       setValor(0);
//       }
//     return (
//       <div style={estilo}>
//         <h3>Contagem: {valor}</h3>
//         <div style={{display: "inline-block"}}>
//           <button style = {botaoestilo} onClick={incrementar}>Incrementar</button>
//           <button style = {botaoestilo} onClick={zerar}>Zerar</button>
//           <button style = {botaoestilo} onClick={decrementar}>Decrementar</button>
//         </div>
//       </div>
//     );
// }

// function CampoTexto(){
//     const [texto, setTexto] = useState("");

//     function handleChange(evento){
//       setTexto(evento.target.value);
//     }
//   return (
//     <div>
//       <input type="text" onChange={handleChange}
//       placeholder="Digite algo" />
//         <p>Você digitou: {texto}</p>
//     </div>
//   );
// }


function App() {
  return (
    <div>
      {/* <Saudacao nome = "Maria"></Saudacao>
      <Saudacao nome = "João"></Saudacao>
      <Perfil nome = "Bruno" 
              idade={30} 
              cidade="São Paulo">      
      </Perfil>

      <div>
        <h1>Lista de Pessoas</h1>
        <Card
          nome="Ana Silva"
          idade={28}
          profissao="Engenheira"
        />
        <Card
          nome="Bruno Costa"
          idade={35}
          profissao="Designer"
        />
        <Card
          nome="Carla Lima"
          idade={22}
          profissao="Estudante"
        />
        
      </div> */}
      {/* <Contador></Contador>
      <CampoTexto></CampoTexto> */}
    </div>
  );
}


export default App;
