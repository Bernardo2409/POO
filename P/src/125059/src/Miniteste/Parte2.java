package Miniteste;

import java.util.LinkedList;
import java.util.regex.*;

import Miniteste.Parte2.Tipo.TCP;
import Miniteste.Parte2.Tipo.UDP;
public class Parte2 {

    static class Pacote {

        protected String source;
        protected String destino;

        public Pacote(String source, String destino) {

            if (!source.matches("^([0-255][.]){3}[0-255]$") || !destino.matches("^([0-255][.]){3}[0-255]$")) {
                throw new IllegalArgumentException("formáto inválido");
            }
            this.source = source;
            this.destino = destino;
        }


    }

    static class Tipo extends Pacote {

        
        protected String mensagem;

        public Tipo(String source, String destino, String mensagem) {
            super(source, destino);
            this.mensagem = mensagem;
        }

       

        static class TCP extends Tipo{

            private static int nextID = 100;
            private int id;

            public TCP(String source, String destino, String mensagem) {

                super(source, destino, mensagem);
                if (mensagem.length() > 1460) {
                throw new IllegalArgumentException("A mensagem TCP não pode exceder o tamanho de 1460.");
                }   
                
                this.id = nextID++;
            }

            public int getId() {
                return id;
            }



        }

        static class UDP extends Tipo {

            public UDP(String source, String destino, String mensagem) {

                super(source, destino, mensagem);
                if (mensagem.length() > 1480) {
                    throw new IllegalArgumentException("A mensagem UDP não pode exceder o tamanho de 1480.");
                }
            }

        }

    }

    static class Encaminhador {
        
        private String nome;
        private LinkedList<Pacote> filaPacotes;
        private Pacote ultimoPacoteEnviado;

        public Encaminhador(String nome) {
        this.nome = nome;
        this.filaPacotes = new LinkedList<>();
        this.ultimoPacoteEnviado = null;
    }

    public void addPacote(Pacote p) {
        filaPacotes.add(p);
    }

    public void removePacote(Pacote p) {
        filaPacotes.remove(p);
    }

    public Pacote getUltimoPacoteEnviado() {
        return ultimoPacoteEnviado;
    }

    public void setUltimoPacoteEnviado(Pacote pacote) {
        this.ultimoPacoteEnviado = pacote;
    }

    public void enviarPacote() {
        if (!filaPacotes.isEmpty()) {
            Pacote pacote = null;
            for (Pacote p : filaPacotes) {
                pacote = p;
                break; 
            }

            if (pacote != null && pacote.equals(ultimoPacoteEnviado)) {
                System.out.println("(pacote duplicado)");
                return;
            }

            for (int i = 0; i < filaPacotes.size(); i++) {
                if (filaPacotes.get(i).equals(pacote)) {
                    filaPacotes.remove(i);
                    break; 
                }
            }

            if (pacote instanceof Tipo.TCP) {
                Tipo.TCP tcpPacote = (Tipo.TCP) pacote;
                System.out.println("TCP (source: " + tcpPacote.source 
                    + ",destination: " + tcpPacote.destino 
                    + ", seq: " + tcpPacote.getId() 
                    + ", msg: " + tcpPacote.mensagem + ")");
            } else if (pacote instanceof Tipo.UDP) {
                Tipo.UDP udpPacote = (Tipo.UDP) pacote;
                System.out.println("UDP (source: " + udpPacote.source 
                    + ",destination: " + udpPacote.destino 
                    + ", msg: [" + udpPacote.mensagem + "])");
            } else {
                System.out.println("(source: " + pacote.source 
                    + ",destination: " + pacote.destino + ")");
            }

            setUltimoPacoteEnviado(pacote);
        } else {
            System.out.println("Pacotes indisponíveis.");
        }
    }

    public boolean hasPacotes() {
        return !filaPacotes.isEmpty();
    }

    public int getTamanhoFila() {
        int totalTamanho = 0;
        for (Pacote pacote : filaPacotes) {
            if (pacote instanceof Tipo) {
                Tipo tipoPacote = (Tipo) pacote;
                totalTamanho += tipoPacote.mensagem.length();
            }
        }
        return totalTamanho;


    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Encaminhador: ").append(nome).append(" está UP, ");
        
        sb.append("tamanhofila= \n").append(getTamanhoFila());
        for (Pacote pacote : filaPacotes) {
            if (pacote instanceof Tipo.TCP) {
                Tipo.TCP tcpPacote = (Tipo.TCP) pacote;
                sb.append(" TCP (source: ").append(tcpPacote.source)
                  .append(", destination: ").append(tcpPacote.destino)
                  .append(", seq: ").append(tcpPacote.getId())
                  .append(", msg: ").append(tcpPacote.mensagem).append(")\n");
            } else if (pacote instanceof Tipo.UDP) {
                Tipo.UDP udpPacote = (Tipo.UDP) pacote;
                sb.append(" UDP (source: ").append(udpPacote.source)
                  .append(", destination: ").append(udpPacote.destino)
                  .append(", msg: [").append(udpPacote.mensagem).append("])\n");
            } else {
                sb.append(" (source: ").append(pacote.source)
                  .append(", destination: ").append(pacote.destino).append(")\n");
            }
        }
        return sb.toString();
    }


    }


    public static Pacote[] geraPacotes() {
        Pacote[] out = new Pacote[5];
        out[0] = new TCP("1.1.1.1","2.2.2.2", "Olá! :)");
        out[1] = new TCP("2.2.2.2","1.1.1.1", "Olá! :)");
        out[2] = new UDP("2.2.2.2","1.1.1.1", "Olá! :)");
        out[3] = new UDP("2.2.2.2","1.1.1.1", "Olá! :)");
        out[4] = new UDP("2.2.2.2","1.1.1.1", "Tudo bem?");
        return out;
    }

    public static void main(String[] args) {
        // --------------------------------------------------------
        // Run #1
        // --------------------------------------------------------
        Pacote[] pacotes = geraPacotes();
        Pacote p1 = pacotes[0];
        Pacote p2 = pacotes[1];
        Pacote p3 = pacotes[2];
        Pacote p4 = pacotes[3];
        Pacote p5 = pacotes[4];

        Encaminhador router1 = new Encaminhador("Aveiro-UA");
        router1.addPacote(p1);
        router1.addPacote(p2);
        router1.addPacote(p3);
        router1.addPacote(p4);
        router1.addPacote(p5);

        System.out.println(router1);
        while(router1.hasPacotes()) {
            router1.enviarPacote();
        }
        System.out.println(router1);

        // --------------------------------------------------------
        // Run #2
        // --------------------------------------------------------
        pacotes = geraPacotes();
        p1 = pacotes[0];
        p2 = pacotes[1];
        p3 = pacotes[2];
        p4 = pacotes[3];
        p5 = pacotes[4];

        router1.addPacote(p1);
        router1.addPacote(p2);
        router1.addPacote(p3);
        router1.removePacote(p3);
        router1.addPacote(p4);
        router1.addPacote(p5);

        System.out.println(router1);
        while(router1.hasPacotes()) {
            router1.enviarPacote();
        }
        System.out.println(router1);
    }
}
