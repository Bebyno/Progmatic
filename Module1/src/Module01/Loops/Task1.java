package Module01.Loops;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("This number: "+ number + " is even!");
        }
        if(number % 2 == 1){
            System.out.println("This number: "+ number + " is odd!");
        }


    }
}
