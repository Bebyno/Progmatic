package Module01.TetsztVizsgaAlapok;

import java.util.Arrays;
import java.util.Scanner;

public class TesztVizsga7 {
    public static String[] myArray = {"kutya", "macska", "egér", "ló", "kecske"};
    public static String character = charcter();
    public static int howManyTimes = howManyTimes();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(hasChar(myArray, character)));
    }

    public static String[] hasChar(String[] myArray, String character) {
        int index = 0;
        String[] tempArray = new String[myArray.length];
        for (String str : myArray) {

            if (str.toLowerCase().contains(character.toLowerCase())) {
                tempArray[index] = str;
                index++;

            }
        }
        String[] nullCutter = new String[index];
        for (int i = 0; i < index; i++) {
            nullCutter[i] = tempArray[i];
        }

        String[] commonnessChecker = new String[index];
        int secondIndex = 0;
        int commonness = 0;
        for (String chr: nullCutter) {
            if(chr.toLowerCase().contains(character.toLowerCase())){
                commonness++;
            }
            if(commonness == howManyTimes){
                commonnessChecker[secondIndex]=chr;
                commonness= 0;
            }
        }



        return commonnessChecker;
    }






    public static String charcter(){
        System.out.println("Give me a character: ");
        return input().nextLine();
    }

    public static int howManyTimes(){
        System.out.println("Give me the commonness of the character in the word: ");
        return input().nextInt();
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

}

