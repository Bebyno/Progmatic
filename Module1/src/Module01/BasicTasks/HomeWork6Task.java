package Module01.BasicTasks;

import java.util.Scanner;
//char összefüzve
public class HomeWork6Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the 1. char: ");
        char char1 = sc.next().charAt(0) ;
        System.out.println("Give me the 2. char: ");
        char char2 = sc.next().charAt(0) ;

        System.out.print(char1);
        System.out.print(char2);
    }
}
