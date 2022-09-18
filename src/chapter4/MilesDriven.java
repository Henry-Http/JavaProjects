package chapter4;

import java.util.Scanner;

public class MilesDriven {

    public static void main(String[] args) {


        int userOut = 0;
        int miles = 0;
        int gallon = 0;
        double milesPerGallon = 0;
        double average = 0;
        int count = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Miles driven or -1 to exit: ");
            miles = input.nextInt();
            System.out.println("Enter gallons used or -1 to  exit: ");
            gallon = input.nextInt();
            milesPerGallon = (double) miles / gallon;
            count++;
            System.out.println("Gas mileage is: " + milesPerGallon);

            System.out.println("Enter any number to add more values or\nenter -1 to exit ");
            userOut = input.nextInt();


            if (userOut == -1) {

                average = milesPerGallon/count;
                System.out.println("The average miles/gallon is: " + average);

            }
        }
        while ( userOut != -1);

    }

}
