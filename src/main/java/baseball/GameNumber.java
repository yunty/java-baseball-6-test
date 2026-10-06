package baseball;

import baseball.exception.BaseballException;
import java.util.List;
import java.util.Objects;

public class GameNumber {
    private final List<Integer> numbers;

    private GameNumber(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    public static GameNumber create(List<Integer> numbers) {
        return new GameNumber(numbers);
    }
    public static void validate(List<Integer> numbers){
        isNotMatchSizeRange(numbers);
        isNotMatchNumberRange(numbers);
        isDuplicate(numbers);
    }
    private static void isNotMatchSizeRange(List<Integer> numbers){
        if(numbers.size() == 3){
            return ;
        }
        throw new BaseballException("숫자는 3개를 입력해야합니다.");
    }
    private static void isDuplicate(List<Integer> numbers){
        int distinctNumberSize = Math.toIntExact(numbers.stream().distinct().count());
        if(numbers.size() == distinctNumberSize){
            return;
        }
        throw new BaseballException("중복된 숫자를 입력하면 안됩니다.");
    }
    private static void isNotMatchNumberRange(List<Integer> numbers){
        for(int number : numbers){
            if(number< 1 || number >9){
                throw new BaseballException("숫자는 1부터 9사이의 숫자만 가능합니다.");
            }
        }
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
