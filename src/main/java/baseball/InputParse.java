package baseball;

import baseball.exception.BaseballException;
import java.util.List;

public class InputParse {
    public static List<Integer> convertStringToList(String input){
        try {
            return List.of(Integer.parseInt(input));
        }catch (NumberFormatException e){
            throw new BaseballException("숫자만 입력 가능합니다.");
        }
    }
}
