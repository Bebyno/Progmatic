package Module01.recursion;

import java.util.ArrayList;
import java.util.List;

//Recursioval számolj 1-től 30-ig


public class RecursionTask1 {

    public static List<Integer> listam = new ArrayList<Integer>(10);

    public static void main(String[] args) {
        numbers1To10(1, 30);
        printList();
    }


public static void printList(){
    System.out.println(listam);
}

    public static int numbers1To10(int currentNumner, int end){

        if(end<1){
            return currentNumner;
        }

        listam.add(currentNumner);
        end--;
        return numbers1To10(currentNumner +1 , end);
    }
}
