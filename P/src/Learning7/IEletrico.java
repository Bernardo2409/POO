package Learning7;

public interface IEletrico {

    double getNivelBateria(); // em %
    void carregar(); // carrega a bateria
    void consumirEnergia(double km); // simula deslocação
}
