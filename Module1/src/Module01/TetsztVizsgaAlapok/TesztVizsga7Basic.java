package Module01.TetsztVizsgaAlapok;

import java.util.Arrays;
import java.util.Scanner;

public class TesztVizsga7Basic {

    public static String[] theArray = {"kutya", "macska", "egér", "ló", "kecske", "kakukk", "legy"};
    public static String[] newArray;
    public static String character = characterInput();

    public static int index = 0;


    public static void main(String[] args) {
        myArray(theArray,character);
        System.out.println(Arrays.toString(theGoodArray()));
    }

    public static String[] myArray(String[] myArray, String character) {
        newArray = new String[myArray.length];
        for (String elem : myArray) {
            if (elem.contains(character)) {
                newArray[index] = elem;
                index++;
            }
        }

        return newArray;
    }

    public static String[] theGoodArray() {
        String[] theGoodOne = new String[index];
        for (int i = 0; i < theGoodOne.length; i++) {
            theGoodOne[i] = newArray[i];
        }

        return theGoodOne;
    }
    public static String characterInput(){
        System.out.println("Give me a character: ");
        return input().nextLine();
    }

    public static Scanner input(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }
}