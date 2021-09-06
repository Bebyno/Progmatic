import Ingredients.Dairis.Egg;
import Ingredients.General.Oil;
import Ingredients.vegetables.*;
import KitchenTools.Bowl;
import KitchenTools.Spoon;
import KitchenTools.Knife;
import Spices.Oregano;
import Spices.Salt;
import Spices.*;
import KitchenTools.FryingPan;
import KitchenTools.*;

import java.util.Arrays;

// külön tömb ami számolja a hozzávalókat . static final (NAME)[] = {new class, new class};

/**
 * Főzzünk egy omlettet!
 * Létrehoztunk három package-t ami (Ingredients, Spices, KitchenTools) és a main-t
 * Ingredients-en belül 3 további package: Dairies, General, Vegetables
 * A packageken belül létrhoztunk három ősanyát: ingredients, kitchenTools, Spices
 * ingredients leszármazottja vegetables (vegetables leszármazottjei pedig a zöldségek)
 * külön osztályokat hoztunk létre a hozzávalóknak, fűszereknek és eszközöknek egyesével (dokumentáció: pl: FryingPan)
 * példányosított zöldésgeket átadjuk a hozzá szükséges konyhai eszköznek
 * A konyhaeszközök osztályaiben létrehoztunk metódusokat - pl. kés esetén feldarabol (false->true)
 * megváltoztatja a metódusban hozzárendelt zöldség állapotát : not chopped -> chopped
 * ezt a folyamatot megcsináljuk különböző konyhai eszközökkel és
 * a hozzájuk párosított hozzávalókkal és fűszerekkel
 * Létrehoztunk egy bowl nevű tömböt amibe a felvágott zödségeket (és utána a fűszereket) indexelés alapján beleraktuk
 * Majd létrehoztunk a serpenyőnek is egy tömböt és a főzés lépései alapján ebbe is
 * belepakoltuk a hozzávalókat (indexeléssel szintén)
 * Miután olaj,hagyma, tojás benne van a serpenyőben, egy for ciklussal átadjuk a bowl tömb elemeit a serpenyőnek
 * Az étel "megfőzését és tálalását" szintén státuszt változtató metódusokkal oldottuk meg
 *
 * Bon appetit! :)
 */

public class Main2 {
    public static void main(String[] args) {

        //Ingredients
        Onion onion = new Onion();
        onion.setName("onion");
        Garlic garlic = new Garlic();
        garlic.setName("garlic");
        Pepper pepper = new Pepper();
        pepper.setName("pepper");
        Tomato tomato = new Tomato();
        tomato.setName("tomato");
        Ravish ravish = new Ravish();
        ravish.setName("ravish");
        Oil oil = new Oil();
        oil.setName("oil");
        Egg egg = new Egg();
        egg.setName("egg");

        //Spices
        Salt salt = new Salt();
        salt.setName("salt");
        Basil basil = new Basil();
        basil.setName("basil");
        BlackPepper blackPepper = new BlackPepper();
        blackPepper.setName("blackPepper");
        Oregano oregano = new Oregano();
        oregano.setName("oregano");

        //KitchenTools
        Stove stove = new Stove();
        Knife knife = new Knife();
        Bowl bowl = new Bowl();
        Spoon spoon = new Spoon();
        Plate plate = new Plate();
        Fork fork = new Fork();


        String[] mixedIngredient = new String[7];       // bowl array
        int index = 0;

        FryingPan fryingPan = new FryingPan();          // pan array
        String[] mixedPenStuff = new String[11];
        int index2 =0;







        System.out.println("Let's cook an omelette.");


        //1. rész felvágás, félrerakás
        System.out.println();
        System.out.println("Let's peel those vegetables who need to be peel with a"+ knife.myKnife()+ "!");
        System.out.println("Let's chop the onion first!");
        System.out.println("Onion is " + (knife.chopp(onion))+"."); // hagymavágás és többi zöldség
        System.out.println("Let's chop all the other vegetables!");
        knife.chopp(garlic);
        knife.chopp(pepper);
        knife.chopp(ravish);
        knife.chopp(tomato);
        System.out.println("The "+ knife.chopp(onion) + " onion and the "+knife.chopp(garlic) + " garlic goes directly" +
                " to the pan, the other vegetables go to the bowl."); // Beni: beraktam a chopped metodust a kiírásba
        mixedIngredient[index] = pepper.getName();
        index++;
        mixedIngredient[index] = ravish.getName();
        index++;
        mixedIngredient[index] = tomato.getName();
        index++;

        // itt indexek segítségével belerakjuk a  később használatos zöldségeket a tálba ("félretesszük őket")
        bowl.setBowlArray(mixedIngredient); // átadjuk a bowl classban létrehozott String tömbnek a mixedIngred. tömböt
        // -----
        String[] tempArray = new String[index];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = mixedIngredient[i];
        }

        //---

        System.out.print("Vegetables in the bowl are: ");
        System.out.print(Arrays.toString(tempArray)); // javítva egy tempArray-jel
        System.out.println();

        // 2. rész : a serpenyő feltöltése a hozzávalókkkal
        System.out.println("Let's pour the oil into the pan!");
        System.out.println(fryingPan.pouring(oil)); // kiöntjük az olajat
        mixedPenStuff[index2] = oil.getName(); // beletesszük serpenyőbe
        index2++;

        System.out.println("Let's heat the oil!");
        System.out.println(stove.heating(oil)); // itt felhevítjük az olajat a gáztűzhelyünkön


        mixedPenStuff[index2] = onion.getName(); // hagyma beletesz
        index2++;
        mixedPenStuff[index2] = garlic.getName(); // fokhagyma beletesz
        index2++;
        System.out.println("Let's braise the onions in the heated oil!");


        // tojás rész
        System.out.println("After that we have to crack the egg."); //Beni: felvezettem a tojást.
        System.out.println(fryingPan.cracking(egg));
        // még létrehoztam a bowlban egy fieldet hogy abban keverjük össze
        bowl.setStirEgg(egg);
        System.out.println(fork.stirring(egg));
        mixedPenStuff[index2] = egg.getName();
        index2++;
        // itt is kell külön cookingolni
        System.out.println("Stir the eggs with the braised onions!");

        System.out.println("After the onion is ready, let's put the spices into the bowl!");
        System.out.println("Let's put the salt first!");
        System.out.println("The salt is " + spoon.spreading(salt)+".");
        System.out.println("Let's put the other spices into the bowl too!");
        spoon.spreading(blackPepper);
        spoon.spreading(oregano);
        spoon.spreading(basil);

        mixedIngredient[index] = salt.getName();
        index++;
        mixedIngredient[index] = blackPepper.getName();
        index++;
        mixedIngredient[index] = oregano.getName();
        index++;
        mixedIngredient[index] = basil.getName();
        index++;

        bowl.setBowlArray(mixedIngredient);
        System.out.print("The vegetables and spices in the bowl are: ");
        System.out.print(Arrays.toString(bowl.getBowlArray()));
        System.out.println();

        //3.rész átöntés serpenyőbe
        System.out.println("Put all other ingredients into the pan!");

        for (int i = 4; i < mixedPenStuff.length; i++) { // külön metódusba kéne
            mixedPenStuff[i] = mixedIngredient[i-4];
        }
        System.out.print("Pan contains: ");
        System.out.print(Arrays.toString(mixedPenStuff));
        System.out.println();
        System.out.println("Cook for 10 minutes.");



        System.out.println(fryingPan.foodReady(mixedPenStuff));
        System.out.println("Let's serve the food!");
        System.out.println(plate.foodServed(mixedPenStuff,fryingPan));
        System.out.println("Bon appetit!");

    }

}
