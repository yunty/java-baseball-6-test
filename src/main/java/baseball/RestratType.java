package baseball;

import baseball.exception.BaseballException;
import java.util.Arrays;

public enum RestratType {
    RESTART("1"),
    END("2");

    private String state;

    RestratType(String state) {
        this.state = state;
    }

    public static RestratType from(String state){
        return Arrays.stream(values())
                .filter(type ->type.state.equals(state))
                .findFirst()
                .orElseThrow(()->new BaseballException("1 또는 2를 입력해야합니다."));
    }
}
