package Module01.Gandalf;

import java.util.Arrays;
import java.util.Scanner;

// https://www.geeksforgeeks.org/how-to-left-or-right-rotate-an-array-in-java/
// 2. megoldás?

public class GandalfTask6And7Left {
    public static String[] words = {"látlak", "Üdvözöllek", "Module01/Gandalf", "jó", "hogy", "újra"};
    public static String[] pushedWords = new String[words.length];
    public static int pushingHowMany = input().nextInt();

    public static void main(String[] args) {
        pushAllOnesLeft(words, pushingHowMany);
        System.out.println(Arrays.toString(pushedWords));
    }

    public static void pushAllOnesLeft(String[] words, int pushingHowMany){
        String[] tempAray = new String[pushingHowMany];

        for (int i = 0; i < tempAray.length; i++) {
            tempAray[i] = words[i];

        }
        for (int i = pushingHowMany; i < words.length; i++) {           // így megyünk vissza a 0. indexelemre és teszem be a szavakat.
            pushedWords[i - pushingHowMany] = words[i];
        }
        for (int i = 0; i < pushingHowMany; i++) {
            pushedWords[i + words.length - pushingHowMany] = tempAray[i];    // így rakom be a legvágott szavakat

        }

    }

    public static Scanner input(){
        System.out.println("How many time do you want to push right the words? (max 6)");
        return new Scanner(System.in);
    }

}
