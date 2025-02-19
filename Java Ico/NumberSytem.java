import java.util.*;

public class NumberSytem {
    public static void main(String[] args) {
        // Example usage of the new conversion method
        String conversionType = "binary-to-decimal";
        String numberInput = "1010";
        String result = convertNumber(conversionType, numberInput);
        System.out.println("Result: " + result);
    }

    public static String convertNumber(String conversionType, String numberInput) {
        String result = "";

        switch (conversionType) {
            case "binary-to-octal":
                result = Integer.toOctalString(Integer.parseInt(numberInput, 2));
                break;
            case "binary-to-decimal":
                result = Integer.toString(Integer.parseInt(numberInput, 2));
                break;
            case "binary-to-hexadecimal":
                result = Integer.toHexString(Integer.parseInt(numberInput, 2));
                break;
            case "octal-to-binary":
                result = Integer.toBinaryString(Integer.parseInt(numberInput, 8));
                break;
            case "octal-to-decimal":
                result = Integer.toString(Integer.parseInt(numberInput, 8));
                break;
            case "octal-to-hexadecimal":
                result = Integer.toHexString(Integer.parseInt(numberInput, 8));
                break;
            case "decimal-to-binary":
                result = Integer.toBinaryString(Integer.parseInt(numberInput));
                break;
            case "decimal-to-octal":
                result = Integer.toOctalString(Integer.parseInt(numberInput));
                break;
            case "decimal-to-hexadecimal":
                result = Integer.toHexString(Integer.parseInt(numberInput));
                break;
            case "hexadecimal-to-binary":
                result = Integer.toBinaryString(Integer.parseInt(numberInput, 16));
                break;
            case "hexadecimal-to-octal":
                result = Integer.toOctalString(Integer.parseInt(numberInput, 16));
                break;
            case "hexadecimal-to-decimal":
                result = Integer.toString(Integer.parseInt(numberInput, 16));
                break;
            default:
                result = "Invalid conversion type";
        }

        return result;
    }
}
