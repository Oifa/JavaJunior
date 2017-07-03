package Schildt;

public class If {
    public static void main(String[] args) {

        if (10 > 11) System.out.println("True");

        int a = 1, b = 5, v = 0;
        if(a < b) {
            v = a + b;
            a++;
        }
        System.out.println("it's v = " + v);

        for(int count = 3; count > 0; count = count - 1) {
            System.out.println("this " + count);
        }
        System.out.println("here");





    }
}
