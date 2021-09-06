package Module01.MyArraysTasks;

import java.util.Random;

public class Array3Task {
    public static void main(String[] args) {
        Random rn = new Random();
        int[]ints = new int[5];
        for( int i =0; i<ints.length;i++ ){
            ints[i] = rn.nextInt(101);
            System.out.println(ints[i]);
        }
        ints[0]++;
        System.out.println("____");
        for( int j = 0; j<ints.length; j++){
            System.out.println(ints[j]);
        }
    }
}
