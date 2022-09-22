package chapter6;

public class OverloadSample {

    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
    public double addNumbers(int num3, double num4) {
        return num3 + num4;
    }
    public double addNumbers(double num5, double num6) {
        return num5 + num6;
    }
    public double addNumbers(double num7, int num8) {
        return num7 + num8;
    }


    public static void main(String[] args) {
        OverloadSample overload = new OverloadSample();

        System.out.println(overload.addNumbers(2,2));
        System.out.println(overload.addNumbers(2,2.0));
        System.out.println(overload.addNumbers(2.0,2.5));
        System.out.println(overload.addNumbers(2.9,2));
    }
}
