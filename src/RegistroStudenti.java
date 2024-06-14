public class RegistroStudenti {
    private Studente[] studenti;
    private int numeroStudenti;

    // Costruttore senza parametri per inizializzare il registro vuoto
    public RegistroStudenti() {
        this.studenti = new Studente[100];
        this.numeroStudenti = 0;
    }

    // Metodo per aggiungere uno studente al registro
    public void aggiungiStudente(Studente studente) {
        if (numeroStudenti < studenti.length) {
            studenti[numeroStudenti] = studente;
            numeroStudenti++;
        } else {
            System.out.println("Registro pieno, impossibile aggiungere altri studenti.");
        }
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