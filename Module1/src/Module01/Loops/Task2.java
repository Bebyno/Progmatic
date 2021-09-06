package Module01.Loops;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give your age: ");
        int number = sc.nextInt();
        if(number< 0){
            System.out.println("Hello, Marty Flybird");
        }
        else if(number <= 3){
            System.out.println("bru-bru-baby");

        }
        else if(number <=13){
            System.out.println("hello");
        }
        else if(number <=20){
            System.out.println("hi");
        }
        else {
            System.out.println("Good afternoon.");
        }

    }
}
