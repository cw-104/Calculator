import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = keyboardInput.nextDouble();
        System.out.println("Enter y: ");
        double y = keyboardInput.nextDouble();

        double sum = x + y;

        System.out.println("Sum of x + y = " + sum);

    }
}