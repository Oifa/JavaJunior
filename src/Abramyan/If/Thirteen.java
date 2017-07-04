package Abramyan.If;

/**
 * Created by oifa on 03.07.2017.
 */
public class Thirteen {
    public static void main(String[] args) {
        int a = 20, b = 100, c = 3;
        if (a < b && a > c || a < c && a > b) {
            System.out.println(a);
        }
        if (b < c && b > a || b < c && b > a) {
            System.out.println(b);
        }
        if (c < a && c > b || c < b && c > a) {
            System.out.println(c);
        }
    }
}
