public class Evento {
    String nome;
    String local;
    int capacidade;

    public Evento(String nome, String local, int capacidade) {
        this.nome = nome;
        this.local = local;
        this.capacidade = capacidade;
    }

    public boolean verificarCapacidade(int numPessoas) {
        return capacidade >= numPessoas;
    }

    public void gravar() {}

    public String toString(){
        return "Evento - Nome = " + nome + ", Local = " + local + ", Capacidade = " + capacidade;
    }
}
