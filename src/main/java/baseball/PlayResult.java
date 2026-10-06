package baseball;

public class PlayResult {
    private GameStatus gameStatus;
    private int strike;
    private int ball;

    private PlayResult() {
        this.gameStatus = GameStatus.PLAYING;
        this.strike = 0;
        this.ball = 0;
    }

    private PlayResult(int strike, int ball) {
        gameStatus = GameStatus.from(strike);
        this.strike = strike;
        this.ball = ball;
    }

    public static PlayResult craeteDefaultResult() {
        return new PlayResult();
    }

    public static PlayResult createStrikeOutResult() {
        return new PlayResult(3, 0);
    }

    public static PlayResult createStrikeBallResult(int strike, int ball) {
        return new PlayResult(strike, ball);
    }

    public boolean isFinish() {
        return gameStatus == GameStatus.STRIKE_OUT;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
