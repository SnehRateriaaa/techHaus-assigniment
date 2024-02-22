import java.util.*;

public class ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create a PriorityQueue to store the elements in descending order
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            pq.offer(num);
        }

        // Discard the largest element
        pq.poll();

        // Find the second largest number
        int secondLargest = pq.peek();

        // Print the result
        System.out.println("The second largest number in the array is: " + secondLargest);

        scanner.close();
    }
}
