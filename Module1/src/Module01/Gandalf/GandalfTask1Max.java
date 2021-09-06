package Module01.Gandalf;

import java.util.Arrays;

public class GandalfTask1Max {
    public static int[] hill = {100, 430, 380, 230, 310, 225, 213, 178, 202, 30, 110};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(hill));
        System.out.println("The highest part of the hill: " + (maxHillPart()+1));
    }

    public static int maxHillPart(){
        int max = hill[0];
        int index = 0;
        for(int high : hill){
            if(high > max){
                max = high;
                index++;

            }

        }
        return index;
    }
}
