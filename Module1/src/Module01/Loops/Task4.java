package Module01.Loops;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me your gender (no/ffi): ");
        String gender = sc.nextLine();
        System.out.println("Give me your size (cm): ");
        int size = sc.nextInt();


        if(gender.equals("ffi")){
            if(size > 176){
                System.out.println("Átlagnál magasabb");
            }
            else if(size < 176){
                System.out.println("Átlagnál alacsonyabb");
            }
            else{
                System.out.println("Átlagos");
            }
        }
        if(gender.equals("no")){
            if(size > 164){
                System.out.println("Átlagnál magasabb");
            }
            else if(size < 164){
                System.out.println("Átlagnál alacsonyabb");
            }
            else{
                System.out.println("Átlagos");
            }
        }






        /*

        if(gender.equals("ffi") && size > 176){
            System.out.println("Átlagnál magasabb");
        }
        else if(gender.equals("ffi") && size < 176){
            System.out.println("Átlagnál alacsonyabb");
        }
        else{

            System.out.println("Átlagos");
        }

        if(gender.equals("no") && size > 164) {
            System.out.println("Átlagnál magasabb");
        }
        if(gender.equals("no") && size < 164) {
            System.out.println("Átlagnál alacsonyabb");
        }
        else{
        System.out.println("Átlagos");
            }
            */

    }
}
