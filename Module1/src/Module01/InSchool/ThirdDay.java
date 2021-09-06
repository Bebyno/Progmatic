package Module01.InSchool;

public class ThirdDay {
    public static void main(String[] args) {
//tömbök - Array
        int num1 =1 , num2 =2, num3 =3;
        int[] nums= {1,2,3};    //  ezt is írhattam volna int[] nums ={num1,num2,num3}
        int[] othernums = {5,6,7};
        String word = "gg";
        String[] words = {"", "a", "asd", word};

        int[][] arrays = {nums, othernums}; // mátrix-nak nevezzük a 2dimenziós tömbök.
        // tömb a tömbben - mátrix

        int[][][] deeparray = {arrays};
        /*
        deeparray.lenght - 1
        deeparray[0] - arrays
        arrays.lenght - 2
        arrays[0] - nums
        arrays[1] - othernums
         */

        int[] asd = new int[3];

        // az Array-nél amikor létrehozod, meg kell adni a mértetét azaz
        // az elemszámt :  int[] num = new int[6] a ->6 elemű
    }
}
