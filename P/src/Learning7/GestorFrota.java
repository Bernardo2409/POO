package Learning7;

import java.util.HashMap;
import java.util.Map;

public class GestorFrota {

    private Map<String, Veiculo> frota;

    public GestorFrota() {
        frota = new HashMap<>();
    }

    public boolean adicionarVeiculo(Veiculo v) {
        if (frota.containsKey(v.getId())) {
            System.out.println("Erro: ID duplicado!");
            return false;
        }
        frota.put(v.getId(), v);
        return true;
    }

    public void mostrarEstatisticas() {
        for (Veiculo v : frota.values()) {
            System.out.println("ID: " + v.getId() + " - Total KM: " + v.getTotalKm());
        }
    }

}
