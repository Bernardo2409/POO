package MiniTeste_2EduardoLaranjeiro126156;

public class StandardChargeCostCalculator implements IChargeCostCalculator {
    double cost = 0.0;

    @Override
    public double calculateChargeCost(Charge carga) {
            double cost = carga.getEnergia() * 0.15;
            int hora = carga.getHora();

            if ((hora >= 12 && hora < 14) || (hora >= 19 && hora < 21)) {
                cost += 5.0;
            }

            if (hora >= 22 || hora < 6) {
                cost *= 0.5;
            }

            return cost;
}

}

