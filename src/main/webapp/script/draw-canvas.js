drawCanvas("R");

function drawCanvas(R) {

    const canvas = document.getElementById("shedule");
    let context = canvas.getContext("2d");


    let R1 = R;
    let R2 = "R/2";
    let R3 = "-R/2";
    let R4 = "-R";
    if (R !== "R") {
        R2 = String(R / 2);
        R3 = String(-R / 2);
        R4 = String(-R);
    }

    context.fillStyle = "#EEE"

    context.fillRect(0, 0, 500, 500);

    context.fillStyle = "#0048ff"

    context.fillRect(80, 90, 160, 160);

    context.beginPath();
    context.moveTo(240, 250)
    context.lineTo(160, 250);
    context.lineTo(240, 410);
    context.fill();

    context.beginPath();
    context.arc(240, 250, 160, 3* Math.PI/2, 2*Math.PI);
    context.lineTo(240, 250);
    context.fill();

    context.lineWidth = 2.0;
    context.beginPath();
    context.moveTo(240, 10);
    context.lineTo(240, 500);
    context.lineTo(240, 250);
    context.lineTo(490, 250);
    context.lineTo(0, 250);
    context.stroke();


    // ���� ��� ���������
    context.fillStyle = "#000";
    context.font = 'bold 13px Arial';
    context.fillText("Y", 250, 10);
    context.fillText(R1, 250, 95);
    context.fillText(R2, 250, 175);
    context.fillText(R3, 252, 335);
    context.fillText(R4, 252, 413);
    
    for(let i = 1; i <= 5; i++) {
        context.beginPath();
        context.moveTo(250, 10 + i * 80);
        context.lineTo(230, 10 + i * 80);
        context.stroke();
    }
    context.fillStyle = '#000';
    context.beginPath();
    context.moveTo(240, 0);
    context.lineTo(235, 10);
    context.lineTo(245, 10);
    context.lineTo(240, 0);
    context.stroke();

    context.fillText("X", 490, 270);
    context.fillText(R1, 395, 270);
    context.fillText(R2, 310, 270);
    context.fillText(R3, 148, 270);
    context.fillText(R4, 72, 270);
    for(let i = 1; i <= 5; i++) {
        context.beginPath();
        context.moveTo(80 * i, 260);
        context.lineTo(80 * i, 240);
        context.stroke();
    }
    context.fillStyle = '#000';
    context.beginPath();
    context.moveTo(500, 250);
    context.lineTo(490, 245);
    context.lineTo(490, 255);
    context.lineTo(500, 250);
    context.stroke();

    drawDots();
}