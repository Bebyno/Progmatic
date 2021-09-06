package Module01.BasicTasks;

import java.util.Scanner;
// hány számjegyből áll
public class HomeWork22Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number = sc.nextInt();
       // int number = 123;
        String numberInString = String.valueOf(number);
        System.out.println("The number is " +numberInString.length()+ " long");
    }
}
