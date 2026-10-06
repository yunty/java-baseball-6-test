package baseball;

public class Game {
    private final GameNumber answer;
    PlayResult playResult;

    private Game() {
        this.answer = GameNumber.create(RandomNumberGenerator.create());
        this.playResult = PlayResult.craeteDefaultResult();
    }

    public static Game create() {
        return new Game();
    }

    public void judge(GameNumber userInput) {
        playResult = answer.judge(userInput);
    }

    public boolean isNotFinish() {
        return playResult.isFinish() == false;
    }
}
