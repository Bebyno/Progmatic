package Module01.BasicTasks;

public class HomeWork24Task {
    // elős szó
    public static void main(String[] args) {
        String text = "In a hole in the ground there lived a hobbit.";
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (text.charAt(i) != ' ' && count == 0) {
                System.out.print(text.charAt(i));
            }
            else{
                count++;
            }
        }
    }
}