package Module01.Loops;

public class PrimeDetector {                            // Ria megoldásai
    public static void main(String[] args) {

        // Írj programot, amely megállapítja egy számról, hogy az prímszám-e vagy sem!

        // prímszám: az a természetes szám, amely csak 1-gyel és önmagával osztható
        //          --- pontosan két osztója van: 1 és önmaga
        // természetes: 0-nál nagyobb egész szám (0 is lehet)
        //          nem negatív egész szám
        //      ------------------>>>>>>>>> 2 a legkisebb prímszám


        int number = Integer.MAX_VALUE;

        // VERSION 1.

        long startVersion1 = System.nanoTime();

        int counter = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                counter++;
            }
            if (i % 500000000 == 0) {
                System.out.println("...still working...");
            }
        }

        if (counter == 1) {
            System.out.println(number + " is a prime.");
        } else {
            System.out.println(number + " is not a prime.");
        }

        long endVersion1 = System.nanoTime() - startVersion1;


        // VERSION 2.

        long startVersion2 = System.nanoTime();

        counter = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (counter > 1) {
                break;
            }
            if (number % i == 0) {
                counter++;
            }
        }

        if (counter == 1) {
            System.out.println(number + " is a prime.");
        } else {
            System.out.println(number + " is not a prime.");
        }

        long endVersion2 = System.nanoTime() - startVersion2;


        // VERSION 3.

        long startVersion3 = System.nanoTime();

        boolean isPrime = (number > 1);         // minden 1-nél nagyobb számot prímnek tekintünk
        int i = 2;

        while (isPrime && i <= Math.sqrt(number)) {
            if (number % i++ == 0) {
                isPrime = false;                // de ha találunk osztót, akkor nem lehet prím
            }
        }

        /* VERSION 3. WITH FOR
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
         */

        if (isPrime) {
            System.out.println(number + " is a prime.");
        } else {
            System.out.println(number + " is not a prime.");
        }

        long endVersion3 = System.nanoTime() - startVersion3;

        /* MIÉRT ELEGENDŐ, HA AZ OSZTÓKAT CSAK A SZÁM NÉGYZETGYÖKÉIG KERESSÜK?
        ha a szám négyzetgyöke előtt van 1-nél nagyobb osztó, akkor utána is lesz
        ha viszont nincs, akkor utána sem lesz

        16 osztói: 1, 2, 4, 8, 16
                --> osztópárjai: 1 * 16, 2 * 8, 4 * 4
        25 osztói: 1, 5, 25
                --> osztópárjai: 1 * 25, 5 * 5
        40 osztói: 1, 2, 4, 5, (6 körül) 8, 10, 20, 40
                --> osztópárjai: 1 * 40, 2 * 20, 4 * 10, 5 * 8

        Q.E.D.
         */

        System.out.println("-----------------------------------");
        System.out.println("RUNTIME OF V1: " + endVersion1);
        System.out.println("RUNTIME OF V2: " + endVersion2);
        System.out.println("RUNTIME OF V3: " + endVersion3);


    }
}
