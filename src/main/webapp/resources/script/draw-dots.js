function drawDots(listX, listY, listR, listResult, flag) {
    if (!flag) {
        for (let i = 0; i < listX.length; i++) {
            drawDot(listX[i], listY[i], listR[i], listResult[i])
        }
    }
    else {
        for (let i = 0; i < listX.length; i++) {
            drawDot(listX[i], listY[i], listR[i], listResult)
        }
    }
}