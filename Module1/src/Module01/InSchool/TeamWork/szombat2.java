package Module01.InSchool.TeamWork;
public class szombat2 {

    public static byte[] bytes = {10,33,-2,0,56,-42,99,-73,60};
    public static char[] chars = {'A', '*','c','d','E',' '};
    public static int[] ints = {27, 969, -56, 1222, 8647000, -333, 7541, 89, 6502, -53042, 123, 876};
    public static double[] doubles = {3.14, -765.99, 52.4986, -10.3333337, 834.0965};
    public static String[] strings = {"alma","málna","barack","szilva"};

    public static int numOfArrays = 5;

    public static void main(String[] args) {

        int bytesLength = bytes.length;
        int charLength = chars.length;
        int intLength = ints.length;
        int doubleLength = doubles.length;
        int stringLength = strings.length;

        for (int i = 0; i < numOfArrays; i++) {

        }
        int[] lengthsOfArrays = {bytes.length, chars.length, ints.length, doubles.length, strings.length};
        int max = 0;
        int i = 1;
        for (i = 1; i < lengthsOfArrays.length; i++) {

            if (lengthsOfArrays[max] < lengthsOfArrays[i]) {
                max = i;
                System.out.println("Index: " + max + " Value: " + lengthsOfArrays[max]);
            }
        }
        switch (max){
            case 0:
                System.out.println("bytes");
                break;
            case 1:
                System.out.println("chars");
                break;
            case 2:
                System.out.println("ints");
                break;
            case 3:
                System.out.println("doubles");
                break;
            case 4:
                System.out.println("strings");
                break;

        }




    }
    public static int longestArray(){
        for (int i = 0; i < numOfArrays ; i++) {


        }

        return 0;
    }
}
