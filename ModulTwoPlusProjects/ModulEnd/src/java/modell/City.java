package modell;

public class City {

    private Country country;

    private String name;
    private String countryCode;
    private int population;

    public City() {
    }

    public City(String[] data) {
        this.name = data[0];
        this.countryCode = data[1];
        this.population = Integer.parseInt(data[2]);

    }

    public double getPopulationPercentage() {
        if (getPopulation() <= 0 || country.getPopulation() <= 0) {
            return -1;
        } else {
            return (double) getPopulation() / country.getPopulation() * 100;
        }

    }


    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getPopulation() {
        return population;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
