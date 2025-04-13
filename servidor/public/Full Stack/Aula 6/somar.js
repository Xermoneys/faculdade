function SOMAR(id1,id2){
    var num1 = document.getElementById(id1).value;
    var num2 = document.getElementById(id2).value;
    num1 = parseInt(num1);
    num2 = parseInt(num2);
    alert("Resultado: "+(num1 + num2));
}