function drawDot(x, y, R) {
    const canvas = document.getElementById("shedule");
    let context = canvas.getContext("2d");
    console.log(x)
    console.log(y)
    console.log(R)
    context.fillStyle = 'green';
    context.beginPath();
    x = 240 + x * 80 / R * 2;
    y = 250 - y * 80 / R * 2;
    context.arc(x, y, 3, 0, 2 * Math.PI);
    context.fill();
}