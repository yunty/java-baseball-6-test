package baseball;

import baseball.exception.BaseballException;
import java.util.Arrays;
import java.util.List;

public class InputParse {
    public static List<Integer> convertStringToList(String input) {
        String[] splitNumbers = input.split("");
        return Arrays.stream(splitNumbers)
                .map(InputParse::convertStringToInt)
                .toList();
    }
    public static int convertStringToInt(String input){
        try{
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new BaseballException("숫자만 입력 가능합니다.");
        }
    }
}
