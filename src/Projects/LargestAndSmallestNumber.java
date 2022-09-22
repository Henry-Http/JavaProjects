package Projects;
import java.util.Scanner;


public class LargestAndSmallestNumber {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("enter number or -1 to quit:");
            int number = input.nextInt();
            int numberCounter=0;
            int largest=Integer.MIN_VALUE;
            int smallest=Integer.MAX_VALUE;

            while (number!= -1){
                if ( number > largest) {
                    largest = number;
                }
                if ( number < smallest){
                    smallest = number;
                }
                System.out.print("enter number or -1 to quit :");
                number = input.nextInt();
                numberCounter= numberCounter + 1;
            }
            System.out.printf("the numbers are %d and the largest and the smallest  number is : %d and %d ", numberCounter,largest,smallest);
        }
}
