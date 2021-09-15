package main;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTestTest {
    public static int[] arr = {1, 2, 3, 4, 5, 6};
    public static int[][] matrix = {
            {1, 2, 3,},
            {4, 5, 6,},
            {7, 8, 9,},
    };
    public static int[][] matrix2 = {
            {6, 2, 12,},
            {1, 5, 66,},
            {70, 3, 9,},
    };

    @Test
    void getLastNumber() {
        Assert.assertEquals(arr[arr.length - 1], ModuleTest.getLastNumber(arr));

    }

    @Test
    void countEvenNumbers() {
        Assert.assertEquals(3, ModuleTest.countEvenNumbers(arr));
    }

    @Test
    void findNumber() {
        Assert.assertEquals(2, ModuleTest.findNumber(arr, 3));
    }

    @Test
    void countSameNumbers() {
        Assert.assertEquals(2, MySolution.countSameNumbers(new int[]{0, 1, 2, 3, 4}, new int[]{5, 6, 5, 4, 4, 4, 3}));
    }

    @Test
    void findMaxIndex() {
        //  int[] arr = {2, 3, 66, 4, 34};
        Assert.assertEquals(5, MySolution.findMaxIndex(arr));

    }

    @Test
    void getTopLeftNumber() {

        Assert.assertEquals(1,ModuleTest.getTopLeftNumber(matrix));

    }

    @Test
    void getDiagonalDifference() {
        Assert.assertEquals(67,ModuleTest.getDiagonalDifference(matrix2));
        Assert.assertEquals(0,ModuleTest.getDiagonalDifference(matrix));
    }

    @Test
    void willWizardsBeTogether() {
        Assert.assertFalse(ModuleTest.willWizardsBeTogether(3,4,2,1));
        Assert.assertFalse(ModuleTest.willWizardsBeTogether(3,4,4,1));
        Assert.assertTrue(ModuleTest.willWizardsBeTogether(6,2,2,4));
    }

    @Test
    void findTheOneSock() {
        int[] arr ={30, 10, 30, 10, 30, 30, 20, 10, 30, 10, 30};
        int[] arr2 = {56, 1, 33, 42, 0, 86, 42, 86, 1, 56, 0};

        Assert.assertEquals(20,ModuleTest.findTheOneSock(arr));
        Assert.assertEquals(33,ModuleTest.findTheOneSock(arr2));

    }
}