package Module01.Loops;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a color: ");
        String color = sc.nextLine();

        if(color.equals("red")){
            System.out.println("Red is forbidden");
        }
        else if( color.equals("green")){
            System.out.println("Free");
        }
        else{
            System.out.println("N/A");
        }
    }
}
