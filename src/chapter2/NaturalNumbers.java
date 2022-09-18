package tdd;

import java.util.Scanner;

public class NaturalNumbers {

    public static void main(String[] args) {

        /*int count = 10;
        int add = 0;
        int i;
        for (i = 1; i <= count; ++i) {
            add = add + i;
        }
           System.out.println("The sum of the first 10 numbers is: " + add);*/
        double feet = 0;
        int inches;
        int count = 0;
        for (inches =1; inches <= 20; inches++) {
            feet = inches / 12.0;
            count++;

            if (count == 4 ) {
                System.out.println();
                count = 0;
            }
            System.out.println(inches + " Inch is equal to " + feet + " feet.");

        }


    }

}
