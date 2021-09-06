package Module01.BasicTasks;

import java.util.Scanner;
import java.util.Random;
// random szám inputtal
public class HomeWork13Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the bigger number: ");
        int num1 = sc.nextInt();
        System.out.println("Give me the smaller number: ");
        int num2 = sc.nextInt();


        Random rn = new Random();
        int answer = rn.nextInt(num1 + 1 - num2) + num2;
        //random.nextInt(max + 1 - min) + min; -> ez a mehanikája
        System.out.println(answer);
    }
}
