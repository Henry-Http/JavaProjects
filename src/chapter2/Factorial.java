package tdd;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        long fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userNumber = input.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            fact = fact * i;
        }
        System.out.printf("Factorial of %d is %d: ", userNumber, fact);
    }

}
