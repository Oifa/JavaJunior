package Abramyan.If;

/**
 * Created by oifa on 03.07.2017.
 */
public class Five {
    public static void main(String[] args) {
        int a = 2, b = -33, c = 10, d = 0, e = 0;
        if (a > 0 || b > 0 || c > 0) {
            if (a > 0) {
                d++;
            }
            else {
                e++;
            }
            if (b > 0) {
                d++;
            }
            else {
                e++;
            }
            if (c > 0) {
                d++;
            }
            else {
                e++;
            }
        }
        System.out.println("Positive: " + d + "\nNegative: " + e);
    }

}
