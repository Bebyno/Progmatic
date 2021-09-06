package Module01.BasicTasks;

import java.util.Random;

//random szám 0-10ig
public class HomeWork12Task {
    public static void main(String[] args) {
        //int min = 0;
        //int max = 10;
        Random rn = new Random();
        int answer = rn.nextInt(10) + 1;
        System.out.println(answer);

    }
}
