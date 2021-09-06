package Module01.PlusTasks;

import java.util.Random;

public class elsoTask2 {
    public static void main(String[] args) {
        //Módosítsd a programot úgy, hogy a játékosok játsszanak egy „meccset”: dobjon mindegyikük tízszer!
        //Összegezd a dobásaik eredményét külön-külön. A meccs után írd ki a képernyőre a dobásaik átlagát!

        int player1;
        int player2;
        int player1sum = 0;
        int player2sum = 0;

        Random rand = new Random();
        for (int i = 0; i<10;i++){

        player1 = rand.nextInt(10+1);

        player1sum += player1;
        }
        System.out.println("Player 1 numbers sum: "+player1sum);
        System.out.println("Player 1 numbers average: "+player1sum/10);

        for (int i = 0; i<10;i++) {

            player2 = rand.nextInt(10+1);
            player2sum += player2;
        }
        System.out.println("Player 2 numbers sum: "+player2sum);
        System.out.println("Player 2 numbers average: "+player2sum/10);

    }
}
