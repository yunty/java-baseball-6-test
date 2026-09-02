package validator;

import exception.ErrorMessage;
import exception.InputException;

public final class InputValidator {

    private InputValidator() {
    }


    public static void validateNumber(String input) {
        validateNotBlank(input);
        validateIsCorrectLength(input);
        validateIsUnique(input);
        validateOneToNine(input);
    }

    public static void validateNotBlank(String input) {
        if (input == null || input.isBlank()) {
            throw new InputException(ErrorMessage.EMPTY_INPUT);
        }
    }

    public static void validateOneToNine(String input) {
        if (!isOneToNine(input)) {
            throw new InputException(ErrorMessage.INVALID_NUMBER);
        }
    }

    public static void validateIsCorrectLength(String input) {
        if (!isCorrectLength(input)) {
            throw new InputException(ErrorMessage.INVALID_LENGTH);
        }
    }

    public static void validateIsUnique(String input) {
        if (!isUnique(input)) {
            throw new InputException(ErrorMessage.NOT_UNIQUE);
        }
    }

    public static int validateExitOrRestart(String input) {
        if (!checkExitOrRestart(input)) {
            throw new InputException(ErrorMessage.INVALID_MENU);
        }
        return Integer.parseInt(input);
    }

    private static boolean isUnique(String input) {
        return input.chars()
                .distinct()
                .count() == 3;
    }

    private static boolean isOneToNine(String input) {
        return input.chars()
                .allMatch(c -> '1' <= c && c <= '9');
    }

    private static boolean isCorrectLength(String input) {
        return input.length() == 3;
    }

    private static boolean checkExitOrRestart(String input) {
        return input.equals("1") || input.equals("2");
    }

}
