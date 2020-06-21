const celsiusInput = document.querySelector('#celsius > input');
const fahrenheitInput = document.querySelector('#fahrenheit > input');
const kelvinInput = document.querySelector('#kelvin > input');

function celsiusToFahrenheitAndKelvin(){
        const cTemp = parseFloat(celsiusInput.value);
        const fTemp = (cTemp * (9/5)) + 32;
        const kTemp = cTemp + 273.15;
        fahrenheitInput.value = fTemp;
        kelvinInput.value = kTemp;
}

function fahrenheitToCelsiusAndKelvin() {
    const fTemp = parseFloat(fahrenheitInput.value);
    const cTemp = (fTemp - 32) * (5/9);
    const kTemp = (fTemp + 459.67) * 5/9;
    celsiusInput.value = cTemp;
    kelvinInput.value = kTemp;
}
celsiusInput.addEventListener('input', celsiusToFahrenheitAndKelvin );
fahrenheitInput.addEventListener('input', fahrenheitToCelsiusAndKelvin);
kelvinInput.addEventListener('input', fahrenheitToCelsiusAndKelvin);
