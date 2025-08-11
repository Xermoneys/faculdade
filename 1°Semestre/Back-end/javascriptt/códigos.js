let Lab= prompt('Digite Lab: ')
Lab = parseFloat(Lab);
let AVAL = prompt("Digite Avaliação Semestral: ")
AVAL = parseFloat(AVAL);
let Exame=prompt("Digite Exame Final: ")
Exame = parseFloat(Exame);

let media = (Lab*2+AVAL*3+Exame*5)/10
console.log("Sua média é: "+media);

let conceito;
if(media >=8.0 && media<=10.0){
    conceito ="A";
}else if(media>=7.0 && media<8.0){
    conceito ="B";
}else if(media>= 6.0 && media<7.0){
    conceito = "C";
}else if(media>= 5.0 && media < 6.0){
    conceito = "D";
}else{
    conceito = "E"
}
alert("Seu conceito é: "+conceito);