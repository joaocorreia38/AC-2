public class Ingresso {
    double valor;

    public Ingresso(double valor){
        this.valor = valor;
    }

    public double calculaValor() {
        return valor;
    }

    public String toString() {
        return "Ingresso - Valor = " + valor;
    }
}

