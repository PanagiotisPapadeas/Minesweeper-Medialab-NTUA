package application;

public class InvalidValueException extends Exception {
    public InvalidValueException(String e) {
        super(e);
        System.out.println(e);
    }
}