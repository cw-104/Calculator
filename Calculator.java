import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = keyboardInput.nextDouble();
        System.out.print("Enter y: ");
        double y = keyboardInput.nextDouble();

        keyboardInput.nextLine();

        System.out.print(
                "What operation would you like to perform? : Addition(+), Subtraction(-), Multiplication(*), or Division(/): ");
        String operator = keyboardInput.nextLine();

        // Operation handling
        switch (operator) {

            case "Addition":
            case "+":
                double sum = x + y;
                System.out.println("Sum: " + sum);
                break;
            case "Subtraction":
            case "-":
                double difference = x - y;
                System.out.println("Difference: " + difference);
                break;
            case "Multiplication":
            case "*":
                double product = x * y;
                System.out.println("Product: " + product);
                break;
            case "Division":
            case "/":
                double quotient = x / y;
                if (y == 0) {
                    System.out.println("Divide by Zero Error.");
                    break;

                } else {
                    System.out.println("Quotient: " + quotient);
                    break;
                }
            default:
                System.out.println("Error: invalid operator.");
                keyboardInput.close();
                return;
        }

    }
}