package Module01.TamásMegoldasa;

import java.util.Scanner;

public class AvHeightMethodV {
    public static String womanGender = "woman";
    public static String manGender = "man";
    public static int limit = 5;
    public static int genderIndexWoman = 0;
    public static int genderIndexMan = 1;
    public static String[] genders = {"no", "ffi"};

    public static int avWomanHeight = 164;
    public static int avManHeight = 176;


    public static Scanner scanner;

    public static String gender;


    /**
     * Írj programot, ami bekéri a felhasználó nemét (lehetséges értékek: no/ffi) és a
     * testmagasságát, majd kiírja, hogy a felhasználó az átlagnál alacsonyabb, magasabb, vagy
     * éppen átlagos.
     *      A férfiak átlagmagassága 176 cm, a nőké pedig 164 cm.
     * @param args
     */
    public static void main(String[] args) {
        scanner = getScanner();

        //String result = getInput();
        getGenderInput();

        // bonus: input error handling (0 < 250)
        int height = getUserHeight();

        // bonus: return the difference between av and current height
        String result = getGenderHeightRelation(height);
        System.out.println(result);
    }

    public static String getGenderHeightRelation(int height) {
        if (gender.equals(womanGender)) {
            return getHeightRelation(height, avWomanHeight);
        } else if (gender.equals(manGender)) {
            return getHeightRelation(height, avManHeight);
        }
        return "Wrong gender input!";
    }

    public static String getHeightRelation(int height, int av) {

        if(UserHeightValid()){
            if (height < av) {
            return "You are smaller than the average";
        } else if (height == av) {
            return "You are exactly the average";
        } else if (height > av) {
            return "You are taller than the average";
        } else {
            return "Unknown error";
        }
    }
        return "You bigger than 2,5m, omg you are Jason Bourne";        //++dolog
    }

    public static void getGenderInput() {
        System.out.println("Please add your gender (" + womanGender + "/" + manGender +")");
        do {
            gender = scanner.next();
        } while (!isValidGenderInput() && --limit > 0);
        System.out.println("You are a " + gender);
    }

    public static boolean isValidGenderInput() {
        if (gender.equals(womanGender) || gender.equals(manGender)) {
            return true;
        } else {
            System.out.println("Invalid input, please try again!");
            return false;
        }
    }

    public static int getUserHeight() {
        System.out.println("Please add your height in centimeter");
        int height = scanner.nextInt();
        System.out.println("You are " + height + " cm");
        return height;
    }
    public static boolean UserHeightValid(){            //++ dolog
        if(getUserHeight() > 250){
            return false;
        }

        return true;
    }


    public static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
