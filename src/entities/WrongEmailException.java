package entities;

public class WrongEmailException extends Exception {

    public WrongEmailException( String input) {
        super("krivi e-mail" + input);
    }
}
