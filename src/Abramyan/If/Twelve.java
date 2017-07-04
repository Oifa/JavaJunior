package Abramyan.If;

/**
 * Created by oifa on 03.07.2017.
 */
public class Twelve {
    public static void main(String[] args) {
        int a = 40, b = 72, c = 12;
        //if (a < b || a < c || b < c) {
            if (a < b && a < c) {
                System.out.println(a);
            }
            if (b < a && b < c) {
                System.out.println(b);
            }
            if (c < a && c < b) {
                System.out.println(c);
            }
       // }
    }
}
