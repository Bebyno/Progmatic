package Module01.MyArraysTasks;

public class Array2Task {
    public static void main(String[] args) {
        int[] ints = new int[]{1,2,7};
        int[] ints2 = new int[2];// ha megadod az elemeket, akkor ne add meg a hosszát
        ints2[0]= 11;
        float[]floats = new float[2];
        floats[0] = 4.5f;
        boolean[] areBool = new boolean[]{true,false};
        char[] chars = new char[2];
        chars[0] = 'g';
        String[] strings = new String[]{"as","asdd"};
        Integer[] integers = new Integer[2];

        integers[0]= 3;


        System.out.println(ints2[0]+" " +ints2[ints2.length-1]);
        System.out.println(floats[0]+ " " + floats[floats.length-1]);
        System.out.println(areBool[0]);
        System.out.println(chars[0]+ " "+ chars[chars.length-1]);
        System.out.println(strings[0]);
        System.out.println(integers[0]+ " " + integers[integers.length-1]);
    }
}
