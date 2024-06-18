public class math {
    // Original Code (not provided)

    // Improved Code:

        // Method Overloading for addition
        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // Method Overloading for subtraction
        public int subtract(int a, int b) {
            return a - b;
        }

        public double subtract(double a, double b) {
            return a - b;
        }

        // Method Overloading for multiplication


        // Method Overloading for division


        public static void main(String[] args) {
            math mathOperations = new math();

            // Testing addition methods
            System.out.println("Addition: 2 + 3 = " + mathOperations.add(2, 3));
            System.out.println("Addition: 2.5 + 3.5 = " + mathOperations.add(2.5, 3.5));
            System.out.println("Addition: 2 + 3 + 4 = " + mathOperations.add(2, 3, 4));

            // Testing subtraction methods
            System.out.println("Subtraction: 5 - 3 = " + mathOperations.subtract(5, 3));
            System.out.println("Subtraction: 5.5 - 3.5 = " + mathOperations.subtract(5.5, 3.5));

            // Testing multiplication methods

        }
    }

