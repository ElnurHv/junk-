import java.util.InputMismatchException;
import java.util.Scanner;





    class InvalidGradeException extends Exception {
        public InvalidGradeException(String message) {
            super(message);
        }
    }

    public class StudentGrades {
        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numberOfStudents = 0;

            System.out.print("Enter the number of students: ");
            try {
                numberOfStudents = scanner.nextInt();
                if (numberOfStudents <= 0) {
                    throw new IllegalArgumentException("Number of students must be greater than zero.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer value for the number of students.");
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }

            int[] grades = new int[numberOfStudents];
            int sum = 0;
            int highest = Integer.MIN_VALUE;
            int lowest = Integer.MAX_VALUE;

            for (int i = 0; i < numberOfStudents; i++) {
                System.out.print("Enter grade for student " + (i + 1) + ": ");
                try {
                    int grade = scanner.nextInt();
                    if (grade < 0 || grade > 100) {
                        throw new InvalidGradeException("Grade must be between 0 and 100.");
                    }
                    grades[i] = grade;
                    sum += grade;
                    if (grade > highest) {
                        highest = grade;
                    }
                    if (grade < lowest) {
                        lowest = grade;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer value for the grade.");
                    scanner.next(); // clear the invalid input
                    i--; // retry the current iteration
                } catch (InvalidGradeException e) {
                    System.out.println(e.getMessage());
                    i--; // retry the current iteration
                }
            }

            double average = (double) sum / numberOfStudents;
            System.out.println("Average grade: " + average);
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
        }
    }


