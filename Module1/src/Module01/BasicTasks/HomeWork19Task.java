package Module01.BasicTasks;

public class HomeWork19Task {
    // 1. és uccsó betű
    public static void main(String[] args) {
        String text = "There is nothing either good or bad, but thinking makes it so";
        //Shakespeare - Hamlet
        int lenght = text.length();

        char firstWord = text.charAt(0);
        char lastWord = text.charAt(lenght - 1);

        System.out.println("The first letter is: " + "\""+ firstWord+ "\"" + " and the last letter is: " + "\""+lastWord+"\"");
    }
}
