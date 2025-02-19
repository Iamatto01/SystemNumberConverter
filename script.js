document.getElementById('converter-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const conversionType = document.getElementById('conversion-type').value;
    const numberInput = document.getElementById('number-input').value;
    let result = '';

    switch (conversionType) {
        case 'binary-to-octal':
            result = parseInt(numberInput, 2).toString(8);
            break;
        case 'binary-to-decimal':
            result = parseInt(numberInput, 2).toString(10);
            break;
        case 'binary-to-hexadecimal':
            result = parseInt(numberInput, 2).toString(16);
            break;
        case 'octal-to-binary':
            result = parseInt(numberInput, 8).toString(2);
            break;
        case 'octal-to-decimal':
            result = parseInt(numberInput, 8).toString(10);
            break;
        case 'octal-to-hexadecimal':
            result = parseInt(numberInput, 8).toString(16);
            break;
        case 'decimal-to-binary':
            result = parseInt(numberInput, 10).toString(2);
            break;
        case 'decimal-to-octal':
            result = parseInt(numberInput, 10).toString(8);
            break;
        case 'decimal-to-hexadecimal':
            result = parseInt(numberInput, 10).toString(16);
            break;
        case 'hexadecimal-to-binary':
            result = parseInt(numberInput, 16).toString(2);
            break;
        case 'hexadecimal-to-octal':
            result = parseInt(numberInput, 16).toString(8);
            break;
        case 'hexadecimal-to-decimal':
            result = parseInt(numberInput, 16).toString(10);
            break;
        default:
            result = 'Invalid conversion type';
    }

    document.getElementById('result').innerText = `Result: ${result}`;
});
