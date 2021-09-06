package Module01.TetsztVizsgaAlapok;



public class TesztVizsga9FavoritForNow {
    public static int[] myIntArray = {1,2,2,3,4,5,7,7,7,1,8,9,9,9,2};
    public static int lenght = myIntArray.length;



    public static void main(String[] args) {
        printer();
    }
public static void printer(){
        int newLenght = differents();
    System.out.println("The elements are: ");
    for (int i = 0; i < newLenght; i++) {
        System.out.print(myIntArray[i]+",");
    }
    System.out.println("\n");
        System.out.println("The lenght is: "+newLenght);
}

    public static int[] bubbleSort(){
        int saving = 0;

        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < lenght - 1; i++) {
                if (myIntArray[i] > myIntArray[i+1]) {
                    saving = myIntArray[i];
                    myIntArray[i] = myIntArray[i+1];
                    myIntArray[i+1] = saving;
                    sorted = false;
                }
            }
        }
        //System.out.println(Arrays.toString(myIntArray));
        return myIntArray;
    }
    public static int differents(){
        int lenght = bubbleSort().length;
       // int[] tempArray = new int[lenght];
        int index = 0;
        for (int i = 0; i < lenght-1; i++) {
            if(myIntArray[i] != myIntArray[i+1]){
                myIntArray[index++] = myIntArray[i];
            }

        }
        myIntArray[index++] = myIntArray[lenght-1];

        //System.out.println(Arrays.toString(tempArray));
        //System.out.println(tempArray.length);
        return index;
    }
}
