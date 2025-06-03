package Exame21_22;

import java.util.ArrayList;
import java.util.HashSet;



public class Event implements IEvent{


    public Event(ArrayList<Activity> atividades) {

        this.atividades = atividades;
    }


    private ArrayList<Activity> atividades;

    


    @Override
    public Event addActivity(Activity activity) {
    // Contadores e conjuntos para verificação
    int cateringCount = 0;
    HashSet<Sport.Modality> sportModalities = new HashSet<>();
    HashSet<Culture.Option> cultureOptions = new HashSet<>();

    // Preencher os conjuntos com o estado atual
    for (Activity a : atividades) {
        if (a instanceof Catering) cateringCount++;
        else if (a instanceof Sport s) sportModalities.add(s.getModality());
        else if (a instanceof Culture c) cultureOptions.add(c.getOption());
    }

    // Verificações e adição da nova atividade
    if (activity instanceof Catering) {
        if (cateringCount < 1) {
            atividades.add(activity);
        }
    } else if (activity instanceof Sport) {
        if (!sportModalities.contains(sport.getModality())) {
            atividades.add(activity);
        }
    } else if (activity instanceof Culture culture) {
        if (!cultureOptions.contains(culture.getOption())) {
            atividades.add(activity);
        }
    }

    return this;
}





    
}
