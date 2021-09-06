package Module01.TetsztVizsgaAlapok;

import java.util.Scanner;

public class TesztVizsga6Blueprint {
    public static int howManyPrime= input();
    public static void main(String[] args) {
        prime();
    }

    public static int prime() {
        {
            int howManyDividers = 0, run = 0, number = 1, divider = 1;
            while (run < howManyPrime) {
                divider = 1;
                howManyDividers = 0;
                while (divider <= number) {
                    if (number % divider == 0)
                        howManyDividers++;
                    divider++;
                }
                if (howManyDividers == 2) {
                    System.out.print(" "+ number);
                    run++;
                }
                number++;
            }
            return number;
        }
    }
    public static int input() {
        System.out.println("How many prime do you want? ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }


}
