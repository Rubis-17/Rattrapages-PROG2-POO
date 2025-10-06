import java.util.ArrayList;

public class Publication {
    private String id;
    private enum sender {
        UtilisateurReal , UtilisateurAnonym;
    }
    private String message;

    public Publication(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String ShowSender (){
        if (sender == UtilisateurAnonym){
            return UtilisateurAnonym();
        } else {
            return UtilisateurReale();
        }
    }

    public static void main(String[] args) {
    Publication p = new Publication("1","premier message");
    }
}
