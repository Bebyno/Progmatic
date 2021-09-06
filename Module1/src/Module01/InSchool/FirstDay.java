package Module01.InSchool;

public class FirstDay {
    public static void main(String[] args){
        String hello = "Hello";
        int number = 2;
        int number2 = 4;
        int number3 = number + number2;
        // int number4 = hello + szam - ilyen nem működik
        String szövegSzam = "2";
        int number4 = Integer.parseInt(szövegSzam) + number2; // így kell stringet int-é alakítani
        // intet át tudja alakítani stringé de fordítva nem tudja, ahhoz parancsot kell írni.
        System.out.println("Hello World!");
        System.out.println("Hello Csaba!");
        System.out.println(number4);
        System.out.println(hello + " Lajos!");
        System.out.println("Hello Anita!");
        System.out.println("Hello Rob!");
        System.out.println("Hello" + "\"Rob!\"");
        System.out.print("Hello ");
        System.out.print("Krissztina!");
        System.out.println();
        System.out.print(number3);

        // ln(new line == enter) nélküle minden 1 sorba kerül.
        // sout a rövidítése a "System.out.println"-nak
        // psvm a rövidítése "public static void main"
        // scanner -rel lehet inputot kérni, de nézz utána!
    }
}
