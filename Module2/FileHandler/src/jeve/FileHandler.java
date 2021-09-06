package jeve;


import java.io.IOException;
import jeve.Reader;

public class FileHandler {
    private static final String sourceDir = "FileHandler/src/resources/";

    public static void main(String[] args) {
        String fileName = sourceDir + "text.txt";
        try {
            Reader.scan(fileName);
            Reader.buffer(fileName);
            Reader.stream(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
