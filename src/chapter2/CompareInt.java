package chapter2;

import java.util.Scanner;

public class CompareInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = input.nextInt();

        int squareNumber = number * number;

        if (number < 100) {
            System.out.printf("Your number is %d and is less than 100\n", number);
        } else if (number == 100) {
            System.out.printf("Your number is %d and is equal to 100\n", number);
        }  if (number> 100) {
            System.out.printf("Your number is %d and is greater than 100\n", number);
        } if (number != 100) {
            System.out.printf("Your number is %d and is not equal to 100\n", number);
        } if (squareNumber > 100) {
            System.out.printf("Your square number is %d and is greater than 100\n", squareNumber);
        } else if (squareNumber == 100) {
            System.out.printf("Your square number is %d and is equal to 100\n", squareNumber);
        } if (squareNumber < 100) {
            System.out.printf("Your square number is %d and is less than 100\n", squareNumber);
        } else if (squareNumber != 100) {
            System.out.printf("Your square number is %d and is not equal to 100", squareNumber);
        }

    }
}
