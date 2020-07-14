"use strict";

function clock(){
    const fullDate = new Date();
    let hour = fullDate.getHours();
    let minute = fullDate.getMinutes();
    let second = fullDate.getSeconds();

    if (hour<10) {
        hour = "0" + hour;
    }

    if (minute < 10){
        minute = "0" + minute;
    }

    if (second < 10){
        second = "0" + second;
    }

    document.getElementById('hour').innerHTML = hour + ":";
    document.getElementById('minute').innerHTML = minute + ":";
    document.getElementById('second').innerHTML = second;

    setInterval(clock, 1000);
}

clock();


