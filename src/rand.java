import java.util.Random;
import java.util.Scanner;

public class rand {




        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Step 1: Define a Scanner object to read input from the user
            System.out.print("Enter the length of the password: ");

            // Step 3: Read the length of the password from the user
            int length = scanner.nextInt();

            // Step 4: Pass the length of the password to the generateRandomPassword method
            String password = generateRandomPassword(length);

            // Print the generated password
            System.out.println("Generated Password: " + password);

            // Close the scanner
            scanner.close();
        }

        // Method to generate a random password of the specified length
        public  String generateRandomPassword(int length) {
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
            Random random = new Random();
            StringBuilder password = new StringBuilder();

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(characters.length());
                password.append(characters.charAt(index));
            }

            return password.toString();
        }
    }


