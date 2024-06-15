public class RegistroStudenti {
    private Studente[] studenti;
    private int numeroStudenti;

    // Costruttore senza parametri per inizializzare il registro
    public RegistroStudenti() {
        this.studenti = new Studente[0];
        this.numeroStudenti = 0;
    }

    // Metodo per aggiungere uno studente al registro
    public void aggiungiStudente(Studente studente) {
        if (numeroStudenti == studenti.length) {
            // Creazione di un nuovo array con dimensione maggiore
            Studente[] nuovoArray = new Studente[studenti.length + 1];
            // Copia dei dati dal vecchio array al nuovo
            for (int i = 0; i < studenti.length; i++) {
                nuovoArray[i] = studenti[i];
            }
            studenti = nuovoArray;
        }
        studenti[numeroStudenti] = studente;
        numeroStudenti++;
    }

    // Metodo per stampare la lista degli studenti
    public void stampaListaStudenti() {
        for (int i = 0; i < numeroStudenti; i++) {
            System.out.println(studenti[i].showStudente());
        }
    }

    public static void main(String[] args) {
        RegistroStudenti registro = new RegistroStudenti();
        Studente studente1 = new Studente("Anselmo", "Bitta", 24);
        Studente studente2 = new Studente("Giulia", "Rossi", 22);

        registro.aggiungiStudente(studente1);
        registro.aggiungiStudente(studente2);

        System.out.println("Lista degli studenti:");
        registro.stampaListaStudenti();
    }
}