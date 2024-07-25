import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileExample {

    public static void main(String[] args) {
        String filePath = "readme.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String firstLine = reader.readLine();
            System.out.println("Prima riga del file: " + firstLine);
        } catch (FileNotFoundException e) {
            System.err.println("Errore: Il file '" + filePath + "' non è stato trovato.");
        } catch (IOException e) {
            System.err.println("Errore: Si è verificato un problema durante la lettura del file.");
        }
    }
}
