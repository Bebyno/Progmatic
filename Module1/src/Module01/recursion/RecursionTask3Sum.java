package Module01.recursion;

////Recursioval add össze a számokat

public class RecursionTask3Sum {
    public static int sum = 0;

    public static void main(String[] args) {
        numbers1To10(1, 10);
        System.out.println(sum);
    }




    public static int numbers1To10(int currentNumner, int end){

        if(end<1){
            return currentNumner;
        }
        end--;
        sum += currentNumner;
        return numbers1To10(currentNumner +1 , end);
    }
}


