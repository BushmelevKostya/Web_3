window.addEventListener('load',function () {
  const Months = {
    1 : "JANUARY",
    2 : "FEBRUARY",
    3 : "MART",
    4 : "APRIL",
    5 : "MAY",
    6 : "JUNE",
    7 : "JULY",
    8 : "AUGUST",
    9 : "SEPTEMBER",
    10 : "OCTOBER",
    11 : "NOVEMBER",
    12 : "DECEMBER"
  }
  const getLastDigit = (x) => parseInt(x % 10);
  const getFirstFigit = (x) => parseInt(x / 10);
  setInterval(() => {
    var today = new Date()
    var hours = today.getHours()
    var minutes = today.getMinutes()
    var seconds = today.getSeconds()

    $(".second-second").css({
      'transform':'rotateY(90deg) rotate('+getLastDigit(seconds)*36+'deg)',
    });

    $(".second-first").css({
      'transform':'rotateY(90deg) rotate('+getFirstFigit(seconds)*36+'deg)',
    });

    $(".minute-second").css({
      'transform':'rotateY(90deg) rotate('+getLastDigit(minutes)*36+'deg)',
    });

    $(".minute-first").css({
      'transform':'rotateY(90deg) rotate('+getFirstFigit(minutes)*36+'deg)',
    });

    $(".hour-second").css({
      'transform':'rotateY(90deg) rotate('+getLastDigit(hours)*36+'deg)',
    });

    $(".hour-first").css({
      'transform':'rotateY(90deg) rotate('+getFirstFigit(hours)*36+'deg)',
    });

    var year = today.getFullYear();
    var month = today.getMonth()
    var day = today.getDay()
    document.getElementsByClassName("year")[0].innerHTML = year.toString();
    document.getElementsByClassName("month")[0].innerHTML = Months[month];
    document.getElementsByClassName("day")[0].innerHTML = day.toString();
  }, 1000);
});
