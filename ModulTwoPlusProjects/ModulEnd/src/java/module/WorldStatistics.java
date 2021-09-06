package module;

import modell.City;
import modell.Country;

import java.util.*;

public class WorldStatistics {

    public Country findCountryByISoCode(List<Country> countries, String isoCode) {
        for (Country current : countries) {
            if (current.getCountryCode().equals(isoCode)) {

             /*   System.out.println(current.getPopulation());
                System.out.println(current.getName());
                System.out.println(current.getCountryCode());*/
                return current;
            }
        }
        return null;
    }

    public ArrayList<String> getCountriesOfContinent(List<Country> countries, String continentName) {
        ArrayList<String> countresCode = new ArrayList<>();
        for (Country current : countries) {
            if (current.getContinent().equals(continentName)) {
                countresCode.add(current.getCountryCode());
            }
        }


        //System.out.println(countresCode);
        return countresCode;
    }

    public HashSet<String> getCitiesOfCountry(List<Country> countries, String countryCode) {
        HashSet<String> cityNames = new HashSet<>();

        for (Country currentCountry : countries) {
            if (currentCountry.getCountryCode().equals(countryCode)) {
                for (City city : currentCountry.getCityList()) {

                    cityNames.add(city.getName());
                }
            }
        }
        //    System.out.println(cityNames);
        return cityNames;
    }

    public int getAhmedCount(List<Country> countries) {
        int count = 0;
        for (Country current : countries) {
            if (current.getRuler().contains("Hamad") || current.getRuler().contains("Ahmad") || current.getRuler().contains("Ahmed")) {
                count++;
            }
        }
        // System.out.println(count);
        return count;
    }

    public String getPopularFirstLetter(List<Country> countries) {
        Map<Character, Integer> allfirstChar = new HashMap<>();
        int max = 0;
        char maxkey = 0;
        String result;

        for (Country current : countries) {
            char firstLetter = current.getCountryCode().charAt(0);
            if (!allfirstChar.containsKey(firstLetter)) {
                allfirstChar.put(firstLetter, 0);
            }

            int counter = allfirstChar.get((firstLetter));
            allfirstChar.put(firstLetter, counter + 1);
            if (counter > max) {
                max = counter;
                maxkey = firstLetter;
            }

        }

        result = String.valueOf(maxkey);
       // System.out.println(result);
        return result;
    }

    public String lastIndependentCountry(List<Country> countries) {

        String latest = "";
        int max = 0;


        for (Country current : countries) {
            if (current.getIndependence() != null) {
                if (current.getIndependence() > max) {
                    max = current.getIndependence();
                    latest = current.getName();
                }
            }
        }

        System.out.println(latest);
        return latest;
    }

}
