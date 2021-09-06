package Module01.Gandalf;

import java.util.Arrays;

public class GandalfTask9 {
    public static String[] secretWords = {"obbnagy","intm",
            "incharm", "séé", "ím!pr", "enjM", "ebb", "aaa", "ebblegkis", "ámúsz", "tónaj", "nekmely", "ámasz"};
    public static String[][] letterOfMatrix = new String[secretWords.length][];
    public static String[][] newLetterOfMatrix = new String[secretWords.length][];
    public static int pushingCharacter = 3;
   // public static String[][] pushingCharacters = new String[secretWords.length][];
    public static String[][] pushedWords = new String[newLetterOfMatrix.length][];
    public static String[][] tempPushedWords= new String[newLetterOfMatrix.length][];
    public static String[][] tempArray = new String[secretWords.length][];
    public static int pushingWords = 8;

    public static void main(String[] args) {
        fillTheCollumns();
        pushingcharactes();
        pushingWords();
        primeDoor();
    }
    public static String[][] fillTheCollumns() {

        for (int i = 0; i < secretWords.length; i++) {
            letterOfMatrix[i] = new String[secretWords[i].length()];

            for (int j = 0; j < secretWords[i].length(); j++) {

                letterOfMatrix[i][j] = String.valueOf(secretWords[i].charAt(j));

            }
        }
        return letterOfMatrix;
    }
    public static String[][] pushingcharactes() {

        for (int j = 0; j < secretWords.length; j++) {
            tempArray[j] = new String[pushingCharacter];

            for (int i = 0; i < pushingCharacter; i++) {
                tempArray[j][i] = letterOfMatrix[j][i];
            }
        }
       // System.out.println(Arrays.deepToString(tempArray));

        for (int i = 0; i < secretWords.length; i++) {
            newLetterOfMatrix[i] = new String[secretWords[i].length()];

            for (int j = pushingCharacter; j < letterOfMatrix[i].length; j++) {
                newLetterOfMatrix[i][j-pushingCharacter] = letterOfMatrix[i][j];
            }}
       // System.out.println(Arrays.deepToString(newLetterOfMatrix));
        for (int i = 0; i < secretWords.length; i++) {


            for (int j = letterOfMatrix[i].length - pushingCharacter; j < letterOfMatrix[i].length; j++) {
                newLetterOfMatrix[i][j] = tempArray[i][j-letterOfMatrix[i].length + pushingCharacter];

            }}

       // System.out.println(Arrays.deepToString(newLetterOfMatrix));
        return newLetterOfMatrix;
    }

    public static void pushingWords(){
        for (int i = 0; i < secretWords.length; i++) {
            tempPushedWords[i] = new String[newLetterOfMatrix[i].length];
        }

        for (int i = 0; i < pushingWords; i++) {


            tempPushedWords[pushingWords-1-i] = newLetterOfMatrix[(newLetterOfMatrix.length-1)-i];
        }

        for (int i = 0; i < pushingWords; i++) {
            pushedWords[i] = tempPushedWords[i];

        }
        for (int i = newLetterOfMatrix.length - (newLetterOfMatrix.length - pushingWords); i < newLetterOfMatrix.length; i++) {
            pushedWords[i] = newLetterOfMatrix[i-pushingWords];
        }
        System.out.println(Arrays.deepToString(pushedWords));

    }

    public static int primeDoor(){
        int prime = 0;
        {
            int howManyDividers = 0, run = 0, number = 1, divider = 1;
            while (prime < 30) {
                divider = 1;
                howManyDividers = 0;
                while (divider <= number) {
                    if (number % divider == 0)
                        howManyDividers++;
                    divider++;
                }
                if (howManyDividers == 2) {
                    prime = number;

                    run++;
                }
                number++;
            }
            System.out.print("The right door is: "+ prime+".");
            System.out.println();
            return number;
        }
    }





}
