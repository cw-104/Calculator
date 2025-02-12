import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = keyboardInput.nextInt();
        System.out.print("Enter y: ");
        int y = keyboardInput.nextInt();

        keyboardInput.nextLine();

        System.out.print("What operation would you like to perform? : Addition(+) or Subtraction(-): ");
        String operator = keyboardInput.nextLine();

        // Operation handling
        switch (operator) {

            case "Addition":
            case "+":
                int sum = x + y;
                System.out.println("Sum: " + sum);
                break;
            case "Subtraction":
            case "-":
                int difference = x - y;
                System.out.println("Difference: " + difference);
            default:
                System.out.println("Error: invalid operator.");
                keyboardInput.close();
                return;
        }

    }
}