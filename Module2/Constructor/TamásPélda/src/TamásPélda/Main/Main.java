package TamásPélda.Main;

import TamásPélda.Animals.Cat;
import TamásPélda.Animals.Dog;

public class Main {

    /**
     * Csinálj egy programot ami számon tartja a ház körüli kutyákat
     * @param args
     */
    public static void main(String[] args) {
        Dog boroka = new Dog();
        boroka.setName("Boróka");
        boroka.setType("Németjuhász");
        boroka.setColor("fehér");
        boroka.setAge(19);
        Dog bodri = new Dog();
        bodri.setName("Bodri");
        bodri.setType("Keverék");
        bodri.setColor("kék");
        bodri.setAge(38);
        Dog bloki = new Dog("Border", "Blöki");
        Dog szervac = new Dog("Border", "Szervac", "tricolor", 1);

        Dog[] myDogs = {boroka, bodri, boroka, bodri, boroka, bodri, bloki, szervac};

        Cat cirmi = new Cat("Cirmi", "Black", 2, 9);
        Cat anhur = new Cat("Anhur the cat of war", "unknown", 5000, 10000);

        Cat[] cats = {cirmi, anhur};
        System.out.println(boroka.getColor());
        System.out.println(cirmi.getName());
    }
}
