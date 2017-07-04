package Schildt;

/**
 * Created by oifa on 04.07.2017.
 */
public class For {
    public static void main(String[] args) {
        double gallons, literes;
        int counter;

        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            literes = gallons * 3.7854;
            System.out.println(gallons + " is " + literes + " leteres");

            counter++;
            if (counter == 10) {
                System.out.println(" ----------------------- ");
                counter = 0;
            }
        }
    }
}
