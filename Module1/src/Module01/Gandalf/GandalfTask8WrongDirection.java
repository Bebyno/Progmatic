package Module01.Gandalf;

import java.util.Arrays;
import java.util.Scanner;

public class GandalfTask8WrongDirection {
    public static String[] words = {"látlak", "Üdvözöllek", "Module01/Gandalf", "jó", "hogy", "újra"};
    public static int pushingHowMany = input().nextInt();
    public static int stringAllElementsLenght;
    public static String[] tempArray = new String[lenghtofTempArray()];


    public static void main(String[] args) {
        fillTheTempArray ();
    }

    public static int lenghtofTempArray() {
        stringAllElementsLenght = 0;

        for (int i = 0; i < words.length; i++) {
            stringAllElementsLenght += words[i].length();


        }
        return stringAllElementsLenght;
    }
    public static void fillTheTempArray () {
        int index = 0;

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {

                tempArray[index] = String.valueOf(words[j].charAt(0));
                index++;
            }

        }

        System.out.println(Arrays.toString(tempArray));
    }

    public static Scanner input(){
        System.out.println("How many time do you want to push right the words? (max 6)");
        return new Scanner(System.in);
    }


}
