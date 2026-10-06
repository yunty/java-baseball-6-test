package baseball;

import java.util.List;
import java.util.Objects;

public class GameNumber {
    private final List<Integer> numbers;

    private GameNumber(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static GameNumber create(List<Integer> numbers) {
        return new GameNumber(numbers);
    }

    public PlayResult judge(GameNumber userInput) {
        int strike = 0;
        int ball = 0;
        if (this.equals(userInput)) {
            return PlayResult.createStrikeOutResult();
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == userInput.numbers.get(i)) {
                strike++;
                continue;
            }
            if (numbers.contains(userInput.numbers.get(i))) {
                ball++;
            }
        }
        return PlayResult.createStrikeBallResult(strike, ball);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GameNumber that = (GameNumber) o;
        return Objects.equals(numbers, that.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numbers);
    }
}
