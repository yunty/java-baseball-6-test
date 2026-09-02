package domain;

import java.util.List;

public class Referee {
    private boolean result;
    private int strike;
    private int ball;

    public void judge(List<Integer> randomNumbers, List<Integer> InputNumbers) {
        strike = 0;
        ball = 0;
        for (int index = 0; index < 3; index++) {
            if (randomNumbers.get(index).equals(InputNumbers.get(index))) {
                strike++;
                continue;
            }
            if (randomNumbers.contains(InputNumbers.get(index))) {
                ball++;
            }
        }
        result = strike == 3;
    }

    public boolean isStrikeOut() {
        return result;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }


}
