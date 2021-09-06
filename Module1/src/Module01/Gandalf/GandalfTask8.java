package Module01.Gandalf;

import java.util.Arrays;
import java.util.Scanner;

public class GandalfTask8 {
    public static String[] words = {"látlak", "Üdvözöllek", "Module01/Gandalf", "jó", "hogy", "újra"};
    public static String[][] letterOfMatrix = new String[words.length][];
    public static String[][] newLetterOfMatrix = new String[words.length][];
    public static String[][] tempArray = new String[words.length][];

    public static int pushingHowMany = input().nextInt();


    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(fillTheCollumns()));
        System.out.println(Arrays.deepToString(pushingWords()));
    }

    public static String[][] fillTheCollumns() {

        for (int i = 0; i < words.length; i++) {
            letterOfMatrix[i] = new String[words[i].length()];

            for (int j = 0; j < words[i].length(); j++) {

                letterOfMatrix[i][j] = String.valueOf(words[i].charAt(j));

            }
        }
        return letterOfMatrix;
    }

    public static String[][] pushingWords() {

        for (int j = 0; j < words.length; j++) {
            tempArray[j] = new String[pushingHowMany];

        for (int i = 0; i < pushingHowMany; i++) {
            tempArray[j][pushingHowMany - 1 - i] = letterOfMatrix[j][(letterOfMatrix[j].length-1)-i];
        }
        }

        //System.out.println(Arrays.deepToString(tempArray));

        for (int i = 0; i < words.length; i++) {
            newLetterOfMatrix[i] = new String[words[i].length()];


        for (int j = 0; j < pushingHowMany; j++) {
            newLetterOfMatrix[i][j] = tempArray[i][j];

        }}

      //  System.out.println(Arrays.deepToString(newLetterOfMatrix));

        for (int i = 0; i < words.length; i++) {

        for (int j = pushingHowMany; j < letterOfMatrix[i].length; j++) {
            newLetterOfMatrix[i][j] = letterOfMatrix[i][j-pushingHowMany];
        }}

        return newLetterOfMatrix;

    }

    public static Scanner input(){
        System.out.println("How many time do you want to push right the words? (max 2)");
        return new Scanner(System.in);
    }

}
