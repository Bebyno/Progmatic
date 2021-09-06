package Module01.PlusTasks;

import java.util.Random;

public class elsoTask3 {
    public static void main(String[] args) {
        //Újfent módosítsd a programot: dobjanak ismét tízszer-tízszer, azonban most körönként írd ki a képernyőre,
        // hogy melyik játékos nyerte azt a kört! A tíz-tíz dobás után pedig az átlagaik mellett írd ki, hogy az egyik
        // és a másik játékos hány kört nyert!
        int player1;
        int player2;
        int player1sum = 0;
        int player2sum = 0;
        int player1count = 0;
        int player2count = 0;
        int round = 0;
        int draw = 0;

        Random rand = new Random();
        for (int i = 0; i<10;i++){
            round++;
            player1 = rand.nextInt(10+1);
            player1sum += player1;
            player2 = rand.nextInt(10+1);
            player2sum += player2;
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

        System.out.println("Player 2 numbers sum: "+player2sum);
        System.out.println("Player 2 numbers average: "+player2sum/10+ ". He/she won " + player2count + " round" );
        System.out.println("There were " + draw + " draw rounds");




    }
}
