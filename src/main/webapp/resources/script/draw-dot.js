function drawDot(x, y, R, result) {
    const canvas = document.getElementById("shedule");
    let context = canvas.getContext("2d");
    let hit = (y >= x - R / 2 & x >=0 & 0 >= y) ||  (((R/2) * (R/2) - x * x)) ** 0.5 >= y & x >=0 & y >= 0 || (x >= -R & R >= y & 0 >= x & y >= 0);
    console.log(R);
    if (hit) result = "Yes";
    else result = "No";
    if (result === "No") context.fillStyle = 'red';
    else context.fillStyle = 'green';
    context.beginPath();
    x = 240 + x * 80 / R * 2;
    y = 250 - y * 80 / R * 2;
    context.arc(x, y, 3, 0, 2 * Math.PI);
    context.fill();
}