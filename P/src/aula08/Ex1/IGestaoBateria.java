package aula08.Ex1;

public interface IGestaoBateria {
        double cargaDisponivel(); // devolve percentagem de carga restante
    void carregar(double percentagem); // acrescenta essa ‘percentagem’ de carga
    // até ao máximo de carga da bateria
    void limitarCargaMaxima(double percentagem); // limita a ‘percentagem’ de carga
    // da bateria (para, potencialmente, melhorar a longevidade)

}
