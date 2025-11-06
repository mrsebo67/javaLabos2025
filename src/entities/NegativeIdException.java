package entities;

public class NegativeIdException extends RuntimeException {
    public NegativeIdException(int id) {
        super(id + " is a negative number");
    }
}
