package Learning10;

public class Travel {
    
    private int id;
    public static int idCounter;

    private int duration;
    private String initLocal;
    private String dest;

    public Travel(String initLocal, String dest, int duration){ //Construtor sem ID
        id = idCounter++;
        this.duration = duration;
        this.initLocal = initLocal;
        this.dest = dest;
    }

    public Travel(int id, String initLocal, String dest, int duration){ //Construtor com ID (Para o ficheiro)
        this.id = id; 
        this.duration = duration;
        this.initLocal = initLocal;
        this.dest = dest;
        idCounter++;
    }

    public int getId(){
        return id;
    }

    public String getInitLocal(){
        return initLocal;
    }

    public String getDest(){
        return dest;
    }

    public int getDuration(){
        return duration;
    }

    public void setInitLocal(String s){
        initLocal = s;
    }

    public void setDest(String s){
        dest = s;
    }

    public void setDuration(int i){
        duration = i;
    }

    @Override
    public String toString(){
        return "Travel = {ID: "+ id+"; Local inicial: "+ initLocal + "; Local de destino: "+ dest +"; Duração: "+duration+ "}";
    }
}