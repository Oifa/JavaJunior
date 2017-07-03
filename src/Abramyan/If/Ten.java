package Abramyan.If;

/**
 * Created by oifa on 03.07.2017.
 */
public class Ten {
    public static void main(String[] args) {
        int a = 5, b = 5, s = 0;
        if (a != b) {
            s = a + b;
            a = s;
            b = s;
        }
        else {
            a = s;
            b = s;
        }
        System.out.println("A: " + a + "\nB: " + b);
    }
}
