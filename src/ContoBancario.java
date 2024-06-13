public class ContoBancario {
    private String numeroConto;
    private double saldo;

    // Costruttore che accetta il numero di conto e inizializza il saldo a zero
    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0.0;
    }

    // Metodo per depositare denaro sul conto
    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
        } else {
            System.out.println("L'importo del deposito deve essere positivo.");
        }
    }

    // Metodo per prelevare denaro dal conto
    public void preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
        } else if (importo > saldo) {
            System.out.println("Saldo insufficiente per il prelievo.");
        } else {
            System.out.println("L'importo del prelievo deve essere positivo.");
        }
    }

    // Metodo per ottenere il saldo corrente
    public double getSaldo() {
        return saldo;
    }


    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario("12345");
        conto.deposita(1000);
        System.out.println("Saldo dopo deposito: " + conto.getSaldo());
        conto.preleva(500);
        System.out.println("Saldo dopo prelievo: " + conto.getSaldo());
        conto.preleva(600); // Prova a prelevare più di quanto disponibile
        System.out.println("Saldo finale: " + conto.getSaldo());
    }
}
