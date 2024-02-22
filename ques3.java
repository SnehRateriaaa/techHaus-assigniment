import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Find the larger number
        double largerNumber = findLarger(num1, num2);

        // Print the result
        System.out.println("The larger number is: " + largerNumber);

        scanner.close();
    }

    public static double findLarger(double num1, double num2) {
        // Use ternary operator to find the larger number
        return (num1 > num2) ? num1 : num2;
    }
}
