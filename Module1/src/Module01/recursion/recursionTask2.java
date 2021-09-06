package Module01.recursion;

import java.util.ArrayList;
import java.util.List;


////Recursioval számolj vissza 10-től 1-ig

public class recursionTask2 {
    public static void main(String[] args) {
        numbers1To10(10, 10);
        printList();
    }

    public static List<Integer> listam2 = new ArrayList<Integer>(10);

    public static void printList(){
        System.out.println(listam2);
    }

    public static int numbers1To10(int currentNumner, int end){

        if(end<1){
            return currentNumner;
        }

        listam2.add(currentNumner);
        end--;
        return numbers1To10(currentNumner -1 , end);
    }
}
