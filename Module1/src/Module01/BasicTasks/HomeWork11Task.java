package Module01.BasicTasks;

import java.util.Scanner;
//négyzetgyök
public class HomeWork11Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the 1. number: ");
        int num1 = sc.nextInt();
        System.out.println(Math.sqrt(num1));
    }
}
