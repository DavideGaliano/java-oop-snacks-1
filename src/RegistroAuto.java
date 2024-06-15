public class RegistroAuto {
    private Auto[] auto;
    private int numeroAuto;

    // Costruttore senza parametri per inizializzare il registro vuoto
    public RegistroAuto() {
        this.auto = new Auto[100];
        this.numeroAuto = 0;
    }

    // Metodo per aggiungere un'auto al registro
    public void aggiungiAuto(Auto a) {
        if (numeroAuto < auto.length) {
            auto[numeroAuto] = a;
            numeroAuto++;
        } else {
            System.out.println("Registro pieno, impossibile aggiungere altre auto.");
        }
    }

    // Metodo per stampare la lista delle auto
    public void stampaListaAuto() {
        for (int i = 0; i < numeroAuto; i++) {
            System.out.println(auto[i].showAuto());
        }
    }

    public static void main(String[] args) {
        RegistroAuto registro = new RegistroAuto();
        Auto auto1 = new Auto("Toyota", "Corolla", 2020);
        Auto auto2 = new Auto("Honda", "Civic", 2018);

        registro.aggiungiAuto(auto1);
        registro.aggiungiAuto(auto2);

        System.out.println("Lista delle auto:");
        registro.stampaListaAuto();
    }
}