public class Auto {
    private String marca;
    private String modello;
    private int anno;

    public Auto(String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    public String showAuto() {
        return marca + " " + modello + ", " + anno;
    }
}