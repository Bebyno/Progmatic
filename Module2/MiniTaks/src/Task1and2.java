import java.util.HashSet;
import java.util.Set;

public class Task1and2 {
    /**
     * Készíts Set-et ebből a tömbből úgy, hogy végigmész a tömbön, és egyesével hozzáadod
     * a Set-hez a tömbben szereplő számokat.
     * (Van erre built-in Java módszer is, de most ne azt használd!)
     * Hány darab különböző számot tartalmaz a tömb? (A létrehozott Set alapján ez már könnyen megmondható.)
     */
    int[] numbers = {1, 2, 7, 2, 3, 4, 10, 8, 9, 11, 5, 4, 3, 6, 5, 6, 5, 1, 8, 10, 9, 15};
    private Set<Integer> numbersInSet = new HashSet<>();
    private Set<Integer> oddNumberSet = new HashSet<>();
    private Set<Integer> evenNumberSet = new HashSet<>();


    public Set<Integer> intToSet() {

        for (int i = 0; i < numbers.length; i++) {
            numbersInSet.add(numbers[i]);

        }
        System.out.println(numbersInSet);
        return numbersInSet;
    }


    public void oddOrEven() {
        int oddNumbers = 0;
        int evenNumbers = 0;

        for (int number : numbersInSet) {
            if (number % 2 == 1) {
                oddNumbers++;
                oddNumberSet.add(number);
            } else {
                evenNumbers++;
                evenNumberSet.add(number);
            }
        }
    }

    public static void main(String[] args) {
        Task1and2 myMain = new Task1and2();
        //myMain.intToSet();
        System.out.println("lenght: " + myMain.intToSet().size());
        myMain.oddOrEven();
        System.out.println("Odds lenght: " + myMain.oddNumberSet.size());
        System.out.println("Odds: " + myMain.oddNumberSet);
        System.out.println("Evens lenght: " + myMain.evenNumberSet.size());
        System.out.println("Evens: " + myMain.evenNumberSet);
    }


}
