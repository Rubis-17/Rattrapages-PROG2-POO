public class UtilisateurAnonym {
    private String id;

    public UtilisateurAnonym(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public static void main(String[] args) {
        UtilisateurAnonym u = new UtilisateurAnonym("1");
        UtilisateurAnonym u2 = new UtilisateurAnonym("2");
    }

}
