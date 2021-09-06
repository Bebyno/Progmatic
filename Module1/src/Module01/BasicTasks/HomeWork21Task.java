package Module01.BasicTasks;

public class HomeWork21Task {
    // '.' -> '-'
    public static void main(String[] args) {
        String text = "2021.05.05";
        String newText = "";
        for (int i = 0; i < text.length();i++){
            if (text.charAt(i) == '.'){
                newText += '-';
            }
            else{
                newText += text.charAt(i);
            }

        }
        System.out.println(newText);
    }
}
