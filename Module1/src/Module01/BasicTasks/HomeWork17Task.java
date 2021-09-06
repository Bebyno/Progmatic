package Module01.BasicTasks;

import java.util.Scanner;
// két szó összehasonlítása
public class HomeWork17Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a word: ");
        String word1 = sc.nextLine();
        System.out.println("Give me an another (or the same): ");
        String word2 = sc.nextLine();
        if( word1.equals(word2)){
            System.out.println("These are the same words" );
        }
        else{
            System.out.println("These are different words");
        }
    }
}
