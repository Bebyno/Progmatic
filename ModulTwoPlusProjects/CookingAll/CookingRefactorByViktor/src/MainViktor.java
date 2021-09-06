import Ingredients.Dairis.Egg;
import Ingredients.General.Oil;
import Ingredients.vegetables.*;
import KitchenTools.Bowl;
import KitchenTools.Knife;
import Spices.Oregano;
import Spices.Salt;
import Spices.*;
import KitchenTools.FryingPan;
import KitchenTools.*;

import java.util.Arrays;



public class MainViktor {
    public static void main(String[] args) {


        Onion onion = new Onion();      // Nem setName-mel hozom létre a neveket, hanem minden egyes nevet az ősanyán
        Garlic garlic = new Garlic();   // keresztül. Onion-on keresztül magyarázom, menj az Onion class-ba.
        Paprika paprika = new Paprika();
        Tomato tomato = new Tomato();
        Ravish ravish = new Ravish();
        Oil oil = new Oil();
        Egg egg = new Egg();


        Salt salt = new Salt();
        Basil basil = new Basil();
        BlackPepper blackPepper = new BlackPepper();
        Oregano oregano = new Oregano();


        Knife knife = new Knife();
        Bowl bowl = new Bowl();
        Plate plate = new Plate();
        Fork fork = new Fork();

        FryingPan fryingPan = new FryingPan();

        System.out.println("Let's cook an omelette.");

        // 1. rész felvágás, félrerakás
        knife.sharpen();

        System.out.println();
        System.out.println("Let's peel those vegetables who need to be peel with a " + knife + "!"); // Override magyarázás...
                                                                                    // ...menj a Knife classba!

        onion.peel();     // a peel nem egy eszköz (pl. kés ) tulajdonsága, hanem magáé a zöldségé, ezért ott kell létrehozni.
        garlic.peel();    // és mivel a peel (és a chop) az összes zöldségre jellemző ezért az ősanyában hozzuk létre,
        ravish.peel();    // ami öröklés révén mindegyik egyedre eljut. Nyilván mind2 tulajdonság változásához egy esz-
                  // köz kell ez lesz a kés, ami végrehajta a folyamatot, de nem maga a kés lesz peel-elve és chop-olva.
        System.out.println("Let's chop all the vegetables!");
        knife.chop(garlic);
        knife.chop(paprika);
        knife.chop(ravish);
        knife.chop(tomato);

        knife.chop(onion);
        knife.chop(garlic);
                System.out.println("The " + onion + " and the " + garlic
                + " goes directly to the pan, the other vegetables go to the bowl."); //

        bowl.addContent(paprika);  //a tömböt, for ciklust nem hozunk létre main-ben!!! Lépj a ContainerTool-ba.
        bowl.addContent(ravish);                                                                                        
        bowl.addContent(tomato);     // kis plusz infoért lépj a Bowl class-ba.

        System.out.print("Vegetables in the bowl are: ");
        System.out.print(Arrays.toString(bowl.getContent()));
        System.out.println();

        // 2. rész : a serpenyő feltöltése a hozzávalókkkal
        System.out.println("Let's pour the oil into the pan!");
        System.out.print("The content of the fry pan is: ");
        fryingPan.addContent(oil);
        System.out.println(Arrays.toString(fryingPan.getContent()));

        System.out.println("Let's heat the "+oil+"!");
        fryingPan.cook();

        System.out.println("Let's braise the onions in the "+oil+"!");


        System.out.println("After that we have to crack and stir the "+egg+".");
        fork.crackEgg(egg);
        fork.stirEgg(egg);


        System.out.println("Stir the eggs with the braised onions!");

        bowl.addContent(egg);
        bowl.stirContent(fork);

        System.out.println("After the onion is ready, let's put the spices into the bowl!");
        bowl.addContent(salt);
        bowl.addContent(blackPepper);
        bowl.addContent(oregano);
        bowl.addContent(basil);

        System.out.print("The vegetables and spices in the bowl are: ");
        System.out.println(Arrays.toString(bowl.getContent()));
        System.out.println();

        // 3.rész átöntés serpenyőbe
        System.out.println("Put all other ingredients into the pan!");
        bowl.pourContentInto(fryingPan);

        System.out.print("Pan contains: ");
        System.out.println(Arrays.toString(fryingPan.getContent()));
        System.out.println();
        System.out.println("Cook for 10 minutes.");

        fryingPan.cook();
        fryingPan.isDone();

        System.out.println("Let's serve the food!");
        fryingPan.pourContentInto(plate);
        System.out.println("Bon appetit!");

    }

}
