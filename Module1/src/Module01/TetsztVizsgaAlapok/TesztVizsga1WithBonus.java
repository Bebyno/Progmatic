package Module01.TetsztVizsgaAlapok;

import java.util.Scanner;

public class TesztVizsga1WithBonus {
    public static int number = number();
    public static int diviner = Diviner();

    public static void main(String[] args) {
        printResult();
    }

    public static void printResult(){
        if(isDivWithSeven()){
            System.out.println("Your number: " +number+ " can div. with "+ diviner+".");
        }
        else{
            System.out.println("Your number: "+ number+ " can not div. with "+diviner+".");
        }
    }

    public static boolean isDivWithSeven(){
        if(number % diviner == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int number(){
        System.out.println("Give me a number: ");
        number = input();
        return number;
    }

    public static int Diviner(){
        System.out.println("Give me the diviner: ");
        diviner = input();
        return diviner;
    }
    public static int input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
