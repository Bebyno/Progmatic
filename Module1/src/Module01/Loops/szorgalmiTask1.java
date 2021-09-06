package Module01.Loops;

import java.util.Scanner;

public class szorgalmiTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a character");
        char word = sc.next().charAt(0);

        switch (word){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }


        String vowel = "aeuio";
        String charToString = String.valueOf(word); // char to String


        if(vowel.contains(charToString)){
            System.out.println("vowel");
        }
         else{
            System.out.println("consonant");
        }


    }
}
