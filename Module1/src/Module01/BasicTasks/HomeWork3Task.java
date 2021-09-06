package Module01.BasicTasks;

import java.util.Scanner;
//átlag float-ban
public class HomeWork3Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the 1. number: ");
        float num1 = sc.nextInt();
        System.out.println("Give me the 2. number: ");
        float num2 = sc.nextInt();
        System.out.println("Give me the 3. number: ");
        float num3 = sc.nextInt();
        System.out.println((num1+num2+num3) / 3);
    }
}
