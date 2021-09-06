package Module01.BasicTasks;

import java.util.Scanner;
//karakter szám
public class HomeWork14Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a word:");
       String word = sc.nextLine();

        int count = 0;
        for (int i = 0; i< word.length(); i++){
           count++;

        }
        System.out.println(count);
    }
}
