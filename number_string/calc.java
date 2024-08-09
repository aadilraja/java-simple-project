package number_string;
import java.util.Scanner;

class Trigonometry {
    int x;
    Trigonometry(int x) {
        this.x = x;
    }

    double sin() {
        return Math.sin(Math.toRadians(x)); // Convert angle to radians
    }

    double cos() {
        return Math.cos(Math.toRadians(x)); // Convert angle to radians
    }

    double tan() {
        return Math.tan(Math.toRadians(x)); // Convert angle to radians
    }
}

class ArithmeticOperation {
    int x, y;
    ArithmeticOperation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void operations() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter an operation (+, -, *, /) or 'q' to quit:");
            char operation = scanner.next().charAt(0);
            char op = Character.toLowerCase(operation);

            if (op == 'q') {
                break;
            }
            try {
                switch (op) {
                    case '+':
                        System.out.println(x + y);
                        break;
                    case '-':
                        System.out.println(x - y);
                        break;
                    case '*':
                        System.out.println(x * y);
                        break;
                    case '/':
                        if (y != 0) {
                            System.out.println(x / (double) y);
                        } else {
                            System.out.println("Cannot divide by zero.");
                        }
                        break;
                    default:
                        System.out.println("Invalid operation.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter integers.");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}

class LogarithmicOperation {
    double x;
    LogarithmicOperation(double x) {
        this.x = x;
    }

    double log() {
        return Math.log10(x); // Base 10 logarithm
    }

    double ln() {
        return Math.log(x); // Natural logarithm (base e)
    }
}

class ExponentialOperation {
    double x;
    ExponentialOperation(double x) {
        this.x = x;
    }

    double exp() {
        return Math.exp(x); // e^x
    }

    double pow(double power) {
        return Math.pow(x, power); // x^power
    }
}

public class calc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Trigonometry Functions");
            System.out.println("2. Arithmetic Functions");
            System.out.println("3. Logarithmic Functions");
            System.out.println("4. Exponential Functions");
            System.out.println("5. Exit");

            int choice = s.nextInt();

            if (choice == 1) {
                System.out.print("Enter the angle in degrees: ");
                Trigonometry t1 = new Trigonometry(s.nextInt());
                System.out.println("Select a function:");
                System.out.println("1. Sin");
                System.out.println("2. Cos");
                System.out.println("3. Tan");
                int func = s.nextInt();
                if (func == 1) {
                    System.out.println("sin(" + t1.x + ") = " + t1.sin());
                } else if (func == 2) {
                    System.out.println("cos(" + t1.x + ") = " + t1.cos());
                } else if (func == 3) {
                    System.out.println("tan(" + t1.x + ") = " + t1.tan());
                } else {
                    System.out.println("Error: Invalid function.");
                }
            } else if (choice == 2) {
                System.out.print("Enter first number: ");
                int x = s.nextInt();
                System.out.print("Enter second number: ");
                int y = s.nextInt();
                ArithmeticOperation ao = new ArithmeticOperation(x, y);
                ao.operations();
            } else if (choice == 3) {
                System.out.print("Enter the number: ");
                double x = s.nextDouble();
                LogarithmicOperation logOp = new LogarithmicOperation(x);
                System.out.println("Select a function:");
                System.out.println("1. log10");
                System.out.println("2. ln");
                int func = s.nextInt();
                if (func == 1) {
                    System.out.println("log10(" + x + ") = " + logOp.log());
                } else if (func == 2) {
                    System.out.println("ln(" + x + ") = " + logOp.ln());
                } else {
                    System.out.println("Error: Invalid function.");
                }
            } else if (choice == 4) {
                System.out.print("Enter the base number: ");
                double x = s.nextDouble();
                ExponentialOperation expOp = new ExponentialOperation(x);
                System.out.println("Select a function:");
                System.out.println("1. exp(x)");
                System.out.println("2. x^power");
                int func = s.nextInt();
                if (func == 1) {
                    System.out.println("exp(" + x + ") = " + expOp.exp());
                } else if (func == 2) {
                    System.out.print("Enter the power: ");
                    double power = s.nextDouble();
                    System.out.println(x + "^" + power + " = " + expOp.pow(power));
                } else {
                    System.out.println("Error: Invalid function.");
                }
            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        s.close();
    }
}
