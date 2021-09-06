package Module01.TetsztVizsgaAlapok;

import java.util.Scanner;

public class TesztVizsga2WithBonus {

    public static int numberAsInput = number();
    public static int limiter = limiter();

    public static void main(String[] args) {
    printer();
    }

    public static void printer(){
        System.out.println("Your number have "+ divinersNumber()+ " diviner." );
    }

   public static int divinersNumber(){
        int counter = 0;
       for (int i = 1; i <= numberAsInput; i++) {
        if(numberAsInput % i == 0 && limiter > 0){
            limiter--;
            counter++;
           System.out.println(i);
        }

       }

        return counter;
   }
    public static int limiter(){
        System.out.println("Give me a limiter: ");
        return input();
    }

    public static int number(){
        System.out.println("Give me a number: ");
        return input();
    }

    public static int input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    /*public static int input() {
        System.out.println("Give me a number: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        return input;
    }*/
}
