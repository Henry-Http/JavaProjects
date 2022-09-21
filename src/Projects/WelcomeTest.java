package Projects;

import java.util.Scanner;

public class WelcomeTest {

    public static class Welcome1 {
        public static void main(String[] args) {
            int thisIsAVariable = 0;
            int q76354 = 0;
            int number = 0;
            System.out.println("Enter value 1");
            Scanner input = new Scanner(System.in);
            int value = input.nextInt();
            System.out.println("Enter you new value");
            int value2 = input.nextInt();
            int addValue = value + value2;
            System.out.printf("Your total\n sum is %d%n", addValue);
        }
    }

}
