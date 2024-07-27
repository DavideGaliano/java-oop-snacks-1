import java.util.ArrayList;

public class InvitatiSearch {

    public static int cercaInvitato(ArrayList<String> invitati, String nome) {
       
        for (int i = 0; i < invitati.size(); i++) {
            
            if (invitati.get(i).equals(nome)) {
                return i;  // Restituisce l'indice se il nome viene trovato
            }
        }
        return -1;  // Restituisce -1 se il nome non viene trovato
    }

    public static void main(String[] args) {
       
        ArrayList<String> invitati = new ArrayList<>();
        invitati.add("Mario");
        invitati.add("Luigi");
        invitati.add("Piero");
        invitati.add("Carlo");

        String nomeDaCercare = "Piero";
        int indice = cercaInvitato(invitati, nomeDaCercare);
        
        System.out.println("L'indice di " + nomeDaCercare + " è: " + indice);
    }
}
