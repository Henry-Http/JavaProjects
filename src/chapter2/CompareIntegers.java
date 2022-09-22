package chapter2;

public class CompareIntegers {
    public int SquareOfNUm(int num) {
        return num * num;
    }

    public  boolean numIsLessThan100(int num) {
        return  num < 100;
    }


    public boolean NumIsGreaterThan100(int num) {
        return num > 100 ;
    }

    public boolean NumIsNotEqualTo100(int num) {
        return num != 100;
    }

    public boolean NumIsEqualTo100(int num) {
        return num == 100;
    }

    public boolean squareOfNumIsEqualTo100(int num) {
        int square = num *num;
        return square == 100;
    }

    public boolean squareOfNumIsNotEqualTo100(int num) {
        int square = num *num;
        return square != 100;
    }

    public boolean squareOfNumIsGreaterThan100(int num) {
        int square = num *num;
        return square > 100;
    }

    public boolean squareOfNumIsLessThan100(int num) {
        int square = num *num;
        return square < 100;
    }
}
