package Module01.extraArrays;


import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rn = new Random();
        int min = 18;
        int max = 42;

        int myRandom = rn.nextInt(max - min + 1) + min;


        int[] number = new int[myRandom];
        System.out.println("The lenght if the array: " + myRandom);
        int elementsRandomNumber = rn.nextInt(100);
        int evenNumberCount = 0;
        int oddNumberCount = 0;
        int minNumber = 1000;
        int maxNumber = 0;
        int sum = 0;
        int average = 0;
        int different = 0;
        int smallerThanAverage = 0;
        int biggerThanAverage2x = 0;
        for (int i = 0; i < number.length; i++) {
            //elementsRandomNumber = rn.nextInt(100);
            number[i] = elementsRandomNumber;

            if (number[i] % 2 == 0) {
                evenNumberCount++;
            } else {
                oddNumberCount++;
            }

            if (number[i] < minNumber) {
                minNumber = number[i];
            }
            if (number[i] > maxNumber) {
                maxNumber = number[i];
            }
            sum += number[i];
            average = sum / 2;
            if (average - number[i] <= 2 && average - number[i] >= 0) {
                different++;
            }
            if (number[i] < average / 2) {
                smallerThanAverage++;
            }
            if (number[i] > average * 2) {
                biggerThanAverage2x++;
            }

        }
        System.out.println(evenNumberCount + " even numbers in the array.");
        System.out.println(oddNumberCount + " odd numbers in the array.");
        System.out.println(minNumber + " is the smallest number in the array");
        System.out.println(maxNumber + " is the biggest number in the array");
        System.out.println("The sum of the elemets: " + sum + " " +
                "the lenght of " + "the array: " + number.length + " so the average is: " + "" + sum / number.length);
        System.out.println("the number of the elements whos bigger(+2) or smaller(-2) than the different: " + different);
        System.out.println("the number of the elements whos smaller than half of the average: " + smallerThanAverage);
        System.out.println("the number of the elements whos bigger than twice the average : " + biggerThanAverage2x);
        System.out.println("______________________________");

        // plusz feladat
        int[] newNumber = new int[myRandom];
        int newmin= 10000000;
        int newmax = 0;
        int minPosition = 0;
        int maxPosition = 0;
        int newsum = 0;
        int newprintmin = 0;
        int newprintmax = 0;
        int[] sumsArray = new int[10];

        for(int tenTimes = 0; tenTimes <10; tenTimes++) {
            for (int i = 0; i < newNumber.length; i++) {
                elementsRandomNumber = rn.nextInt(100);
                newsum += elementsRandomNumber;
                newNumber[i] = elementsRandomNumber;
            }
            sumsArray[tenTimes] = newsum;
            newsum = 0;
            //System.out.println(Arrays.toString(newNumber));
        }
        System.out.println(Arrays.toString(sumsArray));

        for (int i = 0; i < sumsArray.length; i++) {


            if(sumsArray[i] < newmin){
                newmin = sumsArray[i];
                minPosition = i+1;
                newprintmin = sumsArray[i];

            }
            if(sumsArray[i] > newmax){
                newmax = sumsArray[i];
                maxPosition = i+1;;
                newprintmax = sumsArray[i];
            }
        }
        System.out.println("The min value: "+newprintmin+ " and the round when the array borned: "+minPosition);
        System.out.println("The max value: "+newprintmax+ " and the round when the array borned: "+maxPosition);

    }
}
