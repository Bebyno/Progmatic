package Module01.BasicTasks;

public class HomeWork20Task {
    // első és uccsó "t"
    public static void main(String[] args) {
        String text = "There is nothing either good or bad, but thinking makes it so";
        //Shakespeare - Hamlet
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 't' && count == 0) {
                System.out.println("The first " + "\"" + "t" + "\"" + " place is: " + (i + 1));
                count++;
            }
        }
        count = 0;
        for (int j = text.length() - 1; j >= 0; j--) {
            if (text.charAt(j) == 't' && count == 0) {
                System.out.println("The last " + "\"" + "t" + "\"" + " place is: " + (j + 1));
                count++;


            }
        }
        System.out.println("Btw the sentence is "+ text.length() + " letter long.");
    }
}
