package Module01.InSchool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FourthDay {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
       // int containing = 13;


        // for each

        for (int i= 0 ; i < nums.length; i++ ){
            System.out.println("elemek " +nums[i]);
        }
        for (int number : nums){
            System.out.println("SSS " +number);
        }

        System.out.println("----aaa----aaaaa-------");









        System.out.println("_______");
        // több dimenziós for 5 dimenziósra, hogy van ez?? video 11:26-kortól kezdődik

        int[][] matrix = {{1,2,3},{4,5,6}};
        for ( int i = 0; i< matrix.length; i++){
            System.out.println(i);
            for(int j= 0; j < matrix[i].length;j++) {
                System.out.println(j);
                System.out.println(matrix[i][j]);

            }
        }
        int[][][] matrix1 =  {{{1,2,3},{4,5,6},{7,8,9,}}};
        for ( int z = 0; z< matrix.length; z++){
            System.out.println(z);
            for(int u= 0; u < matrix[z].length;u++) {
                System.out.println(u);
                System.out.println(matrix[z][u]);





    }
            System.out.println();
            System.out.println();
            System.out.println();


            Integer[] bubble = new Integer[] {4,1,3,2,7,5,};
            List<Integer> player1throw = new ArrayList<Integer>();


            Random rand = new Random();
            for (int i = 0; i<10;i++) {
                int numbers = rand.nextInt(10 + 1);
                player1throw.add(numbers);
                System.out.println(player1throw);

            }
            int saving = 0;
            for (int j = 0 ; j < player1throw.size();j++){
                for ( int k = 0; k < player1throw.size()- j -1; k++ ) {

                    if(player1throw.get(k).compareTo(player1throw.get(k+1)) > 0){
                        saving = player1throw.get(k);
                        player1throw.set(k,player1throw.get(k+1));
                        player1throw.set(k+1,saving);
                    }
                }
            }
            System.out.println("_____");
            System.out.println(player1throw);
}}}
