package Module01.TetsztVizsgaAlapok;

import java.util.Scanner;

public class TesztVizsga5Forloop {
    public static String input = input().nextLine();
    // radar, dad, mom, pap,
    public static String reverseWord;
    public static void main(String[] args) {
        reverser(input);
        printer();
    }
    public static void printer(){
        boolean checker = palindromechecker();
        if(checker){
            System.out.println("The word is palindrome");
        }
        else{
            System.out.println("The word is not palindrome");
        }
    }

    public static String reverser(String input){
        reverseWord = "";
        for (int i = input.length()-1; i >= 0 ; i--) {
            reverseWord += input.charAt(i);
        }
        return reverseWord;
    }
    public static boolean palindromechecker(){
        return (input.equals(reverseWord));

    }

    public static Scanner input(){
        System.out.println("Give me a word: ");
        return new Scanner(System.in);
    }
}
