import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // here i prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Count the number of digits
        int numDigits = countDigits(number);

        // Print the result
        System.out.println("Number of digits: " + numDigits);

        scanner.close();
    }

    public static int countDigits(int number) {
        // Convert the number to its absolute value
        number = Math.abs(number);
        // Convert the number to a string and then count the digits
        int numDigits = String.valueOf(number).length();
        return numDigits;
    }
}
