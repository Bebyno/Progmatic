package Module01.TetsztVizsgaAlapok;

import java.util.Arrays;
import java.util.Scanner;

// nyomtass ki N számú prim számot.

public class TesztVizsga6LittleNicerSolution {
    public static int steps = 0;
    public static int number = 1;
    public static int divider = 1;
    public static int[] primeArray;
    public static int input = input();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(toArray()));
    }

    public static int[] toArray() {
        int primeLongness = input;
        primeArray = new int[primeLongness];
        while(moving() < primeArray.length){

            primeArray[steps] = number;

        }
        return primeArray;
    }

    public static int dividers() {
        divider = 1;
        int howManyDividers = 0;
        while(divider <= number){
            if (number % divider == 0){
                howManyDividers++;
            }
            divider++;
        }
        number++;
        return howManyDividers;
    }

    public static boolean isPrime(){
      int howManyDividers =dividers();
      return howManyDividers == 2;
    }
/*
    public static int[] fillTheArray(){
        boolean prime = isPrime();
        if(prime){
            primeArray[steps] = number;
        }
        return primeArray;
    }
*/


    public static int moving(){
        boolean prime = isPrime();
        if(prime){
            //&& steps != input-1
            return ++steps;
        }
        else{
            return steps;
        }
    }


    public static int input() {
        System.out.println("How many prime do u want to print out?");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
}
