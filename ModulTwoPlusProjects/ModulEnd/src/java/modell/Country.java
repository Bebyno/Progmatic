package modell;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String countryCode;
    private String name;
    private String continent;
    private String region;
    private double area;
    private Integer independence;
    private int population;
    private String ruler;
    private List<City> cityList = new ArrayList<>();

    public Country() {
    }

    public Country(String[] data) {
        this.countryCode = data[0];
        this.name = data[1];
        this.continent = data[2];
        this.region = data[3];

        String[] splitAtpoint = data[4].split("\\.");
        for (int i = 0; i < splitAtpoint.length; i++) {
            this.area = Integer.parseInt(splitAtpoint[0]);
        }

        try {
            this.independence = Integer.parseInt(data[5]);
        } catch (NumberFormatException e) {
            this.independence = null;
        }
        try {
            this.population = Integer.parseInt(data[6]);
        } catch (NumberFormatException e) {
            this.population = 0;
        }

        try {
            this.ruler = data[7];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.ruler = "There is no ruler";
        }
    }

public void addCity(City city){
    cityList.add(city);
}

    public double getPopulationDensity() {
        if (getArea() < 1 || getPopulation() <1) {
            return -1;
        } else {

            return getPopulation() / getArea();
        }
    }

    public double getRuralPopulation() {
        int countryAllPopulation = getPopulation();
        int cityAllPopulation = 0;

        for (City city : cityList) {
            cityAllPopulation += city.getPopulation();
        }

        return countryAllPopulation - cityAllPopulation;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getRegion() {
        return region;
    }

    public double getArea() {
        return area;
    }

    public Integer getIndependence() {
        return independence;
    }

    public int getPopulation() {
        return population;
    }

    public String getRuler() {
        return ruler;
    }

}
