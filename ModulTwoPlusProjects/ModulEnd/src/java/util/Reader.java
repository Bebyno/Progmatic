package util;

import modell.City;
import modell.Country;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    private static final String DIRECTORY_PATH = "src/resources/";

    public static List<String[]> getDataFromFile(String filename) throws IOException {

        List<String[]> inputList = new ArrayList<>();

        FileReader fileReader = new FileReader(DIRECTORY_PATH + filename);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        for (String line; (line = bufferedReader.readLine()) != null;) {
            inputList.add(line.split(","));

        }

        return inputList;
    }
    public static List<City> readCitiesFromFileList() {
        List<City> cities = new ArrayList<>();
        try {
            for (String[] data : Reader.getDataFromFile("city.txt")) {
                City city = new City(data);
                cities.add(city);
            }
        } catch (IOException e) {
            System.out.println("No such a file");
        }
        return cities;
    }


    public static List<Country> readCountrysFromFileList() {
        List<Country> countries = new ArrayList<>();
        try {
            for (String[] data : Reader.getDataFromFile("country.txt")) {
                Country country = new Country(data);
                countries.add(country);
            }
        } catch (IOException e) {
            System.out.println("No such a file");
        }
        return countries;
    }

}
