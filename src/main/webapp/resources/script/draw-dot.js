function drawDot(x, y, R, result) {
    console.log("start")
    const canvas = document.getElementById("shedule");
    let context = canvas.getContext("2d");
    if (result === "No") context.fillStyle = 'red';
    else context.fillStyle = 'green';
    console.log(124)
    context.beginPath();
    x = 240 + x * 80 / R * 2;
    y = 250 - y * 80 / R * 2;
    context.arc(x, y, 3, 0, 2 * Math.PI);
    context.fill();
    console.log("end")
}