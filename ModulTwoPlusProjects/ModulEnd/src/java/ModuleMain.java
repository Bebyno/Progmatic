import modell.City;
import modell.Country;
import module.WorldStatistics;
import util.Reader;

import java.util.*;

public class ModuleMain {

    List<City> cityList;
    List<Country> countryList;

    public void fillLists() {

        countryList = Reader.readCountrysFromFileList();
        cityList = Reader.readCitiesFromFileList();
        Map<String, Country> countryCodeMap = new HashMap<>();
        for (Country country : countryList) {
            countryCodeMap.put(country.getCountryCode(), country);
        }
        for (City city : cityList) {
            Country country = countryCodeMap.get(city.getCountryCode());
            country.addCity(city);
            city.setCountry(country);
        }

    }

    public static void main(String[] args) {
        ModuleMain moduleMain = new ModuleMain();

        moduleMain.fillLists();
        moduleMain.countryList.get(0).getPopulationDensity();
        moduleMain.countryList.get(0).getRuralPopulation();
        WorldStatistics worldStatistics = new WorldStatistics();

        worldStatistics.findCountryByISoCode(moduleMain.countryList, "NOR");
        worldStatistics.getCountriesOfContinent(moduleMain.countryList, "North America");
        worldStatistics.getCitiesOfCountry(moduleMain.countryList, "AFG");
        worldStatistics.getAhmedCount(moduleMain.countryList);
        worldStatistics.getPopularFirstLetter(moduleMain.countryList);
        worldStatistics.lastIndependentCountry(moduleMain.countryList);

        moduleMain.cityList.get(0).getPopulationPercentage();


    }

}
