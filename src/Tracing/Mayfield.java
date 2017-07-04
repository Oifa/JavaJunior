package Tracing;

/**
 * Created by oifa on 03.07.2017.
 */
public class Mayfield {
    public static void main(String[] args) {
        double dOne = 1.5;
        double dTwo = 3.1;
        double total = 0.0;

        for (int i = 0; i <= 3; i++) {
            if (i <= dOne) {
                total = total + getSum(dOne, dTwo);
            } else {
                total = total + getSum(total, dOne);
            }
        }
        System.out.println("Total: " + total);
    }

    public static double getSum(double numOne, double numTwo) {
        double sum;
        System.out.println("The two value are: " + numOne + " and " + numTwo);
        sum = numOne + numTwo;
        return sum;
    }
}
