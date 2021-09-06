package Module01.PlusTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class elsoTask6 {
    public static void main(String[] args) {
        //Módosítsd a programot úgy, hogy a program a játék elején kérdezze meg a felhasználótól,
        // hogy hány oldalas dobókockával szeretne dobni! A játék alatt használd azután ezt a dobókockát.
        // (Például ha a felhasználó azt írja, hogy 20, akkor 1 és 20 közötti számot dobhatnak.)
        //Ennél a módosításnál töröld a számlálót! Hacsak nem tudod megoldani, hogy mégis benne maradjon.

        int player1;
        int player2;
        int player1sum = 0;
        int player2sum = 0;
        int player1count = 0;
        int player2count = 0;
        int round = 0;
        int draw = 0;
       List<Integer> player1throw = new ArrayList<Integer>();
        List<Integer> player2throw = new ArrayList<Integer>();

        System.out.println("How many sides you want for the dice? ");
        Scanner sc = new Scanner(System.in);
        int sides = sc.nextInt();

        Random rand = new Random();
        for (int i = 0; i<10;i++){
            round++;
            player1 = rand.nextInt(sides+1);
            player1sum += player1;
            player1throw.add(player1);



            player2 = rand.nextInt(sides);
            player2sum += player2;

            player2throw.add(player2);

            if(player1 > player2){
                System.out.println("Player 1 won the "+ round+ ". round");
                player1count++;

            }
            else if(player1 < player2){
                System.out.println("Player 2 won the "+ round+ ". round");
                player2count++;
            }
            else{
                System.out.println("Draw");
                draw++;
            }


        }
        System.out.println("______");
        System.out.println("Player 1 numbers sum: "+player1sum);
        System.out.println("Player 1 numbers average: "+player1sum/10 + ". He/she won " + player1count + " round");
        System.out.println(player1throw);

        System.out.println("Player 2 numbers sum: "+player2sum);
        System.out.println("Player 2 numbers average: "+player2sum/10+ ". He/she won " + player2count + " round" );
        System.out.println("There were " + draw + " draw rounds");
        System.out.println(player2throw);
    }
}
