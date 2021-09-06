package Module01.InSchool.TeamWork;
import java.util.Scanner;
public class korOsztaly {
    /**
     * Írj programot, ami bekéri a felhasználó korát, majd a korától függően köszönti a felhasználót!
     * ● 0 és 3 év között így köszöni: "bru-bru-bruu babuci"
     * ● 3 és 13 év között: "szióka"
     * ● 13 és 20 év között: "csá"
     * ● 20 év felett: "Jó napot kívánok."
     * ● negatív érték esetén írja ki, hogy "Hello, Marty McFly!"
     *
     *     * input bekérés
     * szélsőérték kezelés (max)
     * input kezelés korosztályok szerint
     * nyomtatás
     */
    public static void main(String[] args) {
        int input = getInput();
        ages(input);


    }
    public static Scanner sc() {
        return new Scanner(System.in);
    }
    public static void ages(int age) {

        if(age<0){
            System.out.println("Hello, Marty Mcfly!");
        }else if (age<=3) {
            System.out.println("Bru, bruu babuci!");
        }else if (age<=13) {
            System.out.println("Szióka!");
        }else if (age<=20) {
            System.out.println("Csá!");
        }else if(age <= 110){
            System.out.println("Jó napot kívánok!");
        }else{
            System.out.println("Jesus Christ it's Jason Bourne");
        }
    }
    public static int getInput() {
        System.out.println("Enter an age: ");
        return sc().nextInt();
    }


}
