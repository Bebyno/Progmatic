package Module01.InSchool.TeamWork;

import java.util.Scanner;

        public class pithaKata {

            public static int[] inputs = new int[3];
            public static int inputMax;
            public static boolean isPythagorean;
            public static Scanner scanner;

            public static void main(String[] args) {
                scanner = getScanner();

                getInputs();

                getInputMax();

                checkPythagorean();



        /*//------------Eredeti verzió--------------------------
         a^2+b^2 = c^2
         a^2+b^2+c^2 = c^2*c^2
        System.out.println("Ha kapok három számot, megmondom, hogy vajon pitagoraszi számhármas-e!");
        System.out.println("Kérem az első számot.");
        Scanner scanner = new Scanner(System.in);
        int num51 = scanner.nextInt();

        System.out.println("Kérem a második számot.");
        int num52 = scanner.nextInt();
        System.out.println("Kérem a harmadik számot.");
        int num53 = scanner.nextInt();
//keressük a maximumot!

        int max1 = Math.max(num51, num52);
        int max2 = Math.max(max1, num53);

        int sumAtfogokNegyzete;
        int befogoNegyzete;
        befogoNegyzete = (max2*max2);
        sumAtfogokNegyzete = (num51*num51) + (num52*num52) + (num53*num53) - (max2*max2);

        if (sumAtfogokNegyzete == befogoNegyzete) {
            System.out.println("Ez egy pitagoraszi számhármas.");}
        else
        {System.out.println("Ez nem egy pitagoraszi számhármas.");}
    }*/
            }

            public static void getInputs() {
                System.out.println("Tell me 3 numbers and I tell you whether" +
                        " they make a Pythagorean triple together or not.");
                for (int i = 0; i < inputs.length; i++) {
                    System.out.println("Add your " + (i + 1) + ". number!");
                    inputs[i] = scanner.nextInt();
                }
                // System.out.println("Your numbers are:");
                // System.out.println(Arrays.toString(inputs));
            }


            public static void getInputMax() {
                for (int i = 0; i < inputs.length - 1; i++) {               //az egyenlőséget nem kezeli, de nem is okoz hibát
                    inputMax = Math.max(inputs[i], inputs[i + 1]);
                }
                // System.out.println("The biggest one of your numbers is: " + inputMax);

            }


            public static void checkPythagorean() {
                int sumSq =0;
                for (int input : inputs) {                          //'for' loop replaceable with enhanced 'for'
                    sumSq += input * input;
                    // System.out.println("Current sum is: " + sumSq);
                }

                if (isPythagorean = sumSq/2 == inputMax*inputMax) {
                    System.out.println("Your numbers make a Pythagorean triple together.");}
                else System.out.println("Your numbers don't make a Pythagorean triple together.");

            }


            public static Scanner getScanner () {
                return new Scanner(System.in);
            }


    }

