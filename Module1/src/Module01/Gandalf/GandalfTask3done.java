package Module01.Gandalf;

import java.util.Arrays;

public class GandalfTask3done {
    public static int[] weight = {84, 83, 82, 76, 61, 70, 58, 67, 72, 85};
    public static int counter = 0;

    public static void main(String[] args) {
        timer(sum());
        System.out.println("The time to need to cross the bridge: " + counter+ "min");
    }

    public static int[] sum() {
        int longness = weight.length / 2;
        int[] sum = new int[longness];
        int forward = 0;
        int backward = weight.length - 1;
        for (int i = 0; i < longness; i++) {
            sum[i] = weight[forward] + weight[backward];
            forward++;
            backward--;
        }
        System.out.println(Arrays.toString(sum));
        return sum;
    }
    public static int timer(int[] sum){

        for (int i = 0; i < sum.length; i++) {
            if (sum[i]< 150){
                counter= counter + 5;
            }
            else{
                counter= counter + 10;
            }
        }
        return counter;
    }


}
