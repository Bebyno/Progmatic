package Mains;


import TeamMates.RiaMainTestTest;

public class RiaMainTest {
    public static void main(String[] args) {


        RiaMainTestTest myTest = new RiaMainTestTest();
        myTest.setNum(3);
        System.out.println(myTest.getNum());
        RiaMainTest m = new RiaMainTest();
        m.valami();
    }

    public void valami(){
        System.out.println("Hello");
    }
}
