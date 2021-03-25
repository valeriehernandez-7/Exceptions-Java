package cr.tec.ce1103.exceptions;

public class InvalidRequest extends Exception {
    public InvalidRequest() {
        super("Invalid number. Should be between 0-10");
    }
    public InvalidRequest (String message) {
        super(message);
    }
}
