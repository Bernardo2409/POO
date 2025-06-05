import java.util.Arrays;
import java.util.List;

public class StandardConcertProfitCalculator implements IConcertProfitCalculator {

    @Override
    public double calculateConcertProfit(Concert c){

        double total = 0;
        total += c.getDuration() /60 * 1500;

        if (!c.getCountry().equals("Portugal")) {
            total *= 2;

            //se for diferente de Portugal ou Espanha
        } if (c.getCountry().equals("Portugal") || c.getCountry().equals("Espanha")){
            
            total += 800;
        }

        return total;

    }


}
