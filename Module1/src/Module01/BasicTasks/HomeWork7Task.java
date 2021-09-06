package Module01.BasicTasks;

import java.util.Scanner;
// x > 0: true, else false
public class HomeWork7Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int num1 = sc.nextInt();
        if (num1 > 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
