package Module01.MyArraysTasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class tömbökEgyveleg {

    public static void main(String[] args) {
        //1,2 feladat
/*
        int[] ints = new int[]{1,2,7};
        int[] ints2 = new int[2];// ha megadod az elemeket, akkor ne add meg a hosszát
        ints2[0]= 11;
        float[]floats = new float[]{5.1f, 4.5f};
        boolean[] areBool = new boolean[]{true,false};
        char[] chars = new char[2];
        String[] strings = new String[]{"as","asdd"};
        Integer[] integers = new Integer[2];

        integers[0]= 3;


        System.out.println(ints2[0]+" " +ints2[ints2.length-1]);
        System.out.println(floats[0]);
        System.out.println(areBool[0]);
        System.out.println(chars[0]);
        System.out.println(strings[0]);
        System.out.println(integers[0]+ " " + integers[integers.length-1]);

        */
/*
        3 feladat
        Random rn = new Random();
        int[]ints = new int[5];
        for( int i =0; i<ints.length;i++ ){
            ints[i] = rn.nextInt(101);
        System.out.println(ints[i]);
        }
        ints[0]++;
        System.out.println("____");
        for( int j = 0; j<ints.length; j++){
            System.out.println(ints[j]);
        }
*/

        //4 feladat

        Scanner sc = new Scanner(System.in);
        int[]ints = new int[5];
        int count = 0;
        for( int i = 0; i <ints.length; i++){

            System.out.println("Number" + i + ":");
            int userNumber = sc.nextInt();
            ints[i] = userNumber;
        }
        System.out.println(Arrays.toString(ints));

        System.out.println("Witch number do u want to change? ");
        int changing = sc.nextInt();

        System.out.println("Melyik számra akarod cserélni");
        int toChange = sc.nextInt();

        ints[changing-1] = toChange;
        System.out.println(Arrays.toString(ints));

// 5 feladat innen kezdődik
        Random rn = new Random();
        int randomNum = rn.nextInt(ints.length);
       System.out.println(randomNum);
        System.out.println(ints[randomNum]);
// 6 feladat
        int sum = 0;
        for ( int s = 0; s < ints.length; s++){
            sum += ints[s];
        }
        System.out.println(sum);

    }

}



