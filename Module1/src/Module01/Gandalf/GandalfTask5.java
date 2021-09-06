package Module01.Gandalf;

public class GandalfTask5 {
    public static int[] dwarfHeight = { 130, 138, 135, 128, 130, 120, 125, 130, 110};
    public static int trollSize = 270;

    public static void main(String[] args) {
        howManyOptions();
    }
    public static int howManyOptions(){
        int counter= 0;
        for (int i = 0; i < dwarfHeight.length-1; i++) {
            if(dwarfHeight[i]+ dwarfHeight[i+1] >= trollSize){
                counter++;
            }
        }
        System.out.println("The are " + counter+ " dwarf combo to kill the Troll.");
        return counter;
    }

}
