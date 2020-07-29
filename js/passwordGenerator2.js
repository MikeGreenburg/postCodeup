// User input variables:
let enter;
let confirmNumber;
let confirmChar;
let confirmUppercase;
let confirmLowercase;


// Special characters
char = ["!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "=", ",", "-", ".", "/", "|", "\:", "\;", "<", ">", "?", "[", "]", "`", "~", "{", "}", "\\"];

// Numeric characters
number = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];

// Alphabetical characters
alpha = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"];

// Space for Uppercase conversion
space = [];

// Declared outside if statement can be concat upon condition
let selection;

// converts alpha to uppercase
let toUpper = function (x) {
    return x.toUpperCase();
};
// variable for uppercase conversion
alpha2 = alpha.map(toUpper);

let get = document.querySelector("#generate");

get.addEventListener("click", function () {
    pswd = generatePassword();
    document.getElementById("password").placeholder = pswd;
});

// Start function to generate password
function generatePassword() {
    // Asks for user input
    enter = parseInt(prompt("How many characters would you like your password? Choose between 8 and 128"));
    // First if statement for user validation
    if (!enter) {
        alert("you need to enter a value");
    } else if (enter < 8 || enter > 128) {
        // Validates user input
        // Start user input prompts
        enter = parseInt(prompt("you must choose between 8 but no more than 128 characters"));

    } else {
        // Continues once user input is validated
        confirmNumber = confirm("Will this contain numbers?");
        confirmChar = confirm("Will this contain special characters?");
        confirmUppercase = confirm("Will this contain Uppercase letters?");
        confirmLowercase = confirm("Will this contain Lowercase letters?");
    }

    // Else if for 4 negative options
    if (!confirmChar && !confirmNumber && !confirmUppercase && !confirmLowercase) {
        selection = alert("you must choose a password with numbers, lowercase, uppercase, special characters")

    }
        // if statement user input prompts to determine selection
    // Else if for 4 positive options
    else if (confirmChar && confirmNumber && confirmUppercase && confirmLowercase) {

        selection = char.concat(number, alpha, alpha2);
    }
    // Else if for 3 positive options
    else if (confirmChar && confirmNumber && confirmUppercase) {
        selection = char.concat(number, alpha2);
    }
    else if (confirmChar && confirmNumber && confirmLowercase) {
        selection = char.concat(number, alpha);
    }
    else if (confirmChar && confirmLowercase && confirmUppercase) {
        selection = char.concat(alpha, alpha2);
    }
    else if (confirmNumber && confirmLowercase && confirmUppercase) {
        selection = number.concat(alpha, alpha2);
    }
    // Else if for 2 positive options
    else if (confirmChar && confirmNumber) {
        selection = char.concat(number);

    } else if (confirmChar && confirmLowercase) {
        selection = char.concat(alpha);

    } else if (confirmChar && confirmUppercase) {
        selection = char.concat(alpha2);
    }
    else if (confirmLowercase && confirmNumber) {
        selection = alpha.concat(number);

    } else if (confirmLowercase && confirmUppercase) {
        selection = alpha.concat(alpha2);

    } else if (confirmNumber && confirmUppercase) {
        selection = number.concat(alpha2);
    }
    // Else if for 1 positive option
    else if (confirmChar) {
        selection = char;
    }
    else if (confirmNumber) {
        selection = number;
    }
    else if (confirmLowercase) {
        selection = alpha;
    }
    // Space variable fill uppercase conversion
    else if (confirmUppercase) {
        selection = space.concat(alpha2);
    };

    // password variable array placeholder user generated length
    let password = [];


    // Rand selection for variables:
    for (let i = 0; i < enter; i++) {
        let pickSelection = selection[Math.floor(Math.random() * selection.length)];
        password.push(pickSelection);
    }
    // joins password array converts to string
    let pswd = password.join("");
    UserInput(pswd);
    return pswd;
}
    // Puts password value in textbox
    function UserInput(pswd) {
    document.getElementById("password").textContent = pswd;

}

    //creates copy to clipboard
let copy = document.querySelector("#copy");
copy.addEventListener("click", function () {
    copyPassword();
});

function copyPassword() {
    document.getElementById("password").select();
    document.execCommand("Copy");
    alert("Password copied to clipboard!");
}



















