package Abramyan.If;

/**
 * Created by oifa on 04.07.2017.
 */
public class Fifteen {
    public static void main(String[] args) {
        int a = 10, b = 2, c = 4, s = 0;
        if (a < b && a > c || a > b && a > c || a < c && a > b) {
            if (b < a && b > c || b > a && b > c || b < c && b > a) {
                s = a + b;
                System.out.println(s);
            }
        }

        if (b < a && b > c || b > a && b > c || b < c && b > a) {
            if (c < a && c > b || c > a && c > b || c < b && c > a) {
                s = b + c;
                System.out.println(s);
            }
        }

        if (c < a && c > b || c > a && c > b || c < b && c > a) {
            if (a < b && a > c || a > b && a > c || a < c && a > b) {
                s = c + a;
                System.out.println(s);
            }
        }
    }
}
