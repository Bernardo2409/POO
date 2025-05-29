public class StandardTransactionCostCalculator implements ITransactionCostCalculator {
    double cost = 0.0;

    @Override
    public double  calculateTransactionCost(Transaction t) {
            double cost = t.getHoras() * 50;
            String dia_da_semana = t.getDiaDaSemana();

            //Se for sabado ou domingo 
    if (dia_da_semana.equals("SATURDAY") || dia_da_semana.equals("SUNDAY")) {
        cost *= 2;
    }

    // Se for quarta-feira: 10% de desconto
    if (dia_da_semana.equals("WEDNESDAY")) {
        cost *= 0.90;
    }

            return cost;
    }
}
