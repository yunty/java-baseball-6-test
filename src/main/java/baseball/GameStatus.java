package baseball;

import baseball.exception.BaseballException;
import java.util.Arrays;
import java.util.function.IntPredicate;

public enum GameStatus {
    PLAYING(strike -> strike < 3 && strike >= 0),
    STRIKE_OUT(strike -> strike == 3);

    private IntPredicate condition;

    GameStatus(IntPredicate condition) {
        this.condition = condition;
    }

    public static GameStatus from(int strike) {
        return Arrays.stream(values())
                .filter(status -> status.condition.test(strike))
                .findFirst()
                .orElseThrow(() -> new BaseballException("판정 결과가 올바른 형식이 아닙니다."));
    }

}
