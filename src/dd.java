import java.util.Random;
import java.util.Scanner;

public class dd {



        private String[] symbols = {"cherry", "lemon", "peach", "seven", "melon", "grape"};
        private String[] result = new String[3];
        private int balance;
        private int costPerPull;
        private int payoutRate;

        public dd(int initialBalance, int costPerPull, int payoutRate) {
            this.balance = initialBalance;
            this.costPerPull = costPerPull;
            this.payoutRate = payoutRate;
        }

        public void play(int times) {
            if (times <= 0) {
                System.out.println("Invalid number of plays. Please enter a positive number.");
                return;
            }

            for (int i = 0; i < times; i++) {
                pullLever();
                if (balance <= 0) {
                    System.out.println("Insufficient balance. Game over.");
                    break;
                }
            }

            System.out.println("Final balance: " + balance);
        }

        private void pullLever() {
            if (balance < costPerPull) {
                System.out.println("Insufficient balance for another play.");
                return;
            }

            Random random = new Random();

            for (int i = 0; i < result.length; i++) {
                result[i] = symbols[random.nextInt(symbols.length)];
            }

            System.out.println("Result of the lever pull: " + result[0] + " - " + result[1] + " - " + result[2]);

            if (result[0].equals(result[1]) && result[1].equals(result[2])) {
                int winAmount = costPerPull * payoutRate;
                System.out.println("Congratulations! You win " + winAmount + " credits!");

            } else {
                System.out.println("Sorry, you lose " + costPerPull + " credits. Better luck next time!");
                balance -= costPerPull;
            }

            System.out.println("Your current balance: " + balance);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your initial balance:");
            int initialBalance = scanner.nextInt();

            int costPerPull = 2;
            System.out.println("cost per pull:"+costPerPull);
            int payoutRate = 5;
            System.out.println("payout rate: "+payoutRate);

            dd slotMachine = new dd(initialBalance, costPerPull, payoutRate);

            System.out.println("How many times do you want to play?");
            int times = scanner.nextInt();

            slotMachine.play(times);

            scanner.close();
        }
    }


