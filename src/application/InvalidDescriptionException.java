package application;

public class InvalidDescriptionException extends Exception {
    public InvalidDescriptionException(String e) {
        super(e);
        System.out.println(e);
    }
}