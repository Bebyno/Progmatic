package Module01.PlusTasks;
import java.util.Random;

//Először dobjanak csak egyszer,
// és írd ki a képernyőre, hogy melyikük nyert!
// (Az nyer, aki nagyobb számot dob. Ha ugyanakkorát dobnak, akkor egyikük sem nyer.)
//Futtasd le párszor ezt a programot.

public class elsoTask1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int player1 = rand.nextInt(10+1);
        System.out.println("player 1's number: " + player1 );
        int player2 = rand.nextInt(10+1);
        System.out.println("player 2's number: " + player2 );
        if (player1 > player2){
            System.out.println("Player 1 won, his number: "+player1);
        }
        else if(player2 > player1){
            System.out.println("Player 2 won, his number: "+player2);
        }
        else{
            System.out.println("Draw");
        }


    }
}
