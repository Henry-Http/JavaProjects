package tdd;


import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int userNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        userNumber = input.nextInt();

        boolean check = true;

        for (int i = 2; i < userNumber/2; i++) {
            if (userNumber % i == 0) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println(userNumber+  " is a prime number");
        } else {
            System.out.print(userNumber + " is not a prime number");
        }
    }


}
