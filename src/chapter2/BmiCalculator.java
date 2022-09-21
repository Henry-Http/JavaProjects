package chapter2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weightInKg;
        double heightInMeters;
        System.out.println("Enter your weight");
        weightInKg = input.nextInt();
        System.out.println("Enter your height");
        heightInMeters = input.nextDouble();

        double bmi = weightInKg / (heightInMeters * heightInMeters);

        if (bmi >= 18 && bmi <25) {
            System.out.println("Your B.M.I is: " + bmi + ", You are in excellent shape!");
        }

            if (bmi >=30) {
                System.out.println("Your B.M.I is: " + bmi + ", Please take better care of yourself, You are Obese");


            }
            if (bmi >= 25 && bmi < 30) {
                System.out.println("Your B.M.I is: " + bmi + ", You are over weight!");
            }  else if (bmi < 18){
                System.out.println("Your B.M.I is: " + bmi + " and you are under weight, please see a nutritionist");
            }

    }
}
