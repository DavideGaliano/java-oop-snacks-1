public class RegistroAuto {
    private Auto[] auto;
    private int numeroAuto;

    // Costruttore senza parametri per inizializzare il registro
    public RegistroAuto() {
        this.auto = new Auto[0];
        this.numeroAuto = 0;
    }

    // Metodo per aggiungere un'auto al registro
    public void aggiungiAuto(Auto a) {
        if (numeroAuto == auto.length) {
            // Creazione di un nuovo array con dimensione maggiore
            Auto[] nuovoArray = new Auto[auto.length + 1];
            // Copia dei dati dal vecchio array al nuovo
            for (int i = 0; i < auto.length; i++) {
                nuovoArray[i] = auto[i];
            }
            auto = nuovoArray;
        }
        auto[numeroAuto] = a;
        numeroAuto++;
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