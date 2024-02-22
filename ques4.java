import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the sorted array
        System.out.print("Enter the sorted array (comma-separated): ");
        String input = scanner.nextLine();

        // Split the input string into individual numbers
        String[] numbersStr = input.split(",\\s*");

        // Check if the array is empty
        if (numbersStr.length == 0) {
            System.out.println("The array is empty. Median: -1.0");
        } else {
            // Convert the numbers from string to double and store them in an array
            double[] numbers = new double[numbersStr.length];
            for (int i = 0; i < numbersStr.length; i++) {
                numbers[i] = Double.parseDouble(numbersStr[i]);
            }

            // Find the median of the array
            double median = findMedian(numbers);

            // Print the result
            System.out.println("Median: " + median);
        }

        scanner.close();
    }

    public static double findMedian(double[] numbers) {
        int n = numbers.length;
        if (n == 0) {
            return -1.0; // Return -1.0 if the array is empty
        } else if (n % 2 == 0) {
            // If the array has an even number of elements, calculate the average of the middle two elements
            int midIndex1 = n / 2 - 1;
            int midIndex2 = n / 2;
            return (numbers[midIndex1] + numbers[midIndex2]) / 2.0;
        } else {
            // If the array has an odd number of elements, return the middle element
            return numbers[n / 2];
        }
    }
}

