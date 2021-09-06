package Module01.BasicTasks;

import java.util.Scanner;
// név bekérés és szövegbe helyezés
public class HomeWork16Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome dear " + name + "! Good to see you again!");
    }
}
