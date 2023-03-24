public class App {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50.0);
        System.out.println(ingresso.toString());

        IngressoVIP ingressoVIP = new IngressoVIP(100.0, 20.0);
        System.out.println(ingressoVIP.toString());

        Show show = new Show("Lolla", "Rio de Janeiro", 100000, "Drake");
        System.out.println(show.toString());

        Filme filme = new Filme("Avengers", "Rio de Janeiro", 35, "Cinemark", "Sala 3", "Acao");
        System.out.println(filme.toString());

        Teatro teatro = new Teatro("O fantasma da opera", "Rio de Janeiro", 1000);
        System.out.println(teatro.toString());


       
    }
}
