import java.util.HashMap;

public class DuplicateKey {

    public static void main(String[] args) {
        
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "Marco");
        map.put("2", "Luca");
        map.put("3", "Anna");
        map.put("4", "Elena");

        
        String checkKey = "2";
        boolean isDuplicato = checkChiaveDuplicata(map, checkKey);
        System.out.println("La chiave '" + checkKey + "' è duplicata? " + isDuplicato);
    }

    
    public static boolean checkChiaveDuplicata(HashMap<String, String> map, String chiave) {
        return map.containsKey(chiave);
    }
}