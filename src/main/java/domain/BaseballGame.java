package domain;

import java.util.List;

public class BaseballGame {
    private List<Integer> randomNumbers;
    private Referee referee;

    public BaseballGame() {
        this.randomNumbers = RandomGenerator.getNumber();
        referee = new Referee();
    }

    public List<Integer> intToList(String input) {
        return input.chars()
                .map(c -> c - '0')
                .boxed()
                .toList();
    }

    public void play(String input) {
        List<Integer> userNumbers = intToList(input);
        referee.judge(randomNumbers, userNumbers);
    }

    public int getStrike() {
        return referee.getStrike();
    }

    public int getBall() {
        return referee.getBall();
    }

    public boolean isStrikeOut() {
        return referee.isStrikeOut();
    }


}
