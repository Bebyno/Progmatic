package Mains;


import Animals.Cat;
import Animals.Dogs;


public class AnimalsMain {

    public static void main(String[] args) {
        Dogs lili = new Dogs();
        lili.setName("Lili");
        lili.setType("Uszkár");
        lili.setColor("szürke");
        lili.setAge(11);
        System.out.println(lili.getAge() +" "+ lili.getColor());
        Cat bandita = new Cat();
        bandita.setName("Bandita");
        bandita.setAge(7);
        bandita.setColor("fekete-fehér");
        bandita.setLivesLeft(9);
        System.out.println(bandita.getColor()+" "+ bandita.getLivesLeft());
        Dogs bodri = new Dogs();
        bodri.setAge(10);
        bodri.setName("Bodri");
        Dogs asd = new Dogs("Border", "ASd","black",11);
        System.out.println(bodri);




    }
}
