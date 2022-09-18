package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void depositMoneyTest(){
        //(precondition) given i have an account
        Account hodAccount1 = new tdd.Account();
        // (action) when i deposit 3000
        hodAccount1.deposit(3000);
        // (assert) check that my balance increases by 3000
        int balance = hodAccount1.getBalance();
        assertEquals(3000, balance);
    }

    @Test
    public void negativeDepositShouldNotWorkTest(){
        //(precondition) given i have an account
        //and given that my balance is 10000
        tdd.Account hodAccount1 = new tdd.Account();
        hodAccount1.deposit(10000);
        assertEquals(10000, hodAccount1.getBalance());
        //(action) when i deposit - 5000
        hodAccount1.deposit(-5000);
        assertEquals(10000, hodAccount1.getBalance());
    }

    @Test
    public void withdrawMoneyTest() {
        //(Precondition) Given that I have an account
        tdd.Account hodAccount1 = new tdd.Account();
        //I have money in my account
        hodAccount1.deposit(1000);
        //when i Withdraw 500
        hodAccount1.withdraw(500);
        //Check if balance is 500
        assertEquals(500, hodAccount1.getBalance());
    }

//    @Test
//    public void withdrawingAboveBalanceFailsTest() {
//        //(Precondition) Given that I have an account
//        tdd.Account1 hodAccount1 = new tdd.Account1();
//        //I have  money in my account
//        hodAccount1.deposit(1000);
//        //When i withdraw 7000
//        hodAccount1.withdraw(7000);
//        assertEquals(1000, hodAccount1.getBalance());
//    }



}