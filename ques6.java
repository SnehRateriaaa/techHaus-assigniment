import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the strings separated by commas
        System.out.print("Enter the strings separated by commas: ");
        String input = scanner.nextLine();

        // Split the input string into individual strings
        String[] strings = input.split(",\\s*");

        // Find the string with the most number of vowels
        String maxVowelString = findMaxVowelString(strings);

        // Print the result
        System.out.println("String with the most number of vowels: " + maxVowelString);

        scanner.close();
    }

    public static String findMaxVowelString(String[] strings) {
        String maxVowelString = "";
        int maxVowelCount = 0;

        for (String str : strings) {
            int vowelCount = countVowels(str);
            if (vowelCount > maxVowelCount) {
                maxVowelCount = vowelCount;
                maxVowelString = str;
            }
        }

        return maxVowelString;
    }

    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
