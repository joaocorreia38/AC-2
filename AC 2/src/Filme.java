public class Filme extends Evento {
    String cinema;
    String sala;
    String genero;
    String nome;
    String local;
    int capacidade;

    public Filme(String nome, String local, int capacidade, String cinema, String sala, String genero) {
        super(nome, local, capacidade);
        this.cinema = cinema;
        this.sala = sala;
        this.genero = genero;
        this.nome = nome;
        this.local = local;
        this.capacidade = capacidade;

    }


    public String toString() {
        return "Filme - Nome = " + nome + ", Local = " + local + ", Capacidade = " + capacidade + ", Cinema = " + cinema + ", Sala = " + sala + ", Gênero = " + genero;
    }
}
