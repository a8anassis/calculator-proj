package gr.aueb.cf.calculator.ch2;

public class SubCalculator {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int result = 0;

        result = sub(num1, num2);

        System.out.println("Result: " + result);
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
