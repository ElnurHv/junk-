import java.util.Scanner;

public class ee {





        public enum ShapeType {
            CIRCLE(5),
            RECTANGLE(10),
            TRIANGLE(15);

            private int points;

            ShapeType(int points) {
                this.points = points;
            }

            public int getPoints() {
                return points;
            }
        }

        public double calculateCircleArea(double radius) {
            return Math.PI * Math.pow(radius, 2);
        }

        public int calculateRectangleArea(int length, int width) {
            return length * width;
        }

        public double calculateTriangleArea(int sideLength) {
            return Math.pow(sideLength, 2) * Math.sqrt(3) / 4;
        }

        public static void main(String[] args) {
            ee calculator = new ee();
            Scanner scanner = new Scanner(System.in);
            int score = 0;

            while (true) {
                System.out.println("Enter a shape (circle, rectangle, triangle, or quit to exit):");
                String shapeInput = scanner.next();

                if (shapeInput.equalsIgnoreCase("quit")) {
                    break;
                }

                ShapeType shapeType = null;
                switch (shapeInput) {
                    case "circle":
                        shapeType = ShapeType.CIRCLE;
                        break;
                    case "rectangle":
                        shapeType = ShapeType.RECTANGLE;
                        break;
                    case "triangle":
                        shapeType = ShapeType.TRIANGLE;
                        break;
                    default:
                        System.out.println("Invalid shape. Try again!");
                        continue;
                }

                System.out.println("Enter the dimensions:");
                double area = 0;
                switch (shapeType) {
                    case CIRCLE:
                        System.out.print("Radius: ");
                        double radius = scanner.nextDouble();
                        area = calculator.calculateCircleArea(radius);
                        break;
                    case RECTANGLE:
                        System.out.print("Length: ");
                        int length = scanner.nextInt();
                        System.out.print("Width: ");
                        int width = scanner.nextInt();
                        area = calculator.calculateRectangleArea(length, width);
                        break;
                    case TRIANGLE:
                        System.out.print("Side length: ");
                        int sideLength = scanner.nextInt();
                        area = calculator.calculateTriangleArea(sideLength);
                        break;
                }

                System.out.println("Area:"+ area);
                score += shapeType.getPoints();
                System.out.println("Score: " + score);
            }

            System.out.println("Final score: " + score);
        }
    }


