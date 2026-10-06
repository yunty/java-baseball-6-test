package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class Game {
    boolean gameStatus;
    GameNumber answer;
    PlayResult playResult;

    private Game() {
        this.gameStatus = false;
        this.answer = GameNumber.create(RandomNumberGenerator.create());
        this.playResult = PlayResult.craeteDefaultResult();
    }

    public Game create() {
        return new Game();
    }

    public PlayResult judge(GameNumber userInput){
        playResult = answer.judge(userInput);
    }
}
