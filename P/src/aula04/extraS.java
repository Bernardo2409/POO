package aula04;

public class extraS {   //sem getters
 
    static class Country {
        String name, capital;
        int population, pib;
        
        //Construtor
        Country(String name, String capital, int population, int pib) {
            this.name = name;
            this.capital = capital;
            this.population = population;
            this.pib = pib;
        }
    }
    
    public static void main(String[] args) {
        Country[] countries = {
            new Country("Portugal", "Lisboa", 10000000, 5),
            new Country("Espanha", "Madrid", 35000000, 4)
        };
        
        for (Country c : countries) {
            System.out.printf("%s, %s, %d, %d\n", 
                c.name, c.capital, c.population, c.pib);
        }
    }

}
