package Module01.BasicTasks;

import java.util.Scanner;
// Maradékos osztás modulus nélkül.
public class HomeWork2Task {
    public static void main(String[] args) {
      /*  int number1 = 7;
        int number2 = 3;
        System.out.println(number1 - number2 * (number1 / number2));
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the 1. number: ");
        int num1 = sc.nextInt();
        System.out.println("Give me the 2. number: ");
        int num2 = sc.nextInt();
        System.out.println("The modulus = " + (num1 - num2 * (num1 / num2)));

    }

}
