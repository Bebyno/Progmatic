package Ingredients.vegetables;

public class Onion extends Vegetables {


    public Onion() {
        super("onion");
    }










}
/* Az Onion a Vegetables leszármazottja, a Vegetables pedig az Ingredient-é.
Minden classban vannak konstruktorok, ha nincs írva akkor is van, default konstruktor(paraméter nélküli)!
Bár a konstruktorok nem öröklődnek, de kötelezően meg kell hívni hogy inicializálva legyen ezért felelős a -> super

A mi esetünkben van a Onion, annak az ősanyja a Vegetable akinek szintén van egy ősanyja az Ingredient.

Az Ingredient-en belül van egy nem default konstruktor, ez pedig:

public Ingredient(String name) {
        this.NAME = name;
    }

    Ez a kontstruktor kötelezően átkerül az alfajába, jelen esetben a Vegetables-be is a super-en keresztül, majd onnan pedig a Onion-ba.
 Onioinban inicalizáljuk, adunk neki nevet (super(name <- ennek a helyére kerül a név)) , ezzel kihagyva a main-ünk
 telepakolását setName-kel. Ezt természetesen minden fajnál el kell játszani (viszont így átláthatóbb lesz a mainünk)
 (így megadhatunk akár több értéket a konstruktortól függően, ezzel is elkerülve a main telepakolását fölösleges set-ekkel)



 */