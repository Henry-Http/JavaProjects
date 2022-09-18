package tdd;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        int fixedNumber = 8;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your guess");

        int guessNumber = input.nextInt();
        if (fixedNumber == guessNumber) System.out.println("correct");
        else {
            int count = 1;
            while (guessNumber != fixedNumber) {
                if (guessNumber > fixedNumber) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Too low");
                }
                System.out.println("Enter your guess");
                guessNumber = input.nextInt();
                count++;

                if(count ==3){
                    System.out.println("Good Bye");
                    break;
                }
            }
        }


        // if answer is correct, stop loop
        // else 3 chances


//    int count = 2;
//    while (count <= 10) {
//        System.out.println(count + "");
//        count = count +2 ;
//    }
    }
}
