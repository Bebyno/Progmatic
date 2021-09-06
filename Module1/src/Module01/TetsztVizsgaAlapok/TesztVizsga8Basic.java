package Module01.TetsztVizsgaAlapok;

import java.util.Scanner;

public class TesztVizsga8Basic {
    public static int[] myIntArray = {1,1,2,2,2,2,3,4,2,3,2,1,5,6,7};

    public static void main(String[] args) {
        printer();
    }
    public static void printer(){
        int counter = howManyTimes();
        System.out.println("Your number is "+ counter + " times in the array");
    }
    public static int howManyTimes(){
        int number = input();
        int counter = 0;
        for (int i = 0; i < myIntArray.length; i++) {
        if(number == myIntArray[i]){
            counter++;
        }
        }
        return counter;
    }

    public static int input() {
        System.out.println("Give me a number: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
