package Module01.Gandalf;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 1. kell egy tempArray amibe a n mennyiségű szót berakom (n hosszú)
 * 1.1 tempArray kezdő n elemei a words utolsó elemei (Reverse mód?)
 * 2. kell egy új tömb (pushingArray) amibe egyből átrakom(for) a temparay elemeit(megvannak a jobbra tolt elemek + nullok.)
 * 2.1 kell 1 forciklus ami a megmaradt elemeket berakja az új tömbbe pushingArray<- wordsArray, n-ik index utánra.
 *
 * */


public class GandalfTask6And7 {
    public static String[] words = {"látlak", "Üdvözöllek", "Module01/Gandalf", "jó", "hogy", "újra"};
    public static String[] pushedWords = new String[words.length];
    public static int pushingHowMany = input().nextInt();

    public static void main(String[] args) {
        pushingWords(words, pushingHowMany);
        System.out.println(Arrays.toString(pushedWords));
    }
    public static void pushingWords(String[] words, int pushingHowMany){
        String[]tempArray = new String[pushingHowMany];

       /* for (int i = words.length-1; i >= words.length-pushingHowMany; i--) {
            tempArray[words.length-(i+1)] = words[i];                             // reverseben mód valahol hibás

        }*/

        // tempArray-be rakom az eredti wordsarray utolsó n elemeit.
        for (int i = 0; i < words.length -(words.length-pushingHowMany); i++) {
            tempArray[pushingHowMany-1-i] = words[(words.length-1)-i];
        }

        // egyből a temparray elemeivel kezdem az új tömb feltöltését.
        for (int i = 0; i < pushingHowMany; i++) {
            pushedWords[i] = tempArray[i];

        }
        // a words maradék elemeit berakom a jó tömbbe, n index után.
        for (int i = words.length - (words.length - pushingHowMany); i < words.length; i++) {
            pushedWords[i] = words[i-pushingHowMany];
        }

    }

    public static Scanner input(){
        System.out.println("How many time do you want to push right the words? (max 6)");
        return new Scanner(System.in);
    }

}
