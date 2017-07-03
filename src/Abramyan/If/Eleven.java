package Abramyan.If;

/**
 * Created by oifa on 03.07.2017.
 */
public class Eleven {
    public static void main(String[] args) {
        int a = 5, b = 10, s = 0;
        if (a != b ) {
            if (a > b) {
                b = a;
            }
            if (b > a) {
                a = b;
            }
        }
        else {
            a = s;
            b = s;
        }
        System.out.println(a + "\n" + b);
    }
}
