package Module01.TetsztVizsgaAlapok;

import java.util.Scanner;

public class TesztVizsga3Fixed {
    public static int input;

    public static void main(String[] args) {
    printer();
    }

    public static void printer(){
        System.out.println("The number of div.Pars: "+dividerPars());
    }

    public static int howManyDivider(){
        int dividers = input();

        int counter = 0;
        for (int i = 1; i <= dividers; i++) {
            if(dividers % i == 0){
                counter++;
                System.out.println(i);
            }

        }

        return counter;
    }
    public static int dividerPars() {
        int dividers = howManyDivider();
        if (dividers % 2==0){
        return dividers / 2;
        }else{
            return dividers/2+1;
        }

    }
// felfelé kerekítés ceil.


    public static int input() {
        System.out.println("Give me a number: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        return input;
    }
}
