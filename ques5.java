import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the income
        System.out.print("Enter the income: ");
        // Read the input as a string to handle commas
        String incomeStr = scanner.nextLine();
        // Remove commas from the input
        String incomeWithoutCommas = incomeStr.replaceAll(",", "");
        // Parse the income to double
        double income = Double.parseDouble(incomeWithoutCommas);

        // Compute the income tax
        double tax = computeIncomeTax(income);

        // Print the result
        System.out.println("Income Tax: Rs. " + tax);

        scanner.close();
    }

    public static double computeIncomeTax(double income) {
        double tax = 0;

        if (income <= 250000) {
            tax = 0;
        } else if (income > 250000 && income <= 500000) {
            tax = 0.1 * (income - 250000);
        } else if (income > 500000 && income <= 1000000) {
            tax = 0.1 * (500000 - 250000) + 0.2 * (income - 500000);
        } else {
            tax = 0.1 * (500000 - 250000) + 0.2 * (1000000 - 500000) + 0.3 * (income - 1000000);
        }

        return tax;
    }
}
