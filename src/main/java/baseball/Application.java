package baseball;

import View.InputView;
import View.OutputView;
import controller.BaseballController;
import domain.BaseballGame;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        BaseballGame baseballGame = new BaseballGame();
        BaseballController baseball = new BaseballController(inputView, outputView, baseballGame);

        baseball.gameStart();
    }
}
