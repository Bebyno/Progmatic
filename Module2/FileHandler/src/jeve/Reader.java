package jeve;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Reader {
    public static void scan(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner sc;
        if (file.exists()) {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
    }

    public static void buffer(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        for (String line; (line = bufferedReader.readLine()) != null; ) {
            System.out.println(line);
        }
    }

    public static void stream(String fileName) throws IOException {
        Stream<String> stream = Files.lines(Paths.get(fileName));
        stream.forEach(line -> {
            System.out.println(line);
        });
        /* Ugyanez kicsit másképp:
                stream.forEach(System.out::println);
         */
    }
}
