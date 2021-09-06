package Module01.TetsztVizsgaAlapok;

import java.util.Arrays;
import java.util.Scanner;

public class tesztvizsga7pont1 {
    public static String[] theArray = {"kutya", "macska", "egér", "ló", "kecske","kakukk","legy"};
    public static String[] newArray;
    public static String[] commiArray;
    public static String character = characterInput();
    public static int index = 0;
    public static int commonessIndex= 0;
    public static int commoness= howManyCharacterInput();


    public static void main(String[] args) {
        myArray(theArray,character);
        System.out.println(Arrays.toString(theGoodArray()));
        commonessArray();
        System.out.println(Arrays.toString(theGoodCommonessArray()));
    }

    public static String[] myArray(String[] myArray, String character){
        newArray = new String[myArray.length];
        for(String elem : myArray) {
            if (elem.contains(character)){
                newArray[index] = elem;
                index++;
            }
        }
        System.out.println("a");
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static String[] theGoodArray(){
        String[] theGoodOne = new String[index];
        for (int i = 0; i < theGoodOne.length; i++) {
            theGoodOne[i] = newArray[i];
        }
        System.out.println("b");
        System.out.println(Arrays.toString(theGoodOne));
        return theGoodOne;
    }
    public static String[] commonessArray(){
        String[] commonesArray = theGoodArray();
        String[] commiArray = new String[commonesArray.length];
        commonessIndex =0;
        int counter = 0;
        for(String chari : commonesArray){
            if(chari.contains(character)){
                counter++;
                if(counter == commoness){
                    commiArray[commonessIndex] = chari;
                }
            }
        }
        System.out.println("c");
        System.out.println(Arrays.toString(commiArray));
        return commiArray;
    }
    public static String[] theGoodCommonessArray(){
        String[] theGoodCommArray = new String[commonessIndex];
        for (int i = 0; i < theGoodCommArray.length; i++) {
            theGoodCommArray[i] = commiArray[i];

        }
        return theGoodCommArray;
    }


    public static String characterInput(){
        System.out.println("Give me a character: ");
        return input().nextLine();
    }

    public static int howManyCharacterInput(){
        System.out.println("Give me the commonness of the character in the word: ");
        return input().nextInt();
    }

    public static Scanner input(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }


}
