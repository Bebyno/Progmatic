import java.util.Arrays;

public class Task4 {
    /**
     * - Van ismétlődés a tömbben? (Szerepel-e többször ugyanaz a szám?)
     * - Hány számjegyből állnak a számok a tömbben? Írd ki a képernyőre mindegyiket egyesével!
     * - Hány különböző számjegyből állnak a számok a tömbben? (Hint: Set.)
     * - Hány szám van, ami a különböző számjegyekből áll? (Hint: Map.)
     * - És melyik szám melyik számjegyhez tartozik - úgymond? Válogasd szét a számjegyeket
     * az alapján, hogy hány számjegyből állnak! (Hint: a Map-ben értékként tárolhatsz adatstruktúrákat.)
     */

    private int[] numbers = {34808, 422, 334, 12014, 412617, 292389, 342260, 32244,
            334534, 497721, 3775, 544, 433, 55340, 257952, 1496173, 539141, 3355, 305720, 3677429, 114047, 5656};


    public int[] bubbleSort(int[] nums) {
        int saving = 0;

        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    saving = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = saving;
                    sorted = false;
                }
            }
        }
        //   System.out.println(Arrays.toString(nums));
        return nums;

    }

    public boolean duplicateChecker() {
        int[] arrayChecker = bubbleSort(numbers);
        for (int i = 0; i < arrayChecker.length - 1; i++) {
            if (arrayChecker[i] == arrayChecker[i + 1]) {
                System.out.println("There is duplicate in the array");
                return true;
            }
        }
        System.out.println("There is no duplicate in the array");
        return false;
    }

    public String[] intToStringArray() {
        String[] longnessArray = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            longnessArray[i] = String.valueOf(numbers[i]);
        }
        return longnessArray;
    }

    public void howManyChacarcter() {
        int num = 0;
        String[] stringArray = intToStringArray();
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print("The "+ (i+1)+". element of the array is: " +stringArray[i]);
            num = stringArray[i].length();
            System.out.println(" and its "+num+" charcter long");
        }
    }


    public static void main(String[] args) {
        Task4 myMain = new Task4();
        myMain.duplicateChecker();
        System.out.println("____");
        myMain.howManyChacarcter();
        System.out.println("____");
    }


}
