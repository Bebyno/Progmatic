package Module01.Gandalf;

public class GandalfTask2done {

    public static int[] hill = {100, 430, 380, 230, 310, 225, 213, 178, 202, 30, 110};

    public static void main(String[] args) {
        maxHillPart();
    }

    public static void maxHillPart() {
        // int max = hill[0];
        int place = 0;
        int step = 0;
        //  int i = 0;
        for (int j = 0; j < hill.length-1; j++) {
            int max = hill[j];
            place++;
            for ( int i = j; i < hill.length; i++) {

                if (hill[i] > max) {
                    max = hill[i];


                }
            }
            System.out.println("Place: " + place + "max: " + max);


        }

    }
}


