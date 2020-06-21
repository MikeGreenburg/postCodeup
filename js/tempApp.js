const celciusInput = document.querySelector('#celcius > input');
const fahrenheitInput = document.querySelector('#farhrenheit > input');
const kelvinInput = document.querySelector('#kelvin > input');

celciusInput.addEventListener('input', function() {
    const cTemp = parseFloat(celciusInput.value);
    const fTemp = (cTemp * (9/5)) + 32;
    const kTemp = cTemp + 273.15;
    fahrenheitInput.value = fTemp;
    kelvinInput.value = kTemp;
});
