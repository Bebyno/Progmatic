package Module01.MyArraysTasks;


import java.util.Random;

public class utca {
    public static void main(String[] args) {
        Random rc = new Random();

        int min = 1;        // random számgeneráláshoz
        int max = 5;

        int[][] houses = new int[10][5];

        for (int i = 0; i < houses.length; i++) {       //sorok száma

            int emelet = rc.nextInt(max - min + 1) + min;       //random generáljuk a számot
            for (int j = 0; j < houses[i].length; j++) {        // oszlopok, az adott sor oszlopai
                if (j < emelet) {
                    houses[i][j] = 1;

                    /* mivel feltöltöttem a tömböket 0-val (amikor megadtam nekik a hosszát), itt
                     feltöltöm a random generált számig 1-sel. Így lesz meg az emelet.
                    Addig tart az emelet, amig az 1-es tart. Ha azután 0-van akkor az már úgymond a tetőtér.*/
                }
                //System.out.println(Arrays.toString(houses[i]));


            }
        }
        for (int i = 0; i < houses.length; i++) {       //soronként haladunk

            for (int j = 0; j < houses[i].length; j++) {        //oszlopat nézve
                if (houses[i][j] == 0 || j == houses[i].length-1) {   /*  ha 0-hoz ér a lépés, az azt jelenti, hogy ott
                     nincs már emelet kiértünk a tetőre.. VAGY elértünk a legfelső emeletet ami itt 5. emelet,
                      de mivel indexelés miatt csak 4ig megy ezért vonom ki az 5-ből az 1-et. (mert max
                     index számom a 4.*/

                    int hanyEmeletes = j;
                   if (j == houses[i].length-1) {        /* abban az esetben, ha elértük a legfelső szintet ami 5-1
                         tehát 4, adjunk hozzá az emelethez 1-et, így lesz 5. emeletünk is.*/
                        hanyEmeletes++;
                    }
                    if (hanyEmeletes % 2 == 0) {
                        //  System.out.println(emelet);
                        System.out.println(i + " " + hanyEmeletes + ". I love even numbers");   // ha páros
                    } else {
                        // System.out.println(emelet);
                        System.out.println(i + " " + hanyEmeletes + ". Damn");  // ha páratlan
                    }
                    break;


                }


            }
        }

    }
}


