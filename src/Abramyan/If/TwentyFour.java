package Abramyan.If;

import java.math.*;
/**
 * Created by oifa on 04.07.2017.
 */
public class TwentyFour {
    public static void main(String[] args) {
        double x = 2.0, f = 0.0;
        if (x > 0) {
            f = 2 * Math.sin(x);
        }
        if (x <= 0) {
            f = 6 - x;
        }
        System.out.println("f(x) = " + f);
    }
}
