package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.println("Enter first number");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter Second number");
            int secondNumber = scanner.nextInt();

            System.out.println("Please enter one of the symbol + , _ , * , /");
            char symbol = scanner.next().charAt(0);

            calculator.calculateresult(firstNumber, secondNumber, symbol);

            System.out.println("Would you like to do more calculation? Please enter “Y” or “N”: ");
            char response = scanner.next().charAt(0);

            if (response == 'N' || response == 'n') {
                continueCalculation = false;
            }

        }

        scanner.close();
    }
}

