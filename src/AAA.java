import java.util.Random;

public class AAA {



        private String[] symbols = {"cherry", "lemon", "peach", "seven", "melon", "grape"};

        public void pullLever() {
            Random random = new Random();
            String[] result = new String[3];

            // Randomly select three symbols
            for (int i = 0; i < 3; i++) {
                int index = random.nextInt(symbols.length);
                result[i] = symbols[index];
            }

            // Print the outcome of the lever pull
            System.out.println("Result of the lever pull: " + result[0] + " - " + result[1] + " - " + result[2]);

            // Determine if the user wins or loses
            if (result[0].equals(result[1]) && result[1].equals(result[2])) {
                System.out.println("Congratulations! You win!");
            } else {
                System.out.println("Sorry, you lose. Better luck next time!");
            }
        }

        public static void main(String[] args) {
            AAA slotMachine = new AAA();
            slotMachine.pullLever();
        }
    }


