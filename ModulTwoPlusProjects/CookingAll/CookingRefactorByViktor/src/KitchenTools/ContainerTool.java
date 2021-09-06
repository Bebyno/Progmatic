package KitchenTools;

import Ingredients.vegetables.Ingredient;

public class ContainerTool extends KitchenTool {
    protected Ingredient[] content = new Ingredient[0];

    public void addContent(Ingredient ingredient) {     // Ingredien tömb
        Ingredient[] contentNew = new Ingredient[content.length+1];
        for (int i = 0; i < contentNew.length-1; i++) {
            contentNew[i] = content[i];
        } 
        contentNew[contentNew.length-1] = ingredient;
        content = contentNew;
    }

    public Ingredient[] getContent() {
        return content;
    }

    public void pourContentInto(ContainerTool otherTool) {  //kitchenTool tömb
        for (int i = 0; i < content.length; i++) {
            otherTool.addContent(content[i]);
        }
        content = new Ingredient[0];
    }

    /* 6. sor ->  (protected -> a leszármazottak által is látott field). Ebben a sorban létrehozunk egy 0 elemű tömböt
                   content néven.
       9. sor -> itt egy tempArray (ideiglenes) tömböt hozunk létre a content tömb hosszával +1 .
       11. sor ->  a tempArray-nek átadjuk a content elemeit, majd a 13. sorban az utolsó helyére berakjuk az új elemet.
       Ezért kellett a tempArraynek a [contet hossza + 1].
       14. sorban a tempArray elemeit átadjuk(visszaadjuk az új elemmel) a content tömbünknek.


       23. sor -> az otherTool tömbnek átadom content tömb elemiet, majd a 25. sorban üressé teszem a tömböt.
       voltaképp átöntöttem a tömb elemeit(bowl) egy másik tömbe(pan), és miután átöntöttem mindent ez a tömb üres lesz...


    */


}
