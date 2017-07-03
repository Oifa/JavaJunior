package Schildt;

/**
 * tracing loops in java
 */



public class Loops {
    public static void main(String[] args) {

        final int MIN = 10, MAX = 20;
        int num = 15;

        //while
        while (num < MAX) {
            System.out.println(num);
            num = num + 1;
        }

        while (num < MAX) {
            num = num + 1;
            System.out.println(num);
        }

        do {
            num = num + 1;
            System.out.println(num);
        } while (num <= MAX);

        while (num < MAX) {
            System.out.println(num);
            num = num - 1;
        }

        while (num > MIN) {
            System.out.println(num);
            num = num - 1;
        }


        do {
            num = num + 1;
            if (num*2 > MAX+num) {
                System.out.println(num);
            }
        }
        while (num <= MAX);


    }
}
