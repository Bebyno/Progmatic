package Module01.TetsztVizsgaAlapok;

import java.util.Scanner;

public class TesztVizsga8Bonus {
    public static int[] myIntArray = {1,1,2,2,2,2,3,4,2,3,2,1,5,6,7};
    public static int starter = start();
    public static int ender =end();


    public static void main(String[] args) {
        printer();
    }
    public static void printer(){
        int counter = howManyTimes();
        System.out.println("Your number is "+ counter + " times in the array");
    }
    public static int howManyTimes(){
        int counter = 0;
        for (int i = 0; i < myIntArray.length; i++) {
          if(myIntArray[i]>= starter && myIntArray[i]<= ender){
              counter++;
          }


        }
        return counter;
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static int start(){
        System.out.println("Give me the start element of the intervallum: ");
        return input().nextInt();
    }
    public static int end(){
        System.out.println("Give me the ending element of the intervallum: ");
        return input().nextInt();
    }


}
