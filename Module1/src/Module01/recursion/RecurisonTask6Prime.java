package Module01.recursion;

public class RecurisonTask6Prime {

    //Prime?


    public static int number = 32;
    public static int counter = 0;
    public static void main(String[] args) {
    primeOrNot(number, number);
    }
    public static void primeOrNot(int number, int currentNumber){
       if(number % currentNumber == 0){
           counter++;
       }
       if(counter > 2){
           System.out.println("The number "+ number +" is not a prime number");
           return;
       }
       if(currentNumber == 1){
           System.out.println("The number "+ number +" is a prime number");
           return;
       }
       primeOrNot(number,--currentNumber);
    }

}
