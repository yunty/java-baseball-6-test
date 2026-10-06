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

    private PlayResult(GameStatus gameStatus, int strike, int ball) {
        this.gameStatus = gameStatus;
        this.strike = strike;
        this.ball = ball;
    }

    public static PlayResult craeteDefaultResult(){
        return new PlayResult();
    }
    public static PlayResult createStrikeOutResult(){
        return new PlayResult(GameStatus.STRIKE_OUT, 3,3);
    }
    public static PlayResult createStrikeBallResult(int strike, int ball){
        return new PlayResult(GameStatus.PLAYING, strike, ball);
    }

}
