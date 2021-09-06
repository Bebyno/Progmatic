package Module01.extraArrays;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        byte[] bytes = {10,33,-2,0,56,-42,99,-73,60};
        char[] chars = {'A', '*','c','d','E',' '};
        int[] ints = {27, 969, -56, 1222, 8647000, -333, 7541, 89, 6502, -53042, 123, 876};
        double[] doubles = {3.14, -765.99, 52.4986, -10.3333337, 834.0965};
        String[] strings = {"alma","málna","barack","szilva"};

        // 1 feladat
        /*
        bytes: 9
        chars: 6
        ints: 12
        doubles: 5
        strings: 4
        */
        System.out.println("The longest is: ints array with "+ints.length + " elements");

        System.out.println("_______");

        // 2 feladat


        byte bytesum = 0;
        for(int i = 0; i < bytes.length;i++){
             bytesum +=  bytes[i];
        }
        System.out.println("Sum of bytes: "+bytesum); //115
        //  azért mert az 5. elem hozzáadásánál (41+56) fordul a byte (-128 :127)
        String charsum = " ";
        for(int i = 0; i < chars.length;i++){
            charsum +=  chars[i];
        }
        System.out.println("Sum of chars: "+charsum); // A*cdE (egyben)

        int intsum= 0;
        for(int i = 0; i < ints.length;i++){
            intsum +=  ints[i];
        }
            System.out.println("Sum of int: "+intsum); //8610918

        double doublesum= 0.0d;
        for(int i = 0; i < doubles.length;i++){
            doublesum += doubles[i];
        }
        System.out.println("Sum of doubles: "+doublesum); // 1133,411...

        String stringSum= "";
        for(int i = 0; i < strings.length;i++){
            stringSum += strings[i];
        }
        System.out.println("Sum of doubles: "+stringSum); // almamálnabarackszilva

        System.out.println("_______");

        // 3. feladat

        System.out.println("The first element of the array: "+bytes[0] + " and the last: " +bytes[bytes.length-1]);
        // első: 10 uccsó: 60
        System.out.println("The first element of the array: "+chars[0] + " and the last: " +chars[chars.length-1]);
        // első: A uccsó: ' '
        System.out.println("The first element of the array: "+ints[0] + " and the last: " +ints[ints.length-1]);
        // első: 27 uccsó: 876
        System.out.println("The first element of the array: "+doubles[0] + " and the last: " +doubles[doubles.length-1]);
        // első: 3.14 uccsó: 834,0965
        System.out.println("The first element of the array: "+strings[0] + " and the last: " +strings[strings.length-1]);
        // első: alma uccsó: szilva

        System.out.println("_______");
        // 4. feladat
        int bytesPozitivNumbers = 0;
        int bytesNegativNumbers = 0;
        for(int i = 0; i < bytes.length;i++){
            if(bytes[i]<0){
                bytesNegativNumbers++;
            }
            else{
                bytesPozitivNumbers++;
            }
        }
        System.out.println("The bytes array have " +bytesPozitivNumbers + " pozitiv number in it, and " +bytesNegativNumbers+" " +
                "negative.");

        // eredmény: 6+ , 3-


        int intsPozitivNumbers = 0;
        int intsNegativNumbers = 0;
        for(int i = 0; i < ints.length;i++){
            if(ints[i]<0){
                intsNegativNumbers++;
            }
            else{
                intsPozitivNumbers++;
            }
        }
        System.out.println("The ints array have " +intsPozitivNumbers + " pozitiv number in it, and " +intsNegativNumbers+" " +
                "negative.");
        //eredmény: 9+, 3-



        int doublesPozitivNumbers = 0;
        int doublesNegativNumbers = 0;
        for(int i = 0; i < doubles.length;i++){
            if(doubles[i]<0){
                doublesNegativNumbers++;
            }
            else{
                doublesPozitivNumbers++;
            }
        }
        System.out.println("The doubles array have " +doublesPozitivNumbers + " pozitiv number in it, and " +doublesNegativNumbers+" " +
                "negative.");
        //eredmény: 3+,2-

        System.out.println("_______");

        //5. feladat

        for( int i = 0; i< chars.length;i++){
            if(Character.isLetter(chars[i])){
                System.out.println(chars[i] + " is part of ABC");
            }
            else{
                System.out.println(chars[i] + " is not part of ABC");
            }
           // * ' ' is not part of ABC", AcdE is part of ABC"

        }

        System.out.println("_______");

    //6. feladat
        int longest = 0;
        String longestWord = "";
        for( int i = 0; i< strings.length; i++){
            if(strings[i].length()> longest){
                longest = strings[i].length();
                longestWord = strings[i];
            }

        }
        System.out.println("The longest word is: "+ longestWord+ ", its "+ longest+ " letter long.");
        // barack, 6 betű
        System.out.println("_______");



        // 7.feladat, 8. feladat
        double[] doubleBytes = new double[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            doubleBytes[i] = bytes[i];
        }
       // System.out.println(Arrays.toString(doubleBytes));

        double[] doubleints = new double[ints.length];
        for (int i = 0; i < ints.length; i++) {
            doubleints[i] = ints[i];
        }
        //System.out.println(Arrays.toString(doubleints));
        float sum = 0;
        int count = 0;
        double[][] multiArray = {doubleBytes,doubleints,doubles};
        System.out.println(Arrays.deepToString(multiArray));
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                count++;
                sum += multiArray[i][j];
            }
        }
        System.out.println("The sum is: "+sum+ ", and the average: " + sum /count );
        //The sum is: 8611172.0 an the average: 331198.94


        //feladat 9

        String stringNextEachOther= "";


        for (int i = 0; i < strings.length; i++) {
            stringNextEachOther += strings[i];

        }
        char[] stringToCharArray = new char[stringNextEachOther.length()];
        for (int i = 0; i < stringNextEachOther.length(); i++) {

        stringToCharArray[i] = stringNextEachOther.charAt(i);
        }

       System.out.println(Arrays.toString(stringToCharArray));

        //10. feladat

        char[][] matrix ={stringToCharArray,stringToCharArray};
        //System.out.println(Arrays.deepToString(matrix));

    }
}
