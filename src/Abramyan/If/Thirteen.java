package Abramyan.If;

/**
 * Created by oifa on 03.07.2017.
 */
public class Thirteen {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        if (a < b && b < c && c < a) {
            System.out.println(a);
        }
        if (b < c && c < a && a < b) {
            System.out.println(b);
        }
        if (c < a && b < a && a < b) {
            System.out.println(c);
        }
    }
}
