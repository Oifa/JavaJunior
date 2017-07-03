package Abramyan.If;

/**
 * Created by oifa on 03.07.2017.
 */
public class Three {
    public static void main(String[] args) {
        int num = 0;
        if (num == 0) {
            num = 10;
        }
        if (num > 0) {
            num++;
        }
        else {
            num -= 2;
        }
        System.out.println(num);
    }
}

