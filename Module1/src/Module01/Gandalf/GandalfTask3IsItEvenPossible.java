package Module01.Gandalf;

// súly max 150
//2vel kelnek át, ha 1- utolsó és így meg befele, ha 150<x akkor egyesével kellnek át (10 min)
// 1 átkelés 5 min
// ? mennyi idő alatt kell át?

/**
 * 2 függvény felezett értékekkel azaz 2 tömb. A 2. tömböt megfordítom, vagyis hátulról rakom be egy másik tömbbe.
 * a 2 tömb mindig akutális elemét összeadom egy 3. tömb-be, ha az összeadott érték nagyobb 150-nél akkor 10 min-t adok
 * számlálóhoz.
 */

public class GandalfTask3IsItEvenPossible {
    public static int[] weight = {84, 83, 82, 76, 61, 70, 58, 67, 72, 85};
    public static int[] firstHalf = firstHalfOfTheArray();
    public static int[] secondHalf = secondHalfOfTheArray();
    public static int[] sum;
    public static int counter = 0;

    public static void main(String[] args) {
        putTheFirstHalfInTheSumArray();
        sumtheArrayElementsPair();
        timer();
        System.out.println("The time to need to cross the bridge: " + counter+ "min");
    }


    public static int[] firstHalfOfTheArray() {
        int[] firstHalf = new int[weight.length / 2];
        for (int i = 0; i < firstHalf.length; i++) {
            firstHalf[i] = weight[i];
        }
        // System.out.println(Arrays.toString(firstHalf));
        return firstHalf;
    }

    public static int[] secondHalfOfTheArray() {
        int[] secondHalf = new int[weight.length / 2];
        for (int i = secondHalf.length - 1; i >= 0; i--) {
            secondHalf[i] = weight[weight.length - 1 - i];
        }
        // System.out.println(Arrays.toString(secondHalf));
        return secondHalf;
    }

    public static int[] putTheFirstHalfInTheSumArray() {
        sum = new int[firstHalfOfTheArray().length];
        for (int i = 0; i < secondHalf.length; i++) {
            sum[i] = firstHalf[i];
        }

        return sum;
    }


    public static int[] sumtheArrayElementsPair() {
        for (int i = 0; i < secondHalf.length; i++) {
                sum[i] += secondHalf[i];
            }
        //System.out.println(Arrays.toString(sum));
            return sum;
        }
    public static int timer(){

        for (int i = 0; i < sum.length; i++) {
            if (sum[i]< 150){
                counter= counter + 5;
            }
            else{
                counter= counter + 10;
            }
        }
        return counter;
    }


    }

