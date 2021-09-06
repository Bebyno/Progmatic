package Module01.BasicTasks;

import java.util.Scanner;
//,+,-,*,/
public class HomeWork5Task {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the 1. number: ");
        int a = sc.nextInt();
        System.out.println("Give me the 2. number: ");
        int b = sc.nextInt();
        System.out.println("A számok összege:" + (a + b) +" különbsége:" +
                + (a-b) + " szorzata:" + (a*b) + " osztási eredménye:" + (a/b));
    }
}