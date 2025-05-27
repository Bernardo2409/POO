package Learning10;

public class StandardTravelCostCalculator implements ITravelCostCalculator{

    public StandardTravelCostCalculator() {}

    @Override
    public double calculateTravelCost(Travel t) {
        double total = 0;
        String[] init = t.getInitLocal().trim().split(", ");
        String[] dest = t.getDest().trim().split(", ");

        if (dest[1].equals(init[1])){
            //No mesmo país
            total += 50*t.getDuration();
        } else {
            //Em países destintos
            total += 150*t.getDuration();
        }

        if (t.getDuration() < 7) {
            total += 75;
        }

        if (t.getId() % 10 == 0){
            double desconto = 0.10 * total;
            total -= desconto;
        }

        return total;
    }
    
}