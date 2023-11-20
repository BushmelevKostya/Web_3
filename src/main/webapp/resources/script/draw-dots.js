function drawDots(listX, listY, listR) {
    for (let i = 0; i < listX.length; i++) {
        drawDot(listX[i], listY[i], listR[i])
    }
    drawDot(1, 1, 1)
}