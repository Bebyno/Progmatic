package utils;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    private static final String DIRECTORY_PATH = "src/resources/";

    public static List<String[]> getDataFromFile(String filename) throws IOException {

        List<String[]> inputList = new ArrayList<>();

        FileReader fileReader = new FileReader(DIRECTORY_PATH + filename);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        for (String line; (line = bufferedReader.readLine()) != null;) {
            inputList.add(line.split(";"));

        }

        return inputList;
    }



}
