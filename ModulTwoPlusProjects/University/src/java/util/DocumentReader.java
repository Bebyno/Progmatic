package util;

import modell.Major;
import modell.MajorEnum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentReader {
    private static final String RELATIVE_TEST_PATH = "src/resources/szak_test.txt";
    private static final String RELATIVE_GOOD_PATH = "src/resources/szak.txt";

    // public static List<Major> majorList = new ArrayList<>();
//    public static List<Major> angList = new ArrayList<>();
//    public static List<Major> infList = new ArrayList<>();
//    public static List<Major> hisList = new ArrayList<>();

    public static Map<MajorEnum, List<Major>> majorMap = new HashMap<>();

    public static void read() throws IOException{
        FileReader fileReader = new FileReader(RELATIVE_GOOD_PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        for (String line; (line = bufferedReader.readLine()) != null;) {
            Major currentMajor = new Major(line.split(";"));

            majorMap.putIfAbsent( // felvesszük az új key-t, ha még nem létezik
                    currentMajor.getMajor(),
                    new ArrayList<>());
            majorMap.get(currentMajor.getMajor()).add(currentMajor);
        }
    }










/*    public static void read() {
        try {
            *//*FileReader fileReader = new FileReader(RELATIVE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);*//*
            BufferedReader bufferedReader = Files.newBufferedReader(
                    Paths.get(RELATIVE_TEST_PATH),
                    StandardCharsets.UTF_8);
            for (String line; (line = bufferedReader.readLine()) != null;) {
                // Major currentMajor = getMajorInstanceFromLine(line);
                *//**
                 * File header benne lehet az első sorban, ezért érdemes
                 * nem letölteni a fájlt, hanem sajátot létrehozni és
                 * kézzel belemásolni a teszt adatot.
                 *//*
                Major currentMajor = new Major(line.split(";"));
                // majorList.add(currentMajor);

*//*                if (currentMajor.getMajor().equals(MajorEnum.ANG)) {
                    angList.add(currentMajor);
                } else if (currentMajor.getMajor().equals(MajorEnum.INF)) {
                    infList.add(currentMajor);
                } else if (currentMajor.getMajor().equals(MajorEnum.HIS)) {
                    hisList.add(currentMajor);
                }*//*
                // Ha még nem létezik, akkor létrehozzuk a kulcsot
                majorMap.putIfAbsent(
                        currentMajor.getMajor(),
                        new ArrayList<>());
*//*                // kivesszük a kulcs alatti értéket (List<Major>)
                List<Major> tempMajorList =
                        majorMap.get(currentMajor.getMajor());
                // hozzáadjuk az új elemet
                tempMajorList.add(currentMajor);
                // felül írjuk a kibővített listával a meglévőt
                majorMap.put(currentMajor.getMajor(), tempMajorList);*//*

                majorMap.get(currentMajor.getMajor()).add(currentMajor);

            }
        } catch (IOException e) {
            System.out.println("Error: wrong file path");
        }
        System.out.println("");
    }*/

    /*private static Major getMajorInstanceFromLine(String line) {
        String[] parts = line.split(";");
        return new Major(parts[0],
                parts[1],
                parts[2],
                UnitType.valueOf(parts[3]),
                Utils.parseIntegerList(Arrays.asList(parts[4].split("\\|"))),
                Integer.parseInt(parts[5]),
                Arrays.asList(parts[6].split("\\|"))
        );
    }*/
}
