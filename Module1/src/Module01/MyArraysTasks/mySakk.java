package Module01.MyArraysTasks;

import java.util.Arrays;
public class mySakk {



    public class sakk {
        public static void main(String[] args) {


            boolean[][] matrixChess = new boolean[8][8];
            boolean startBool= true;

            for (int i = 0; i < matrixChess.length; i++) {

                if (i % 2 == 0) {
                    for (int j = 0; j < matrixChess.length; j++) {
                        if (j % 2 == 0) {
                            matrixChess[i][j] = startBool;
                        } else {
                            matrixChess[i][j] = !startBool;
                        }
                    }
                }
                else {
                    for (int j = 0; j < matrixChess.length; j++) {
                        if (j % 2 == 1) {
                            matrixChess[i][j] = startBool;
                        } else {
                            matrixChess[i][j] = !startBool;
                        }
                    }
                }
                System.out.println(Arrays.toString(matrixChess[i]));
            }
        }
    }


}
