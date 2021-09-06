package Module01.recursion;

public class RecursionTask5OddEven {

    //recursioval páros-páratlan

    public static void main(String[] args) {
        evenOrOdd(1,20, false);
    }

    public static void evenOrOdd(int numbers, int end, boolean even){
        if(end<1){
            return;
        }
        if(even){
            if(numbers % 2 == 0){
                System.out.print(numbers + " ");
            }

        }
        else{
            if(numbers % 2 != 0){
                System.out.print(numbers+ " ");
            }
        }
        evenOrOdd(numbers +1,--end, even);

    }
}
