public class Show extends Evento {
    String artista;
    String nome;
    String local;
    double capacidade;


    public Show(String nome, String local, int capacidade, String artista) {
        super(nome, local, capacidade);
        this.artista = artista;
        this.nome = nome;
        this.local = local;
        this.capacidade = capacidade;
    }

    public String getArtista() {
        return artista;
    }


    public String toString() {
        return "Show - Nome =  " + nome + ", Local =  " + local + ", Capacidade =  " + capacidade + ", Artista = " + artista;
    }
}
