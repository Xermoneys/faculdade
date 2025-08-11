
canvas = document.getElementById("canvas");
ctx = canvas.getContext("2d");

ctx.beginPath();
ctx.fillStyle = "red";
ctx.fillRect(0, 0, 50, 50);
ctx.closePath();

ctx.beginPath();
ctx.fillStyle = "blue";
ctx.fillRect(350,0,50, 50);
ctx.closePath();

ctx.beginPath();
ctx.fillStyle = "yellow"
ctx.fillRect(0,350,50,50)
ctx.closePath()

ctx.beginPath();
ctx.fillStyle = "green"
ctx.fillRect(350,350,50,50)
ctx.closePath()

ctx.beginPath();
ctx.strokeStyle = "red"
ctx.moveTo(0,0);
ctx.lineWidth = 2
ctx.lineTo(399,399);
ctx.stroke()
ctx.closePath();

ctx.beginPath();
ctx.strokeStyle = "blue"
ctx.moveTo(399,0);
ctx.lineWidth = 2
ctx.lineTo(0,399);
ctx.stroke()
ctx.closePath();

ctx.beginPath();
ctx.strokeStyle = "green"
ctx.moveTo(0,200);
ctx.lineWidth = 2
ctx.lineTo(400,200)
ctx.stroke()
ctx.closePath();

ctx.beginPath();
ctx.fillStyle = "black"
ctx.AlignItems = "center"
ctx.font = "20px Arial";
ctx.fillText("Desenvolvimento Web",100,80)
ctx.closePath();

ctx.beginPath();
ctx.lineWidth = 2;
ctx.fillStyle = 'green';
ctx.arc(200,200,50,0*Math.PI,1*Math.PI);
ctx.stroke();
ctx.closePath();

ctx.beginPath();
ctx.arc(70, 125, 20, 0, 2 * Math.PI);
ctx.fillStyle = "yellow";
ctx.fill();
ctx.lineWidth = 2;
ctx.strokeStyle = "green";
ctx.stroke();
ctx.closePath();

ctx.beginPath();
ctx.arc(340, 125, 20, 0, 2 * Math.PI);
ctx.fillStyle = "yellow";
ctx.fill();
ctx.lineWidth = 2;
ctx.strokeStyle = "green";
ctx.stroke();
ctx.closePath();