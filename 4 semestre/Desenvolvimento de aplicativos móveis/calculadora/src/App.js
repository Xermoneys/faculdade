import { useState } from "react";

function Botao({ display, onClick }) {
  const estilo = {
    width: "70px",
    height: "60px",
    margin: "4px",
    fontWeight: "bold",
    fontSize: "20px",
    cursor: "pointer"
  };

  return (
    <button style={estilo} onClick={onClick}>
      {display}
    </button>
  );
}

function Calculadora() {
  const [display, setDisplay] = useState("0");
  const [numero1, setNumero1] = useState("");
  const [operacao, setOperacao] = useState("");

  function adicionarNumero(numero) {
    if (display === "0") {
      setDisplay(numero);
    } else {
      setDisplay(display + numero);
    }
  }

  function selecionarOperacao(op) {
    setNumero1(parseFloat(display));
    setOperacao(op);
    setDisplay("0");
  }

  function calcular() {
    const numero2 = parseFloat(display);
    let resultado;

    if (operacao === "+") {
      resultado = numero1 + numero2;
    } 
    else if (operacao === "-") {
      resultado = numero1 - numero2;
    } 
    else if (operacao === "*") {
      resultado = numero1 * numero2;
    } 
    else if (operacao === "/") {
      resultado = numero2 !== 0
    }

    setDisplay(String(resultado));
    setNumero1("");
    setOperacao("");
  }

  function limpar() {
    setDisplay("0");
    setNumero1("");
    setOperacao("");
  }

  return (
    <div>
      <h1>Calculadora</h1>
      <div style={{
          width: "280px",
          height: "60px",
          border: "1px solid black",
          marginBottom: "10px",
          fontSize: "30px",
          textAlign: "right",
          padding: "10px",
          boxSizing: "border-box"
        }}
      >
        {display}
      </div>

      
      <div>
        <Botao display="7" onClick={() => adicionarNumero("7")} />
        <Botao display="8" onClick={() => adicionarNumero("8")} />
        <Botao display="9" onClick={() => adicionarNumero("9")} />
        <Botao display="/" onClick={() => selecionarOperacao("/")} />
      </div>

      <div>
        <Botao display="4" onClick={() => adicionarNumero("4")} />
        <Botao display="5" onClick={() => adicionarNumero("5")} />
        <Botao display="6" onClick={() => adicionarNumero("6")} />
        <Botao display="*" onClick={() => selecionarOperacao("*")} />
      </div>

      <div>
        <Botao display="1" onClick={() => adicionarNumero("1")} />
        <Botao display="2" onClick={() => adicionarNumero("2")} />
        <Botao display="3" onClick={() => adicionarNumero("3")} />
        <Botao display="-" onClick={() => selecionarOperacao("-")} />
      </div>

      <div>
        <Botao display="0" onClick={() => adicionarNumero("0")} />
        <Botao display="C" onClick={limpar} />
        <Botao display="=" onClick={calcular} />
        <Botao display="+" onClick={() => selecionarOperacao("+")} />
      </div>
    </div>
  );
}

function App() {
  return (
    <div>
      <Calculadora/>
    </div>
  );
}

export default App;