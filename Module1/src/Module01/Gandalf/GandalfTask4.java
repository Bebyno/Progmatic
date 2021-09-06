package Module01.Gandalf;

public class GandalfTask4 {
    // 4 métert(400cm) kell elérni. Az 1. érték a súly, a 2. a magasság. csak az alacsonyabb és a könnyebb állhat ...

    /**
     * keressük meg a tömb kezdő tagját, avagy a legnehezz és egyben legmagasabb elemet.
     * Majd ezután keressük meg a 2. legnehezebb és legmagasabb elemet és vizsgáljuk meg egy if( x && y) megoldással,
     * ha mind2 érték kisebb akkor rakjuk be 2. elemnek és arra vizsgáljuk a következőket. (Voltaképp a 3. feladatot
     * kell behozni kis módosítással)
     */
    /*
    Legnagyobb súlyú az utolsó elem, de annál az 1. elem magasabb. zárjuk ki az utolsót, vegyük az 1. elemet.
    az első elemnél kisebb a 2. minden téren, viszont így kiesik a 3. elem. és a negyedik is, ezért inkább vegyük
    3. elemet a 2. tagnak és akkor vehetjük a 4.et is. (eddig - utolsó, 2) (eddig 1,3,4) a következő elem utolsó elötti
     majd ezután 6., 8, 5,7, . Tehát : 1,3,4,9,6,5,7 Kiesik: 2,10,8, +1
    az 5.
     */

    public static int[][] weightAndHeight = {{84, 144}, {83, 130}, {82, 138}, {76, 135}, {61, 128},
            {70, 130}, {58, 120}, {67, 125}, {72, 130}, {85, 110}};
    public static int[][] ladder = new int[weightAndHeight.length][2];


    public static void main(String[] args) {
        //System.out.println(144+138+135+130+128+120);  // 795 lesz a végeredmény.
        //System.out.println(84+82+76+72+70+61+58);
        theStartElement();
        bubbleSort();
        weithChecker();
        sumTheHeight();
    }

    public static int[][] theStartElement() {

        ladder = new int[weightAndHeight.length][2];
        int max = 100;
        int theBiggestIndex = 0;
        for (int i = 0; i < weightAndHeight.length; i++) {

            for (int j = 1; j < weightAndHeight[j].length; j++) {

                if (weightAndHeight[i][j] > max) {
                    max = weightAndHeight[i][j];
                    theBiggestIndex = i;
                    // System.out.println(max);


                }
            }
        }
        ladder[0] = weightAndHeight[theBiggestIndex];
       // System.out.println(Arrays.deepToString(ladder));
        return ladder;
    }

    public static void bubbleSort() {
        int[] saving = new int[2];

        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < weightAndHeight.length - 1; i++) {

                for (int j = 1; j < weightAndHeight[j].length; j++) {
                    if (weightAndHeight[i][j] < weightAndHeight[i + 1][j]) {
                        saving = weightAndHeight[i];
                        weightAndHeight[i] = weightAndHeight[i + 1];
                        weightAndHeight[i + 1] = saving;
                        sorted = false;
                    }
                }
            }
        }

        //System.out.println(Arrays.deepToString(weightAndHeight));

    }

    public static int[][] weithChecker() {
        for (int i = 1; i < weightAndHeight.length-1; i++) {
            for (int j = 0; j < weightAndHeight[j].length-1; j++) {
                if(weightAndHeight[i][j] < weightAndHeight[i -1][j]){
                    ladder[i] = weightAndHeight[i];
                }
            }
        }
       // System.out.println(Arrays.deepToString(ladder));
        return ladder;
    }
    public static int sumTheHeight(){
        int sum = 0;
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 1; j < ladder[j].length; j++) {
                sum += ladder[i][j];
            }

        }
        System.out.println("The height of dwarves are: "+sum+ " cm, so they can reach the keyhole." );
        return sum;
    }


}




