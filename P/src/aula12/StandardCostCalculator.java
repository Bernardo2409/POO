package aula12;

public class StandardCostCalculator implements IContactCostCalculator {

    @Override
    public double calculateCost(double units, ContactType type) {
        switch (type) {
            case CELLNUMBER:
                return units * 0.10;
            case EMAIL:
                return 0;
            default:
                throw new IllegalArgumentException("Unknown contact type: " + type);
        }
    }

}
