package Module01.PlusTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class elsoTask5 {
    public static void main(String[] args) {
        //Bővítsd ki a programodat számlálóval!
        // A játék közben rögzítsd, hogy melyik számot hányszor dobta valamelyik játékos. A végén írd ki a képernyőre,
        // hogy melyik volt a leggyakrabban dobott szám! (Ha esetleg holtverseny alakult ki,
        // elég csak az egyik számot kiírnod.)

        int player1;
        int player2;
        int player1sum = 0;
        int player2sum = 0;
        int player1count = 0;
        int player2count = 0;
        int round = 0;
        int draw = 0;

        int samenumber=0;
        int commonnumber1 = 0;
        int commonnumber2 = 0;
        List<Integer> player1throw = new ArrayList<Integer>();
        List<Integer> player2throw = new ArrayList<Integer>();



        Random rand = new Random();
        for (int i = 0; i<10;i++){
            round++;
            player1 = rand.nextInt(10+1);
            player1sum += player1;
            player1throw.add(player1);



            player2 = rand.nextInt(10+1);
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

            int saving = 0;
            // lista elemeket sorba rendezni, és azután megvizsgálni a szomszédos elemeket bubblesort-tal.
                                     // ! bubblesort in JAVA!
            for (int j = 0 ; j < player1throw.size();j++){
                for ( int k = 0; k < player1throw.size()- j -1; k++ ) {

                if(player1throw.get(k).compareTo(player1throw.get(k+1)) > 0){
                saving = player1throw.get(k);
                player1throw.set(k,player1throw.get(k+1));
                player1throw.set(k+1,saving);
                }
                }
            }
            int saving2 = 0;
            for (int x = 0 ; x < player2throw.size();x++){
                for ( int y = 0; y < player2throw.size()- x -1; y++ ) {

                    if(player2throw.get(y).compareTo(player2throw.get(y+1)) > 0){
                        saving2 = player2throw.get(y);
                        player2throw.set(y,player2throw.get(y+1));
                        player2throw.set(y+1,saving2);
                    }
                }
            }
        }
// kell egy változó ami számolja a gyakorisáogt és kell 1 ami el is rakja ezt a gyakori számot.
        // a samenumbernek le kell 0zodnia minde egyes új szám után
        int commonNumber0 = 0; // ebbe kéne berakni a commonNumber1ből a számoat és egymáshoz vizsgálni
        // vagyis lehet ez nem jó, mert nekem a gyakoriságot kell vizsgálni, ezzel a szám nagyságát tudom.
            for(int z = 0; z<player1throw.size()-1;z++){
        int commonestNumber = 0;
                if(player1throw.get(z) == player1throw.get(z+1)){
                    samenumber++;
                    if(samenumber >= 2){
                        commonnumber1 = player1throw.get(z);
                    }
                    // if (player1throw.get(z) != player1throw.get(z+1){
                    // samenumber = 0}
                }
            }

        for(int u = 0; u<player2throw.size()-1;u++){

            if(player2throw.get(u) == player2throw.get(u+1)){
                samenumber++;
                // samenumber >= 2 ? 3:2
                if(samenumber >= 2){
                    commonnumber2 = player2throw.get(u);
                }
            }
        }






        System.out.println("______");
        System.out.println("Player 1 numbers sum: "+player1sum);
        System.out.println("Player 1 numbers average: "+player1sum/10 + ". He/she won " + player1count + " round");
        System.out.println("Most common number from player1 is: "+commonnumber1);
        System.out.println(player1throw);

        System.out.println("Player 2 numbers sum: "+player2sum);
        System.out.println("Player 2 numbers average: "+player2sum/10+ ". He/she won " + player2count + " round" );
        System.out.println("There were " + draw + " draw rounds");
        System.out.println("Most common number from player2 is: "+commonnumber2);
        System.out.println(player2throw);
    }
}
