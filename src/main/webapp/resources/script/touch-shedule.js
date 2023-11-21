var canvas = document.getElementById("shedule");
canvas.addEventListener('click', function () {
    console.log(1)
    let R = "R";
    const RData = document.getElementById("form:r").value;
    if (RData !== "") R = RData;
    if (R === "R") {
        alert("Impossible to define coordinate! Try choosing a radius")
    } else {
        R = Number(R) / 2;
        const x = (((event.offsetX - 240) / 80) * R).toFixed(4);
        const y = ((-(event.offsetY - 250) / 80) * R).toFixed(4);
    }
});