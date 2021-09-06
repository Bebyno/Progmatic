package Module01.recursion;

public class RecursionTask4String {
    //Recursiova válaszd el a számokat space-sel

    public static int num = 16728;

    public static void main(String[] args) {
        String strNum = ""+ num;
        numberToString(0,strNum,strNum.length());
    }

    public static void numberToString(int index, String strNumber, int end){
        if(end<1){
            return;
        }
        System.out.print(strNumber.charAt(index) + " ");

        numberToString(index +1,strNumber, --end);
    }
}
