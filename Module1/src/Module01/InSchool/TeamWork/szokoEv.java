package Module01.InSchool.TeamWork;
  /*Szökőévek a következők: minden néggyel osztható év, kivéve a százzal is oszthatókat.
         Szökőévek viszont a 400-zal osztható évek. Vagyis a századfordulók évei közül csak azok szökőévek,
          amelyek 400-zal is oszthatók.

    Ez alapján tehát szökőév 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020 és 2024.
    Nem szökőév 1700, 1800, 1900, 2100, 2200 és 2300. Viszont szökőévek a következő esztendők: 1600, 2000 és 2400.*/

import java.util.Scanner;

/**
 * 1 lépés : kell egy input method , lementjük egy Osztály válotzóba
 * 2.  Függvénynek a paraméternek adjuk meg a feladat mat. értékeit, majd booleanként returnölünk.
 * 3.(egy külön függvény ami megvizsgálja a returnölt booleineket.
 */




public class szokoEv {
    public static Scanner sc;
    public static int year;


    public static void main(String[] args) {
        printInput();

    }

    public static void printInput() {
        inputConverToInt();
        if (isLeapYear()) {
            System.out.println("Your choosen year is: " + year+ " which is leap year!");
        } else {
            System.out.println("Your choosen year is: " + year + " which is not a leap year!");
        }
    }

    public static Scanner input(){
        return new Scanner(System.in);
    }
    public static int inputConverToInt(){
        System.out.println("Give me a year: ");
        year = input().nextInt();
        return year;
    }

    public static boolean isDivideable(int number){

        return  (year % number == 0);

    }


    public static boolean isLeapYear() {
       if(isDivideable(400)){
           return true;

       }
       else if(isDivideable(100)){
           return false;
       }
       else if(isDivideable(4)){

           return true;
       }
       else{
           return false;
       }


   }
}
