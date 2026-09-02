package exception;

public class InputException extends IllegalArgumentException {
    public InputException(ErrorMessage errorMessage) {
        super(errorMessage.getMessage());
    }
}
