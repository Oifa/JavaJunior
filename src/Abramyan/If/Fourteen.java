package Abramyan.If;

/**
 * Created by oifa on 04.07.2017.
 */
public class Fourteen {
    public static void main(String[] args) {
        int a = 10, b = 2, c = 3;
        if (a < b && a < c) {
            System.out.println(a);
        }
        if (b < a && b < c) {
            System.out.println(b);
        }
        if (c < a && c < b) {
            System.out.println(c);
        }

        if (a > b && a > c) {
            System.out.println(a);
        }
        if (b > a && b > c) {
            System.out.println(b);
        }
        if (c > a && c > b) {
            System.out.println(c);
        }
    }
}
