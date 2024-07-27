import java.util.HashSet;

public class HashSetComparator {

    public static boolean sameElements(HashSet<String> set1, HashSet<String> set2) {
        
        if (set1.size() != set2.size()) {
            return false;
        }

        // Verifica se tutti gli elementi di set1 sono presenti in set2
        for (String elemento : set1) {
            if (!set2.contains(elemento)) {
                return false;  // Restituisce false se un elemento di set1 non è in set2
            }
        }

        return true;
        
//        // Crea copie dei set per non modificare gli originali
//        HashSet<String> copy1 = new HashSet<>(set1);
//        HashSet<String> copy2 = new HashSet<>(set2);
//
//        // Rimuove gli elementi di set1 presenti in set2 e viceversa
//        copy1.removeAll(set2);
//        copy2.removeAll(set1);
//
//        // Se entrambi i set sono vuoti, hanno gli stessi elementi
//        return copy1.isEmpty() && copy2.isEmpty();
        
        
    }

    public static void main(String[] args) {
       
        HashSet<String> set1 = new HashSet<>();
        set1.add("Mario");
        set1.add("Luigi");
        set1.add("Carlo");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Carlo");
        set2.add("Mario");
        set2.add("Luigi");

        boolean result = sameElements(set1, set2);
        
        System.out.println("I due set hanno gli stessi elementi? " + result);
    }
}
