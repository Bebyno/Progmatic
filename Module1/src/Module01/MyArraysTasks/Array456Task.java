package Module01.MyArraysTasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array456Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[]ints = new int[5];
        int count = 0;
        System.out.println("Give me 5 number");
        for( int i = 0; i <ints.length; i++){
            count++;
            System.out.println("Number" + count + ":");
            int userNumber = sc.nextInt();
            ints[i] = userNumber;
        }
        System.out.println(Arrays.toString(ints));

        System.out.println("Witch number in the queue do u want to change? ");
        int changing = sc.nextInt();

        System.out.println("Change to: ");
        int toChange = sc.nextInt();

        ints[changing-1] = toChange;
        System.out.println(Arrays.toString(ints));

        // 5 feladat innen kezdődik

        Random rn = new Random();
        int randomNum = rn.nextInt(ints.length);
        //System.out.println(randomNum);
        System.out.println("The random element: "+ ints[randomNum]);

        // 6 feladat

        int sum = 0;
        for ( int s = 0; s < ints.length; s++){
            sum += ints[s];
        }
        System.out.println("The summ of the arrays elements are: "+sum);
    }
}
