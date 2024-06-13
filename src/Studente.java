public class Studente {
    private String nome;
    private String cognome;
    private int eta;


    public Studente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }


    public String showStudente() {
        return nome + " " + cognome + ", " + eta + " anni";
    }


    public static void main(String[] args) {
        Studente studente = new Studente("Anselmo", "Bitta", 24);
        System.out.println(studente.showStudente());
    }
}
