//Build a number-base converter supporting binary, decimal, octal, and hexadecimal.

import java.util.Scanner;

public class hwp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        //String just incase the user inputs a number with letters for hexadecimals
        System.out.print("Enter the base of the number (2, 8, 10, 16): ");
        int base = scanner.nextInt();

        int decimalValue = convertToDecimal(input, base);
        System.out.println("Decimal value: " + decimalValue);

        System.out.println("Binary: " + Integer.toBinaryString(decimalValue));
        System.out.println("Octal: " + Integer.toOctalString(decimalValue));
        System.out.println("Hexadecimal: " + Integer.toHexString(decimalValue).toUpperCase());
    }

    // Method to convert a number from a given base to decimal
    private static int convertToDecimal(String input, int base) {
        int decimal = 0;
        int power = 1;

        // Process the input string from right to left
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            int digit;

            // Convert character to its numeric value0
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' + 10;
            } else if (c >= 'a' && c <= 'f') {
                digit = c - 'a' + 10;
            } else {
                throw new IllegalArgumentException("Invalid character in input");
            }

            // Check if the digit is valid for the given base
            if (digit >= base) {
                throw new IllegalArgumentException("Digit is not valid for the specified base");
            }

            decimal += digit * power;
            power *= base;
        }

        return decimal;
    }
}
