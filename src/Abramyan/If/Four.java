package Abramyan.If;

/**
 * Created by oifa on 03.07.2017.
 */
public class Four {
    public static void main(String[] args) {
        int a = -1, b = 3, c = 5, d = 0;
        if (a > 0 || b > 0 || c > 0) {
            //if (a > 0 && b > 0 || a > 0 && c > 0 || b > 0 && c > 0)
            if (a > 0) {
                d++;
            }
            if (b > 0) {
                d++;
            }
            if (c > 0) {
                d++;
            }

        }

        System.out.println("Positive: " + d);
    }
}
