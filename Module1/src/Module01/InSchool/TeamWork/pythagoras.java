package Module01.InSchool.TeamWork;

/*//------------Eredeti verzió--------------------------
         a^2+b^2 = c^2
        System.out.println("Ha kapok három számot, megmondom, hogy vajon pitagoraszi számhármas-e!");
        System.out.println("Kérem az első számot.");
        Scanner scanner = new Scanner(System.in);
        int num51 = scanner.nextInt();

        System.out.println("Kérem a második számot.");
        int num52 = scanner.nextInt();
        System.out.println("Kérem a harmadik számot.");
        int num53 = scanner.nextInt();
//keressük a maximumot!

        int max1 = Math.max(num51, num52);
        int max2 = Math.max(max1, num53);

        int sumAtfogokNegyzete;
        int befogoNegyzete;
        befogoNegyzete = (max2*max2);
        sumAtfogokNegyzete = (num51*num51) + (num52*num52) + (num53*num53) - (max2*max2);

        if (sumAtfogokNegyzete == befogoNegyzete) {
            System.out.println("Ez egy pitagoraszi számhármas.");}
        else
        {System.out.println("Ez nem egy pitagoraszi számhármas.");}
    }*/

import java.util.Arrays;
import java.util.Scanner;

/**
 * kell függvény ami bekéri az inputot 3x
 * (+bonusz függ, validitás (negativ számok - abszolut érték) )
 * matekos részt elvégző függvény
 * nyomtatás
  */


public class pythagoras {

    public static Scanner sc;
    public static int[] numberArray = new int[3];


    public static void main(String[] args) {
        inputToArray();
        System.out.println(Arrays.toString(numberArray));
        int cSide = theBiggest();
        int allSidePowered =  sumAllSide();
        boolean isWhich = letsSee(allSidePowered,cSide);
        printPithagoras(isWhich);

    }

public static void printPithagoras(boolean myBoolean){
    if(myBoolean){
      System.out.println("pithagoras");
    }else{
        System.out.println("not pithagoras");
    }

    }


    public static Scanner input(){
        return new Scanner(System.in);

    }

    public static void inputToArray(){
        System.out.println("give me 3 number: ");

        for (int i = 0; i < numberArray.length; i++) {
            int intInput = input().nextInt();
            int limiter = 0;
            while(intInput <= 0 && limiter < 2){
                limiter++;
                System.out.println("Error, the number is lower than 0");
                intInput = input().nextInt();
            }
            if(intInput < 0){
                System.out.print("You tried ");
                System.out.print(limiter+1);
                System.out.print(" times, I'll will use the number's absolute value.");
                System.out.println();
            }
            numberArray[i]= Math.abs(intInput);

        }
       // return numberArray;
    }
    public static int theBiggest(){
        //inputThreeTimes();
        int biggest= numberArray[0];
        for (int i = 1; i < numberArray.length; i++) {
            //System.out.println(numberArray[i]);
            if(biggest <numberArray[i]){
                biggest = numberArray[i];
            }
        }
        System.out.println("the biggest: "+biggest);
        return biggest;
    }
    public static int sumAllSide(){
        int sum = 0;
        for (int i : numberArray) {
            sum += i * i;
        }
        /*
         for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i]*numberArray[i];
        }
        */

        System.out.println("Sum: "+sum);
        return sum;
    }
    public static boolean letsSee(int num1, int num2){
        return num1 == Math.pow(num2, 2) * 2;

        /*
        *  if (num1 == Math.pow(num2,2)*2){
           // System.out.println("pithagoras");
            return true;
        }
        else{
            //System.out.println("not pithagoras");
            return false;
        }

        * */
    }

}
