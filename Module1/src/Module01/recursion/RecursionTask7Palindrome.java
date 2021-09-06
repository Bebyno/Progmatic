package Module01.recursion;

// recrsioval Palindrome (oda vissza egyforma?)

public class RecursionTask7Palindrome {
    public static String reversedWord= "radar";
    public static void main(String[] args) {
        String word = "radar";
        StringChecker(word,word.length()-1);
    }
    public static void  StringChecker(String input, int step){
        if(step<0){
            if(input.equals(reversedWord)) {
                System.out.println("The word is palindrome");
            }else{
                System.out.println("The word is not palindrome");
            }
            return;
        }
        reversedWord += input.charAt(step);


        StringChecker(input,--step);
    }

}
