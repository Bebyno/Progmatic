package Module01.PlusTasks;

import java.util.Random;
import java.util.Scanner;

public class elsoTask4 {
    public static void main(String[] args) {
        //az egyik játékos (mindegy, hogy melyik) legyen egy felhasználó, a másik pedig a program!
        // A programod kérje meg a felhasználót,
        // hogy dobjon, és írja ki a dobás eredményét. Ezt követően a program is dobjon,
        // és a saját dobásának eredményét is írja ki!
        //Játssz így a felhasználóval néhány kört – lehet akár 10, akár több. Rögzítsd a körök eredményét
        // (azt, hogy ki nyert), és a végén írd ki a képernyőre, hányszor nyert a felhasználó, hányszor nyert a program,
        // valamint a felhasználó és a program dobásainak átlagát is!
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

            System.out.println("Please press "+"\"enter" +"\"" + " to throw");
            Scanner sc = new Scanner(System.in);
            String enter = sc.nextLine() ;
            System.out.println(round + ". round");

            player1 = rand.nextInt(10+1);
            player1sum += player1;
            System.out.println("player1's number is: "+player1);

            player2 = rand.nextInt(10+1);
            player2sum += player2;
            System.out.println("computer's number is: "+player2);


            if(player1 > player2){
                System.out.println("Player 1 won the "+ round+ ". round"+ "\n");
                player1count++;
            }
            else if(player1 < player2){
                System.out.println("Computer won the "+ round+ ". round"+ "\n");
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

        System.out.println("Computer numbers sum: "+player2sum);
        System.out.println("Computer numbers average: "+player2sum/10+ ". he won " + player2count + " round" );
        System.out.println("There were " + draw + " draw rounds");



    }
}
