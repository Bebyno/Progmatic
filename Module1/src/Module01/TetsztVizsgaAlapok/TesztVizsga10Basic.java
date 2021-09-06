package Module01.TetsztVizsgaAlapok;

import java.util.Arrays;
import java.util.Random;
// Kicsit lestem :S :(
public class TesztVizsga10Basic {
    public static int[][] arrayWithRandomNumbers = new int[4][3];
    public static int[] rowsSum = arrayRowsSum();

    public static void main(String[] args) {

        fillingTheMatrix();
        arrayRowsSum();
        printer();
    }

    public static void printer(){
        System.out.println(Arrays.toString(difference()));
    }

    public static int[][] fillingTheMatrix() {
        for (int i = 0; i < arrayWithRandomNumbers.length; i++) {
            for (int j = 0; j < arrayWithRandomNumbers[j].length; j++) {
                arrayWithRandomNumbers[i][j] = myRandom();
            }
        }
         //System.out.println(Arrays.deepToString(arrayWithRandomNumbers));
        return arrayWithRandomNumbers;
    }

    public static int[] arrayRowsSum() {
        int sum = 0;
        int[] rows = new int[arrayWithRandomNumbers.length];
        for (int i = 0; i < arrayWithRandomNumbers.length; i++) {
            for (int j = 0; j < arrayWithRandomNumbers[j].length; j++) {
                sum += arrayWithRandomNumbers[i][j];
            }
            rows[i] = sum;
            sum = 0;
        }
        // System.out.println(Arrays.toString(rows));
        return rows;
    }

    public static int[] difference() {
        rowsSum = arrayRowsSum();
        int minimum = rowsSum[0];
        int maximum = rowsSum[0];
        int minLocation = 0;
        int maxLocation = 0;

        for (int i = 0; i < rowsSum.length; i++) {
            if (rowsSum[i] < minimum) {
                minimum = rowsSum[i];
                minLocation = i;
            }
            if (rowsSum[i] > maximum) {
                maximum = rowsSum[i];
                maxLocation = i;
            }

        }
        return new int[]{minLocation, maxLocation};
    }


        public static int myRandom () {
            Random rc = new Random();
            int max = 30;
            int min = 1;
            return rc.nextInt(max - min + 1) + min;
        }
    }
