"use strict";

function clock(){
    const fullDate = new Date();
    let hour = fullDate.getHours();
    let minutes = fullDate.getMinutes();
    let seconde = fullDate.getSeconds();

    if (hour<10) {
        hour = "0" + hour;
    }

    if (minutes < 10){
        minutes = "0" + minutes;
    }

    if (second < 10){
        second = "0" + second;
    }
}


