package aula04;

import java.util.ArrayList;
import java.util.List;

public class extra {

public static void main(String[] args) {
    
    Table table = new Table();
    table.addCountry(new Country("Portugal", "Lisbon", 10000000, 5));
    table.addCountry(new Country("Spain", "Madrid", 35000000, 4));
    

    System.out.println(table);
}

}

class Country {

    public String country;
    public String capital;
    public int population;
    public int pib;

    //Construtor    
    public Country(String country, String capital, int population, int pib) {

        this.country = country;
        this.capital = capital;
        this.population = population;
        this.pib = pib;

    }
    public double getPibPopul() {

        return (double) pib/population;
    }

    public String getPais(){

        return country;
    }

    public String getCapital() {

        return capital;
    }

    public int getPopulation() {

        return population;
    }

    public int getPib() {

        return pib;
    }
}

class Table{

    public List<Country> countries;

    public Table() {

        countries = new ArrayList<>();
    }

    public void addCountry(Country country) {
        countries.add(country);

    }
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-15s %5s %10s %10s %10s \n", "Country", "Capital", "Population", "PIB", "PIB/Population"));

        for (Country country : countries) {

            sb.append(String.format("%-15s %15s %10d %10d %10.2f\n", country.getPais(), country.getCapital(), country.getPopulation(), country.getPib(), country.getPibPopul()));

        }
        return sb.toString();
    }




}