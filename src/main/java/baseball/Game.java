package baseball;

public class Game {
    boolean gameStatus;
    GameAnswer gameAnswer;
    PlayResult playResult;
    private Game(){
        this.gameStatus = false;
        this.gameAnswer = GameAnswer.create();
    }
    public Game create(){
        return new Game();
    }
}
