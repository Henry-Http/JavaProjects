package tdd;

import java.util.Scanner;

public class HealthProfileDriver {
    public static void main(String[] args) {
        HealthProfile newPerson = new HealthProfile("James", "Brown","Male",
                                                    2, 11, 1900, 6.2,89);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter FirstName: ");
        newPerson.setFirstName(input.nextLine());
        System.out.println("Enter LastName: ");
        newPerson.setLastName(input.nextLine());

        String firstName = newPerson.getFirstName();
        String lastName = newPerson.getLastName();

//        System.out.println("Enter your day of birth: ");
//        newPerson.setDay(input.nextInt());
//        int dayOfBirth = newPerson.getDay();

//        System.out.println("Enter you year of birth: ");
//        newPerson.setYear(input.nextInt());
//        int yearOfBirth = newPerson.getYear();

        System.out.println("Enter you year of birth: ");
        newPerson.setYear(input.nextInt());
        int age = newPerson.getYear();


        System.out.println("Enter your gender: ");
        input.nextLine();
        newPerson.setGender(input.nextLine());
        String gender = newPerson.getGender();

        System.out.println("Enter your height in inches: ");
        newPerson.setHeight(input.nextDouble());
        double height = newPerson.getHeight();

        System.out.println("Enter your weight: ");
        newPerson.setWeight(input.nextDouble());
        double weight = newPerson.getWeight();
        double bmi = newPerson.getBmi();
        System.out.printf("""
                Hello, %s %s.
                Personal Information:
                Age: %d
                Gender: %s
                                
                Medical Information:
                Height: %.2f meters
                weight: %.2f KG
                                
                Your B.M.I is %.2f
                                
                BMI	           Weight Status
                Below 18.5	   Underweight
                18.5—24.9	   Healthy Weight
                25.0—29.9	   Overweight
                30.0+	       Obesity\040\040\040\040
                """, firstName, lastName, age, gender, height, weight , bmi);


    }
}
