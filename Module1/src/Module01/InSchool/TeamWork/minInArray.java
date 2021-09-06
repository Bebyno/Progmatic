package Module01.InSchool.TeamWork;
// 1 tömb valamennyi elem. Hozzá függvényt ami a minimumot keres.
public class minInArray {

    public static void main(String[] args) {
        printMin();


    }
    public static void printMin(){
        System.out.println(minArray());
    }

    public static int minArray(){
        int[] array = {111,2,3,6,-1};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];

            }
        }
        return min;

    }
}
