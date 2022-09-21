package Projects;

import java.util.Scanner;

public class UserSelection {
    public static void main(String[] args) {
        int userChoice;


        do{
            Scanner input= new Scanner(System.in);
            System.out.println("Enter first number: ");
            int firstNumber= input.nextInt();
            System.out.println("Enter second number: ");
            int secondNumber= input.nextInt();
            int total = firstNumber+secondNumber;
            System.out.println("Total = " +total);

            System.out.println("If you Would like to continue press: 1 \nIf not press: 0 ");
            userChoice = input.nextInt();
            if (userChoice != 1 && userChoice != 0) {
                System.out.println("Please enter 1 or 0");
                userChoice = input.nextInt();
            }
        }while(userChoice == 1);

    }
}
