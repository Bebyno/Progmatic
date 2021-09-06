package Module01.extraArrays;

public class Task3 {
    public static void main(String[] args) {
        /*
        *
        **
        ***
        ****
        *****
        */
        int n = 5;
        String stars = "";
        for(int i =0; i<n; i++){                    // task1
            stars += "*";
            System.out.println(stars);

        }
        System.out.println("________");

        for (int i = 0; i <= n; i++) {
            String newStars = "";

            for (int j = 0; j < n - i; j++) {           // task2
                newStars += " ";

            }
            for (int j = 0; j < i; j++) {

                newStars += "*";
            }
            System.out.println(newStars);
        }
        System.out.println("________");



                                                // Task 3
        int currentStar = 1;

        for (int line = 1; line <= n; line++) {
            String currentline = "";
            for (int spaces = 0; spaces < n - line; spaces++) {             // kevés csillaggal nem akar összejönni :( .
                currentline += " ";                                         // tipp, hogy mit csinálok rosszul?

            }
            for (int piramisStar = 0; piramisStar < currentStar; piramisStar++) {

                currentline += "*";
            }
            currentStar += 2;
            System.out.println(currentline);

        }


    }
}
