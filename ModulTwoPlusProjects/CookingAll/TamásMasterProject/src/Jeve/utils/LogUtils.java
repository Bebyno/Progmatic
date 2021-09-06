package Jeve.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LogUtils {
    public static void printRecipe(String recipe) {
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("Let's make some " + recipe);
        System.out.println("---------------------------------------");
    }

    public static void printTitle(String text) {
        System.out.println("---------------------------------------");
        System.out.println(text);
    }

    public static void printBonApetit() {
        String file = "src/resources/apetit.text";
        try {
            Stream<String> stream = Files.lines(Paths.get(file));
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
