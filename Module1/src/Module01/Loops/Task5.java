package Module01.Loops;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Give me 3 number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1 :");
        double a = sc.nextDouble();
        System.out.println("Number 2 :");
        double b = sc.nextDouble();
        System.out.println("Number 3 :");
        double c = sc.nextDouble();

        if(Math.pow(a,2)+ Math.pow(b,2) == Math.pow(c,2)){
            System.out.println("Pitagoras");
        }
        else{
            System.out.println("Nyet tovarishch");
        }
    }
}
