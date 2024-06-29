import java.util.ArrayList;
import java.util.Collections;

public class ListOrder {

    public static void main(String[] args) {
        // Step 1: Creare un ArrayList di 10 nomi non ordinati
        ArrayList<String> names = new ArrayList<>();
        names.add("Marco");
        names.add("Luca");
        names.add("Anna");
        names.add("Elena");
        names.add("Francesco");
        names.add("Paolo");
        names.add("Sara");
        names.add("Giulia");
        names.add("Alessandro");
        names.add("Martina");

        //bubblesort
        bubbleSort(names);
        System.out.println("Array ordinato manualmente: " + names);

        //metodo predefinito
        Collections.sort(names);
        System.out.println("Array ordinato con Collections.sort(): " + names);
    }

    // Metodo per ordinare l'ArrayList usando Bubble Sort
    public static void bubbleSort(ArrayList<String> list) {
        int n = list.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    // Scambia gli elementi
                    String temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }
            }
            n--; // Riduce il range di confronto perché l'ultimo elemento è già ordinato
        } while (swapped);
    }
}
