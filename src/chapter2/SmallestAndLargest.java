package tdd;

//Write an application that inputs three integers from the
// user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
// shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
// representation of the average. So, if the sum of the values is 7, the average should be 2, not 2.3333….]
import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number1 = input.nextInt();
        System.out.println("Enter your number: ");
        int number2 = input.nextInt();
        System.out.println("Enter your number: ");
        int number3 = input.nextInt();

        int sum = number1+number2+number3;
        double average = sum/3;
        int product = number1 * number2 * number3;

        System.out.printf("""
                Your numbers: %d, %d, %d
                Their sum is %d
                Their product is %d
                 and average is %3f.\s""", number1, number2, number3, sum,product, average);
        if (number1 > number2) {
            System.out.println(" and the first number is the largest");
        }  if (number1 > number3) {
            System.out.println("and the second number is the largest");
        }  if (number1 > number3) {
            System.out.println("and the third number is the largest");
        }

    }
}
