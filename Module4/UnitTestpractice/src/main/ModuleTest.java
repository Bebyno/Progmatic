package main;

public class ModuleTest {
    public static void main(String[] args) {


    }



        /**
         * Valósítsd meg a getLastNumber metódust! A metódus adja vissza a paraméterként kapott tömb utolsó elemét!
         *
         * (2 pont)
         */
        public static int getLastNumber(int[] numbers) {
            return numbers[numbers.length-1];

        }

        /**
         * Valósítsd meg a countEvenNumbers metódust! A metódus adja vissza, hogy a paraméterként kapott tömbben hány páros szám szerepel!
         *
         * (2 pont)
         */
        public static int countEvenNumbers(int[] numbers) {
            int counter = 0;
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i]%2==0){
                    counter++;
                }
            }
            return counter;
        }

        /**
         * A findNumber metódus bemeneti paraméterként kap egy tömböt és egy számot.
         * A metódusod adja vissza a tömb azon indexét, ahol ez a szám először fordul elő!
         * Ha a tömbben nem szerepel ez a szám, a metódus visszatérési értéke legyen -1.
         *
         * (3 pont)
         */
        public static int findNumber(int[] numbers, int number) {
            int index = 0;
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i]==number){
                    index = i;
                    return i;
                }
            }
            return -1;
        }

        /**
         * Valósítsd meg a countSameNumbers metódust!
         * A metódus két egészeket tartalmazó tömb paramétert kap,
         * és azt kell megszámolnia, hogy hány elem szerepel az első tömbből a második tömbben.
         * Ügyelj arra, hogy ha egy szám többször szerepel a második tömbben, akkor azt csak egynek számold!
         * Az első tömbben minden szám csak egyszer fordul elő, ám a második tömbre ez nem feltétlen igaz.
         *
         * Példa:
         *      int[] firstNumbers = {0, 1, 2, 3, 4};
         *      int[] secondNumbers = {5, 6, 5, 4, 4, 4, 3};
         *      megoldás: 2
         *      indoklás: mivel 2 szám szerepel az első tömbből a másodikban (a 3 és a 4)
         *
         * (4 pont)
         */
        public static int countSameNumbers(int[] firstNumbers, int[] secondNumbers) {
            int counter = 0;
            for (int i = 0; i < firstNumbers.length; i++) {
                for (int j = 0; j < secondNumbers.length; j++) {
                    if(firstNumbers[i] == secondNumbers[j]){
                        counter++;
                        break;
                    }
                }
            }

            return counter;
        }

        /**
         * Valósítsd meg a findMaxIndex metódust!
         * A metódus bemeneti paraméterként egy egész számokat tartalmazó tömböt kap.
         * Visszatérési értéke legyen a tömb azon indexe, amelyen a tömb legnagyobb értékű eleme található.
         * A bemeneti paraméterként kapott tömbre igaz, hogy minden eleme eltérő értékű. (Azaz csak egy maximuma van.)
         *
         * (4 pont)
         */
        public static int findMaxIndex(int[] numbers) {
            int max = numbers[0];
            int index = 0;
            for (int i = 1; i < numbers.length; i++) {
                if(max < numbers[i]){
                    max = numbers[i];
                    index= i;
                }
            }
            return index;
        }

        /**
         * Valósítsd meg a matrixTopLeftNumber metódust!
         * A metódus egy kétdimenziós tömböt kap paraméterül, és adja vissza ennek a mátrixnak a bal felső (első) elemét!
         *
         * (2 pont)
         */
        public static int getTopLeftNumber(int[][] matrix) {
            return matrix[0][0];
        }

        /**
         * Mennyi a különbség a mátrix két átlójában szereplő elemek összege között?
         * Valósítsd meg a matrixDiagonalDifference metódust! A metódus egy kétdimenziós tömböt kap paraméterül,
         * és visszatérési értéke a mátrix átlóiban szereplő számok összegei közötti eltérés.
         * Ügyelj arra, hogy a metódusod visszatérési értéke a kérdésnek megfelelően mindig nem-negatív egész szám legyen!
         * A bemenetül kapott kétdimenziós tömbre igaz, hogy négyzetes mátrix, azaz a sorainak és oszlopainak száma egyenlő.
         *
         * (4 pont)
         */
        // [0][0]-[1][1]-[2][2]-[3][3] - 34
        // [3][0]-[2][1]-[1][2]-[0][3]
        /*        0 1 2 3
                0 0 1 2 3
                1 4 5 6 7
                2 8 9 0 1
                3 2 3 4 5
        */


        public static int getDiagonalDifference(int[][] matrix) {
            int sumFromTopLeft = 0;
            int sumFromBottomLeft = 0;

            for (int i = 0; i < matrix.length; i++) {
                sumFromTopLeft += matrix[i][i];
            }

            int index = 0;
                for (int i = matrix.length-1; i >= 0; i--) {

                    sumFromBottomLeft += matrix[i][index++];


            }

            return Math.abs(sumFromBottomLeft-sumFromTopLeft);
        }



    /* TODO
    --------------------------------------------------------------------------------------------------
        A következő két feladat közül az egyiket kötelező megoldanod! Te választhatod ki, hogy melyiket.
        Tehát csak az egyiket kell megoldanod, a másik opcionális.
        Hagyd érintetlenül azt, amelyiket NEM oldod meg!
        Ha mind a kettőt megoldod, helyes megoldások esetén plusz pontot kapsz. Helytelen megoldások esetén azonban nem.
        Ha mind a kettőt megpróbálod megoldani, de egyik sem ad vissza jó eredményt,
        akkor a kevésbé hibás feladatot fogjuk figyelembe venni a pontozásnál. Tehát minden esetben
        a jobban sikerült feladatot számítjuk bele az eredményedbe.
     --------------------------------------------------------------------------------------------------
     */

        /**
         * VÁLASZTHATÓ 1.
         *
         * Adott egy végtelen hosszú út, amelyen számozott kövek jelzik a távolságot. Erre az útra két mágus áll rá,
         * méghozzá úgy, hogy mindegyikük választ magának egy-egy számozott követ kiindulópontnak.
         * Mindkét mágus adott távolságra képes teleportálni - de mindig egy számozott kő mellé érkeznek.
         * Miután felálltak az útra, mindketten ugyanabban az időben teleportálnak akkora távolságra, amekkorára képesek,
         * és azután folytatják a teleportálást előre...
         *
         * Az első mágus s1-ről indul, és d1 távolságra teleportál,
         * míg a második mágus s2-ről indul, és d2 távolságra teleportál.
         * (Fontos, hogy mindig egyszerre teleportálnak, és mindig előre.)
         *
         * Valósítsd meg a willWizardsBeTogether metódust, amely bemeneti paraméterül kapja az s1, d1, s2 és d2 értékeket!
         * (Ezek az értékek nem-negatív egész számok.)
         * A metódus visszatérési értéke válaszoljon arra a kérdésre, hogy fog-e a két mágus találkozni.
         * Azaz: előfordul-e az, hogy ugyanabban az időben ugyanamellett a számozott kő mellett állnak?
         *
         * Példa1.:     s1 = 0, d1 = 3, s2 = 4, d2 = 2
         *              megoldás: igen, fognak találkozni
         *              indoklás:
         *                  első mágus teleportálásai:      0 => 3 => 6 => 9 => 12
         *                  második teleportálásai:         4 => 6 => 8 => 10 => 12
         *              (látható, hogy a 4. teleportálásuknál mindketten a 12-es kő mellett lesznek)
         *
         * Példa2.:     s1 = 2, d1 = 2, s2 = 5, d2 = 3
         *              megoldás: nem fognak találkozni
         *              indoklás:
         *                  az első mágus hátrábbról indul, mint a második, ráadásul lassabb is,
         *                  így neki esélye sincs utolérni a másodikat
         *
         * (6 pont)
         */
        public static boolean willWizardsBeTogether(int s1, int d1, int s2, int d2) {
          int sOne =s1 + d1;
          int sTwo = s2 + d2;
          int limit = 10;
          while(sOne != sTwo && limit>0){
              limit--;
              sOne += d1;
              sTwo += d2;
          }
            if(sOne == sTwo){
                return true;
            }

            return false;
        }


        /**
         * VÁLASZTHATÓ 2.
         *
         * A zoknijaimat mindig párban teszem a mosógépbe, ám a teregetésnél szomorúan tapasztalom,
         * hogy az egyik zoknim (és mindig csak az egyik zoknim) egyik párja unos-untalan elvész...
         * Micsoda rejtelem! Ám szerencsére nem kell feltárnod ezt a misztikus jelenséget.
         *
         * Valósítsd meg a findTheOneSock metódust, amely bemeneti paraméterként nem-negatív egész számokat tartalmazó tömböt kap
         * (szimbolizálva a zoknijaimat a teregetéskor), és visszatérési értéke a tömb azon értéke, amelynek nincsen párja a tömbben.
         * A tömbben a számok párosával szerepelnek - előfordulhat, hogy kétszer, négyszer, hatszor... vagy többször.
         * Ám egy, és mindig csak egy szám pár nélkül szerepel.
         * A metódusodnak ezt az egyedül, pár nélkül lévő számot kell visszaadnia.
         *
         * Példa1.:     a tömb: {30, 10, 30, 10, 30, 30, 20, 10, 30, 10, 30}
         *              megoldás: 20
         *              indoklás:
         *                  a számpárok: 30-30, 10-10, 30-30, 10-10, 30-30
         *                  pár nélküli: 20
         *
         * Példa2.:     a tömb: {56, 1, 33, 42, 0, 86, 42, 86, 1, 56, 0}
         *              megoldás: 33
         *              indoklás:
         *                  a számpárok: 56-56, 1-1, 42-42, 0-0, 86-86
         *                  pár nélküli: 33
         *
         * (6 pont)
         */
        public static int findTheOneSock(int[] socks) {
            for (int i = 0; i < socks.length; i++) {
                int counter = 0;

                for (int j = 0; j < socks.length; j++) {
                    if(socks[i]== socks[j]){
                    counter++;
                    }


                }
                if(counter % 2 !=0){
                    return socks[i];
                }

            }


            return -1;
        }

    }

