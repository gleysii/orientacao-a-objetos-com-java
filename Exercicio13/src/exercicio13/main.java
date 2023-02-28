package exercicio13;
public class main {
    public static void main(String[] args) { 
        Cachorro c1 = new Cachorro();
        c1.emitirSom();
        Lobo l1 = new Lobo(); 
        l1.emitirSom();
        c1.reagir("Olá");
        c1.reagir("Vai apanhar");
        c1.reagir(true);
        c1.reagir(false);
        c1.reagir(2,12.5f);
        c1.reagir(17,4.5f);
    }
}
