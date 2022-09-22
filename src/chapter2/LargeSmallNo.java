package chapter2;

public class LargeSmallNo {
    public int sum(int num1 , int num2 , int num3 ) {
        return num1 +num2 + num3;
    }

    public int average( int num1 , int num2 ,int num3) {
        return ( num1 +num2 + num3)/3 ;
    }

    public int product(int num1 , int num2, int num3){
        return num1 * num2 * num3;
    }

    public boolean largestNo1(int num1 , int num2, int num3 ) {


        return  num1> num2;
    }

    public boolean largestNo2(int num1, int num2, int num3) {
        if ((num2 > num1 && num2 > num3));
        return true;
    }
}
