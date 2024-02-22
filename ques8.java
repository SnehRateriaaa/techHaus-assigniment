import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of seconds
        System.out.print("Enter the number of seconds: ");
        long seconds = scanner.nextLong();

        // Calculate the time equivalent
        String timeEquivalent = calculateTimeEquivalent(seconds);

        // Print the result
        System.out.println("Time equivalent: " + timeEquivalent);

        scanner.close();
    }

    public static String calculateTimeEquivalent(long seconds) {
        // Calculate days
        long days = seconds / (24 * 3600);
        seconds = seconds % (24 * 3600);

        // Calculate hours
        long hours = seconds / 3600;
        seconds = seconds % 3600;

        // Calculate minutes
        long minutes = seconds / 60;
        seconds = seconds % 60;

        // Format the result
        return days + " Day(s) " + hours + " Hour(s) " + minutes + " Minute(s) " + seconds + " Second(s)";
    }
}
