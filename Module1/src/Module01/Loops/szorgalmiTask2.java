package Module01.Loops;

import java.util.Scanner;

public class szorgalmiTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a year: ");
        int year = sc.nextInt();

        /*Szökőévek a következők: minden néggyel osztható év, kivéve a százzal is oszthatókat.
         Szökőévek viszont a 400-zal osztható évek. Vagyis a századfordulók évei közül csak azok szökőévek,
          amelyek 400-zal is oszthatók.

    Ez alapján tehát szökőév 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020 és 2024.
    Nem szökőév 1700, 1800, 1900, 2100, 2200 és 2300. Viszont szökőévek a következő esztendők: 1600, 2000 és 2400.*/

       if(year % 4 == 0 && (year % 400 == 0 ||year % 100 !=0 )) {
           System.out.println("Elszökött");
       }
       else{
           System.out.println("Nope");
       }

    }
}
