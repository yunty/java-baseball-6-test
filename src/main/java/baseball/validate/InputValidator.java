package baseball.validate;

import baseball.exception.BaseballException;

public class InputValidator {
    private static void isNull(String input){
        if(input == null){
            throw new BaseballException("null값이 들어올 수 없습니다.");
        }
    }
    private static void isEmptyAndBlank(String input) {
        if (input.isBlank()) {
            throw new BaseballException("빈 값 혹은 공백이 들어올 수 없습니다.");
        }
    }

    public static void validate(String input){
        isNull(input);
        isEmptyAndBlank(input);
    }
}
