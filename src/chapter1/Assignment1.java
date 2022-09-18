package chapter1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] arg) {
	  Scanner input = new Scanner(System.in);

	  System.out.println("Enter a value for feet:  ");
	  double feet = input.nextDouble();
	  double meters = feet * 0.305;

	  System.out.println(feet + " feet is " + meters + " meters");


   }

}