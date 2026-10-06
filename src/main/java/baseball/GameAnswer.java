package baseball;

import java.util.List;

public class GameAnswer {
    private final List<Integer> answer;
    private GameAnswer(){
        this.answer = RandomAnswerGenerator.create();
    }
    public static GameAnswer create() {
        return new GameAnswer();
    }
}
