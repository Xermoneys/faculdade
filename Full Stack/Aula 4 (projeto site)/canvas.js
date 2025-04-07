

function desenhar_quadrado(ctx,x,y,w,h,c){
    ctx.beginPath();
    ctx.fillStyle = c
    ctx.fillRect(x,y,w,h);
    ctx.closePath();
}
function desenhar_arco(ctx,a,b,c,d,e,color,f,g,){
    ctx.beginPath()
    ctx.arc(a, b, c, d, e * Math.PI);
    ctx.fillStyle = color;
    ctx.fill();
    ctx.lineWidth = f;
    ctx.strokeStyle = g;
    ctx.stroke();
}
function desenhar_triangulo(ctx,a,b,c,d,e,f,cor,color,i){
    ctx.beginPath()
    ctx.moveTo(a,b);
    ctx.lineTo(c,d);
    ctx.lineTo(e,f);
    ctx.strokeStyle = cor
    ctx.fillStyle = color
    ctx.fill(i);
    ctx.stroke();
}
canvas = document.getElementById("canvas");
ctx = canvas.getContext("2d");

desenhar_quadrado(ctx,0,230,299,100,"grey") //chão
desenhar_quadrado(ctx,0,210,40,200,"#65a1dd") //agua cima pra baixo
desenhar_quadrado(ctx,30,260,100,40,"#65a1dd") //agua esquerda pra direita
desenhar_quadrado(ctx,40,190,17,42,"#9a5e22") //arvore esquerda
desenhar_quadrado(ctx,260,220,17,42,"#9a5e22") //arvore direita
desenhar_quadrado(ctx,120,140,80,90,"#9a5e22") //casa
desenhar_quadrado(ctx,168,160,25,25,"lightskyblue"); //janela esquerda
desenhar_quadrado(ctx,128,160,25,25,"lightskyblue"); //janela direita
desenhar_quadrado(ctx,153,187,17,43,"#503c28") //porta
desenhar_triangulo(ctx,120,140,158,90,200,140,"#ff7f3a","#ff7f3a")//telhado
desenhar_arco(ctx,240,70,35,0,2,"yellow",4,"yellow")//sol
desenhar_arco(ctx,268,210,20,0,2,"green",4,"green")//folhas arvore direitra
desenhar_arco(ctx,48,180,20,0,2,"green",4,"green")//folhas arvore esquerda
desenhar_arco(ctx,8,219,30,0,2,"#65a1dd",4,"#65a1dd")//agua
desenhar_arco(ctx,120,291.2,30,0,2,"#65a1dd",4,"#65a1dd")//agua
ctx.moveTo(100,20);
ctx.lineTo(180,100);
ctx.lineTo(20,100);
ctx.lineTo(100,20);