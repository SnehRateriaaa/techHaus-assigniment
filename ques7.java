import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the retail inflation rate
        System.out.print("Enter the retail inflation rate (in percentage): ");
        double inflationRate = scanner.nextDouble();

        // Prompt the user to enter the number of years
        System.out.print("Enter the number of years: ");
        int numYears = scanner.nextInt();

        // Calculate the compounded retail inflation
        double compoundedInflation = calculateCompoundedInflation(inflationRate, numYears);

        // Print the result
        System.out.println("Compounded retail inflation after " + numYears + " years: " + compoundedInflation + "%");

        scanner.close();
    }

    public static double calculateCompoundedInflation(double inflationRate, int numYears) {
        // Convert inflation rate from percentage to fraction
        double rate = inflationRate / 100.0;

        // Calculate compounded inflation using the formula (1 + rate)^numYears
        double compoundedInflation = Math.pow(1 + rate, numYears) - 1;

        // Convert compounded inflation to percentage
        compoundedInflation *= 100;

        return compoundedInflation;
    }
}
