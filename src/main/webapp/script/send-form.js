function send(press_value) {
    this.form['press_button'].value = press_value;

    drawCanvas(press_value);

    document.getElementById("R-data").innerText = press_value;
}