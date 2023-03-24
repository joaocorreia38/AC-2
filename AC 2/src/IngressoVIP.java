public class IngressoVIP extends Ingresso {
    private double valorAdicional;

    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }


    public double calculaValor() {
        return super.calculaValor() + valorAdicional;
    }

    public String toString() {
        return "Ingresso VIP - Valor: " + calculaValor();
    }
}
