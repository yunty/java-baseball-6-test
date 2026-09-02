package domain;

import java.util.List;

public class BaseballGame {
    private final List<Integer> randomNumbers;

    public BaseballGame() {
        this.randomNumbers = RandomGenerator.getNumber();
    }

    public List<Integer> intToList(int numbers) {
        return String.valueOf(numbers)
                .chars()
                .map(c -> c - '0')
                .boxed()
                .toList();
    }

    public void play(int numbers, Referee referee) {
        List<Integer> userNumbers = intToList(numbers);
        referee.judge(randomNumbers, userNumbers);
    }


}
