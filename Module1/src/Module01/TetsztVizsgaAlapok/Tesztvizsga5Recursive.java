package Module01.TetsztVizsgaAlapok;

import java.util.Scanner;

public class Tesztvizsga5Recursive {
    public static String reversedWord= "";
    public static String input;

    public static void main(String[] args) {


        String word = input();
        StringChecker(word,word.length()-1);
    }
    public static void  StringChecker(String input, int step){
        if(step<0){
            if(input.equals(reversedWord)) {
                System.out.println("The word is palindrome");
            }else{
                System.out.println("The word is not palindrome");
            }
            return;
        }
        reversedWord += input.charAt(step);


        StringChecker(input,--step);
    }
    public static String input() {
        System.out.println("Give me a word: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        return input;
    }

}