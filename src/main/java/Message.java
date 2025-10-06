public class Message {
    private String message;
    private String date;
    private boolean Isconfidentiel;

    public Message(String message, String date) {
        this.message = message;
        this.date = date;
        this.Isconfidentiel = Isconfidentiel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isIsconfidentiel() {
        return Isconfidentiel;
    }

    public void setIsconfidentiel(boolean isconfidentiel) {
        Isconfidentiel = isconfidentiel;
    }
}
