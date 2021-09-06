package Mains;


import Things.*;

public class ToolsMain {
    public static void main(String[] args) {
        Mugs gyurisMug = new Mugs("glass", 2, false, false);
        Phone mizsosPhone = new Phone("LG", "black", "Android", 7, 512);
        Lamp florasLamp =
                new Lamp("chandelier", "E27", 400, "black", false, false);
        Chair benisChair = new Chair(6, "plastic and steel", false, "blue");


        mizsosPhone.setMemorySize(32);

        System.out.println("Gyuri has a mug made of " + gyurisMug.getMatter() + " which has a volume of "
                + gyurisMug.getVolume() + " dl and is currently " + (gyurisMug.isFull() ? "full" : "empty") + ".");

        System.out.println("Beni has a " + benisChair.getColour() + " chair with " + benisChair.getLegs() + " legs, made of "
                + benisChair.getMatter() + " and " + (benisChair.hasArmRest ? "with" : "without") + " armrest.");

        florasLamp.rubTheLamp();

        System.out.println("Mizso checked his phone's memory, it has " + mizsosPhone.memorySize + " GB of data capacity.");



       /* System.out.println(Chair.ChairNumbers);
        System.out.println(Bed.number);
        System.out.println(Bed.ASD);*/
    }
}
