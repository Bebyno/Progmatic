package Module01.Loops;

import java.util.Scanner;

public class szorgalmiTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number = sc.nextInt();

       // int number = Integer.MAX_VALUE;
        boolean forditas = false;



        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0 ) {
                forditas = true;
                break;
            }
        }
        if (!forditas && number > 1) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not prime number");
        }
    }
}
