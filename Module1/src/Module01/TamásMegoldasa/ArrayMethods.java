package Module01.TamásMegoldasa;
import java.util.Random;

public class ArrayMethods {


    /**
     * Hozz létre egy int[] típusú, 5 elemet tartalmazó tömböt, és
     *         mindegyik elemének adj értékül egy-egy véletlenszerű számot!  - loadRandomArray()
     *         Írd ki a képernyőre a tömböt!  - printArray()
     *         Ezután növeld meg az első elem értékét eggyel!
     *         Ismét írd ki a képernyőre a tömböt!
     *         Hozz létre a korábban használt módszerrel még 2 tömböt és
     *         keresd meg a legmagasabb elemet
     *
     */

    public static void main(String[] args) {
        int[] nums1 = loadRandomArray(5);
        printArray(nums1);

        System.out.println("Increase first element");
        nums1[0]++;

        printArray(nums1);

        System.out.println("New arrays: ");
        int[] nums2 = loadRandomArray(8);
        int[] nums3 = loadRandomArray(10);

        printArray(nums2);
        printArray(nums3);

        getMaxFromMatrix(new int[][]{nums1, nums2, nums3});


        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7};

        int max1 = getMaxFromArray(array1);
        int max2 = getMaxFromArray(array2);

    }

    public static void getMaxFromMatrix(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            int arrayMax = getMaxFromArray(matrix[i]);
            if (max < arrayMax) {
                max = arrayMax;
            }
        }

        System.out.println("Max value: " + max);
    }

    public static int getMaxFromArray(int[] array) {
        int max = array[0];
        for (int j = 1; j < array.length; j++) {
            //max = max < matrix[i][j] ? matrix[i][j] : max;
            if (max < array[j]) {
                max = array[j];
            }
        }
        return max;
    }

    public static void printArray(int[] array) {
        System.out.print("My array has the following values:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("!");
    }

    public static int[] loadRandomArray(int size) {
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = getRandom();
        }
        return nums;
    }

    public static int getRandom() {
        Random random = new Random();
        return random.nextInt();
    }

}