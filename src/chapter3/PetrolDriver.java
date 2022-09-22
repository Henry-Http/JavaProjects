package chapter3;

import java.util.Scanner;

public class PetrolDriver {
    static Petrol petrol = new Petrol("Lagos", "Fuel", 20, 189, 10);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Station location: ");
        String stationLocation = input.nextLine();

        System.out.print("\nEnter petrol type: ");
        String petrolType = input.nextLine();

        System.out.print("\nEnter amount of litres: ");
        int quantity = input.nextInt();


        System.out.print("\nEnter price per litre: ");
        double pricePerLitre = input.nextDouble();

        System.out.print("\nEnter percentage discount: ");
        double percentageDiscount = input.nextDouble();

       // Petrol petrolPurchase = new Petrol(stationLocation, petrolType, quantity, pricePerLitre, percentageDiscount);


        // print petrol details
        printPetrolDetails(petrol);

        // print purchase amount after discount
        System.out.printf("%n%nNet purchase amount is %.2f%n", petrol.getPurchaseAmount());

        System.out.print("\n \nChange Station location: ");
        stationLocation = input.nextLine();
        petrol.setLocation(stationLocation);

        System.out.print("\nChange petrol type: ");
        petrolType = input.nextLine();
        petrol.setPetrolType(petrolType);

        System.out.print("\nChange amount of litres: ");
        quantity = input.nextInt();
        petrol.setQuantity(quantity);

        System.out.print("\nChange price per litre: ");
        pricePerLitre = input.nextDouble();
        petrol.setPricePerLitre(pricePerLitre);

        System.out.print("\nChange percentage discount: ");
        percentageDiscount = input.nextDouble();
        petrol.setPercentageDiscount(percentageDiscount);

        // print petrol details
        printPetrolDetails(petrol);

        // print purchase amount after discount
        System.out.printf("%n%nNet purchase amount is %.2f%n", petrol.getPurchaseAmount());
    }

    public static void printPetrolDetails (Petrol petrol){
        System.out.printf("%n%nPetrol station location is: %s%n", petrol.getLocation());
        System.out.printf("Petrol type is: %s%n", petrol.getPetrolType());
        System.out.printf("Quantity of petrol is: %d litres%n", petrol.getQuantity());
        System.out.printf("Petrol price per liter is: %.2f%n", petrol.getPricePerLitre());
        System.out.printf("Percentage discount of: %.2f percent%n", petrol.getPercentageDiscount());

    }
}
