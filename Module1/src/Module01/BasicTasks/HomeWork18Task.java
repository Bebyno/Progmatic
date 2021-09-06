package Module01.BasicTasks;

import java.util.Scanner;
// space keresés
public class HomeWork18Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a sentence: ");
        String sentence = sc.nextLine();
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isWhitespace(sentence.charAt(i))) {     // ez csekkolja le, hogy " "-e az aktuális elem
                count++;
            }

        }
        if (count > 0) {
            System.out.println("More than one word!");
        }
        else{
            System.out.println("This is one word!");  // Az a baj, hogy ha a végére véletlen spacet raksz akkor már 2 szó
        }
    }
}

// szóközkeresés