package tdd;

public class Account {
    private int balance;


    public void deposit(int amount) {
        if (amount > 0)
            balance = balance + amount;

    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
    }

//    public static class Calculator {
//        public int addTwoNumbers(int num1, int num2) {
//            return num1 + num2;
//        }
//
//        public int minusTwoNumbers(int  num1, int num2) {
//
//            return num1 - num2;
//        }
//
//        public int multiplyTwoNumbers(int num1, int num2) {
//            return num1 * num2;
//        }
//
//        public int divide(int num1, int num2) {
//            return num1 / num2;
//        }
//    }
}
