public class Teatro extends Evento{
    private String local;

    public Teatro(String nome, String local, int capacidade) {
        super(nome, local, capacidade);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }
}
