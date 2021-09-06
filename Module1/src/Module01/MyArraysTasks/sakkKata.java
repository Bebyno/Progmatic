package Module01.MyArraysTasks;
import java.util.Scanner;
import java.util.Arrays;

public class sakkKata {
    public static void main(String[] args) {
        System.out.println("Mekkora legyen a sakktáblánk élhossza? Írj be egy egész számot!");
        Scanner scanner = new Scanner(System.in);
        int size =  scanner.nextInt();
        boolean[][] matrixBoolChess = new boolean[size][size];

        boolean startBool;
        for (int i = 0; i < matrixBoolChess.length; i++) {
           /* if (i % 2 == 0) {
                boolean startBool= true;  //(startBool) elrakni az if boolean-jét, és felhasználni mint 1. lépés.
                //
                for (int j = 0; j < matrixChess.length; j++) {
                    if (j % 2 == 0) {
                        matrixChess[i][j] = true;//startBool
                    } else {
                        matrixChess[i][j] = false;// !startBool
                    }
                }
            }*/
            startBool = (i % 2 ==0) ;
            for (int j = 0; j < matrixBoolChess.length; j++) {
                if (j % 2 == 0) {
                    matrixBoolChess[i][j] = startBool;
                } else {
                    matrixBoolChess[i][j] = !startBool;
                }
            }
            System.out.println(Arrays.toString(matrixBoolChess[i]));
        }



        System.out.println("Jó lenne másképpen \"színezni\" a mezőket");
        System.out.println("Milyen karakter jelölje a világos mezőt?");
        System.out.println("Írj be egy számot!");
        int vilagos = scanner.nextInt();
        System.out.println("Milyen karakter jelölje a sötét mezőt?");
        System.out.println("Írj be egy számot!");
        int sotet = scanner.nextInt();

        int[][] matrixChess = new int[size][size];


        for (int i = 0; i < matrixChess.length; i++) {
            for (int j = 0; j < matrixChess.length; j++) {
                if (matrixBoolChess[i][j] == true) {
                    matrixChess[i][j] = vilagos;
                }
                else {
                    matrixChess[i][j] = sotet;
                }
            }
            System.out.println(Arrays.toString(matrixChess[i]));  }

        /*   else {
                for (int j = 0; j < matrixChess.length; j++) {
                    if (j % 2 == 1) {
                        matrixChess[i][j] = true;
                    } else {
                        matrixChess[i][j] = false;
                    }
                }
            }*/








        // System.out.println(Arrays.deepToString(matrixChess));       // mátrix kinyomtatás



       /*

        boolean[] myChessLine = {true,false,true,false,true,false,true,false};
        boolean[] myChessLine2 = {false,true,false,true,false,true,false,true};

        System.out.println(Arrays.toString(myChessLine));                                  //első, "hard" verzió
        System.out.println(Arrays.toString(myChessLine2));
        System.out.println(Arrays.toString(myChessLine));
        System.out.println(Arrays.toString(myChessLine2));
        System.out.println(Arrays.toString(myChessLine));
        System.out.println(Arrays.toString(myChessLine2));
        System.out.println(Arrays.toString(myChessLine));
        System.out.println(Arrays.toString(myChessLine2));
*/



    }
}
