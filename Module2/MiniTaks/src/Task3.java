import java.util.HashMap;
import java.util.Random;

public class Task3 {
    /**
     * Készíts egy dobókockát (random szám generálás 1-6 között), amivel dobj 1000-szer!
     * A dobás eredményeit Map-ben tárold, ahol a kulcs a dobott szám, a kulcshoz tartozó érték pedig az,
     * hogy hányszor dobtad azt a számot.
     * A dobások után írd ki a Map tartalmát a képernyőre! (Vagyis azt, hogy melyik számot hányszor dobtad.
     */

private HashMap<Integer,Integer> dice = new HashMap<>();
Random randit = new Random();

public void randomGenerate(){

    int number =0;
    for (int i = 0; i < 1000; i++) {
        number = randit.nextInt(6)+1;
      //  System.out.println(number);
        int count = dice.getOrDefault(number, 0);//int count = dice.containsKey(number) ? dice.get(number) : 0;
        dice.put(number, count + 1);
    }
    System.out.println(dice);
}



/*      sulis közös megoldás

    Map<Integer, Integer> dice = new HashMap<>();
    Random random = new Random();

    public void generator() {


        for (int i = 0; i < 1000; i++) {
            int number = random.nextInt(6) + 1;


            if (dice.keySet().contains(number)) {

                int counter = dice.get(number);
                dice.put(number,counter +1);


            }else{
                dice.put(number,1);
            }

        }
        System.out.println(dice);

    }

    public static void main(String[] args) {
        Task task = new Task();
        task.generator();

    }

 */

    public static void main(String[] args) {
       Task3 myMain = new Task3();
       myMain.randomGenerate();

    }
}
