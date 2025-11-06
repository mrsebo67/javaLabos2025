package entities;

public class WrongNumberFormatException extends RuntimeException {
    public WrongNumberFormatException(int number) {
        super(" Broj" + number + " je krivi");
    }
}
