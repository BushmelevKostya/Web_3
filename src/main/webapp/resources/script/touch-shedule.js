var canvas = document.getElementById("shedule");
canvas.addEventListener('click', function (e) {
    let R = "R";
    const RData = document.getElementById("form:r").value;
    if (RData !== "") R = RData;
    if (R === "R") {
        alert("Impossible to define coordinate! Try choosing a radius")
    } else {
        R = Number(R) / 2;
        const x = (((event.offsetX - 240) / 80) * R).toFixed(0);
        const y = ((-(event.offsetY - 250) / 80) * R).toFixed(4);
        document.getElementById('form:x').value = x;
        document.getElementById('form:y').value = y;
        document.getElementById("form:submit-button").click();
    }
});