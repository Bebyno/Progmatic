package Module01.TetsztVizsgaAlapok;

import java.util.Scanner;

public class TesztVizsga4WithBonus {
    public static int input;
    public static String str;
    public static int sum= sum();

    public static void main(String[] args) {
        printer();

    }
    public static void printer(){
        System.out.println("The sum of the elements are: " + sum +" The difference is: "+theDifference());
    }

    public static String numToString(){
        str = ""+input();
    return str;
    }

    public static int sum(){
        String numbers =numToString();
        int sum =0;
        for (int i = 0; i < numbers.length(); i++) {

        int number = Integer.parseInt(String.valueOf(numbers.charAt(i)));
        sum+=number;
        }
        return sum;
    }

    public static int theDifference(){


        return input-sum;
    }

    public static int input() {
        System.out.println("Give me a number: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        return input;
    }
}
