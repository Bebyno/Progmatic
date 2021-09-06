package Module01.BasicTasks;

import java.util.Scanner;

// nagyobb szám
public class HomeWork8Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the 1. number: ");
        int num1 = sc.nextInt();
        System.out.println("Give me the 2. number: ");
        int num2 = sc.nextInt();
        System.out.println(Math.max(num1,num2));
    }
}
