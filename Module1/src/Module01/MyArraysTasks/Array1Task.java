package Module01.MyArraysTasks;

public class Array1Task {
    public static void main(String[] args) {
        int[] ints = new int[2];
        int[] ints2 = new int[2];// ha megadod az elemeket, akkor ne add meg a hosszát
        float[] floats = new float[2];
        boolean[] areBool = new boolean[2];
        char[] chars = new char[2];
        String[] strings = new String[2];
        Integer[] integers = new Integer[2];


        System.out.println(ints2[0]+" " +ints2[ints2.length-1]);
        System.out.println(floats[0]);
        System.out.println(areBool[0]);
        System.out.println(chars[0]);
        System.out.println(strings[0]);
        System.out.println(integers[0]+ " " + integers[integers.length-1]);
    }
}
