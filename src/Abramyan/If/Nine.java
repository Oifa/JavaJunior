package Abramyan.If;

/**
 * Created by oifa on 03.07.2017.
 */
public class Nine {
    public static void main(String[] args) {
        float a = 5, b = 3, d = 0, e = 0;
        if (a > b) {
            if (b < a) {
                d = a - b;
                e = b + a;
                a = d;
                b = e;
            }
        }
        System.out.println("A: " + d + "\nB: " + e);
    }
}
