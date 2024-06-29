import java.util.ArrayList;
import java.util.Collections;

public class ListOrder {

    public static void main(String[] args) {
        // Step 1: Creare un ArrayList di 5 nomi non ordinati
        ArrayList<String> names = new ArrayList<>();
        names.add("Marco");
        names.add("Luca");
        names.add("Anna");
        names.add("Davide");
        names.add("Francesco");
       

        // bubblesort
        bubbleSort(names);
        System.out.println("Array ordinato manualmente: " + names);

        //metodo predefinito
        Collections.sort(names);
        System.out.println("Array ordinato con Collections.sort(): " + names);
    }

    // Metodo per ordinare l'ArrayList usando Bubble Sort
    public static void bubbleSort(ArrayList<String> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    // Scambia gli elementi
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}