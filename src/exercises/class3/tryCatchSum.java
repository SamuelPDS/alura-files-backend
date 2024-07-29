package exercises.class3;

import java.util.Scanner;

public class tryCatchSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digit the first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Digit the second number");
        int secondNumber = scanner.nextInt();

        try {

        int sum =  firstNumber / secondNumber;
            System.out.println("The sum is:" + sum);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
