import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is a two-digit special integer
        boolean isSpecial = isTwoDigitSpecial(number);

        // Print the result
        if (isSpecial) {
            System.out.println(number + " is a two-digit special integer.");
        } else {
            System.out.println(number + " is not a two-digit special integer.");
        }

        scanner.close();
    }

    public static boolean isTwoDigitSpecial(int number) {
        if (number >= 10 && number <= 99) {
            int tensDigit = number / 10;
            int onesDigit = number % 10;
            int sum = tensDigit + onesDigit + (tensDigit * onesDigit);
            return sum == number;
        } else {
            return false;
        }
    }
}


