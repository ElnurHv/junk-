import java.util.Scanner;

public class sas {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Enter a sentence (or type 'exit' to quit): ");
                String input = scanner.nextLine().trim(); // Trim to remove leading and trailing whitespace

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the game. Goodbye!");
                    break;
                }

                if (input.isEmpty()) {
                    System.out.println("Please enter a valid sentence.");
                    continue;
                }

                String[] words = input.split("\\s+"); // Split the sentence into words

                for (String word : words) {
                    System.out.print(reverseWord(word) + " ");
                }
                System.out.println(); // Print a new line after reversing the sentence
            }

            scanner.close();
        }

        public static String reverseWord(String word) {
            StringBuilder reversed = new StringBuilder(word);
            return reversed.reverse().toString();
        }
    }


