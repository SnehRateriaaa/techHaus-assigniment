import java.text.DecimalFormat;
import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter net price and tax rate
        System.out.print("Enter net price of the product including taxes: ");
        double netPrice = scanner.nextDouble();
        System.out.print("Enter tax rate (in percentage): ");
        double taxRate = scanner.nextDouble();

        // Compute gross price before taxes
        double grossPrice = calculateGrossPrice(netPrice, taxRate);

        // Format output using DecimalFormat to display commas for thousands separator
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String formattedNetPrice = df.format(netPrice);
        String formattedGrossPrice = df.format(grossPrice);

        // Print the result
        System.out.println("Net Price: $" + formattedNetPrice);
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("Gross Price Before Taxes: $" + formattedGrossPrice);

        scanner.close();
    }

    public static double calculateGrossPrice(double netPrice, double taxRate) {
        // Convert tax rate from percentage to fraction
        double taxFraction = taxRate / 100.0;
        // Compute gross price before taxes
        double grossPrice = netPrice / (1 + taxFraction);
        return grossPrice;
    }
}
