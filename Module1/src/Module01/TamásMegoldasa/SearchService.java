package Module01.TamásMegoldasa;

import java.util.Scanner;

public class SearchService {
    public static int[] array;

    public static void main(String[] args) {

        array = new int[ generateRandom(10, 20) ];
        for (int j = 0; j < array.length; j++) {
            array[j] = generateRandom(1, 3);
        }
        System.out.println(arrToString(array, ", "));


        System.out.println("Kérlek add meg a tipped: ");
        Scanner scanner = new Scanner(System.in);
        int tipp = scanner.nextInt();
        System.out.println(isContains(tipp) ?
                "Eltaláltad! " + occurences(tipp)
                : "Sajnos nem sikerült!");


        String[] strArray = {"Tamás", "Csaba", "Misi", "Mizsó", "Beáta", "Ria"};
        System.out.println("Kérlek adj meg karaktert");
        String characterInput = scanner.next();
        System.out.println(arrToString(hasChar(strArray, characterInput), ", "));
    }

    public static String[] hasChar(String[] array, String input) {
        int occurrences = 0;
        String[] tempArray = new String[array.length];
        for (String str : array) {
            if (str.toLowerCase().contains(input.toLowerCase())) {
                tempArray[occurrences] = str;
                occurrences++;
            }
        }
        String[] result = new String[occurrences];
        for (int i = 0; i < occurrences; i++) {
            result[i] = tempArray[i];
        }
        return result;
    }

    public static int occurences(int tipp) {
        int occurrences = 0;
        for (int i : array) {
            if (i == tipp) {
                occurrences++;
            }
        }
        return occurrences;
    }

    public static boolean isContains(int tipp) {
        for (int i : array) {
            if (i == tipp) {
                return true;
            }
        }
        return false;
    }

    public static int generateRandom(int minValue, int maxVale) {
        return (int) (Math.random() * (maxVale - minValue + 1) + minValue);
    }

    public static String arrToString(int[] arr, String separator) {
        StringBuilder b = new StringBuilder();
        for (int j : arr) {
            b.append(j).append(separator);
        }
        b.setLength(b.length() - separator.length());
        return b.toString();
    }

    public static String arrToString(String[] arr, String separator) {
        StringBuilder b = new StringBuilder();
        for (String j : arr) {
            b.append(j).append(separator);
        }
        b.setLength(b.length() - separator.length());
        return b.toString();
    }
}