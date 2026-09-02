package exception;

public enum ErrorMessage {

    EMPTY_INPUT("입력값이 비어 있습니다."),
    NOT_NUMBER("숫자를 입력해야 합니다."),
    INVALID_MENU("올바르지 않은 메뉴 번호입니다."),
    INVALID_NUMBER("1과 9사이의 숫자를 입력해야 합니다."),
    INVALID_FORMAT("입력 형식이 올바르지 않습니다."),
    INVALID_LENGTH("입력값의 글자 수가 올바르지 않습니다."),
    INVALID_VALUE("허용되지 않은 값입니다."),
    NOT_UNIQUE("중복된 숫자가 있습니다.");

    private static final String PREFIX = "[ERROR] ";

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}

