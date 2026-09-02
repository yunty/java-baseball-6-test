package controller;

import View.InputView;
import View.OutputView;
import domain.BaseballGame;
import domain.Referee;
import validator.InputValidator;

public class BaseballController {
    private InputView input;
    private OutputView output;
    private BaseballGame baseballGame;
    private Referee referee;
    private int status;

    public BaseballController(InputView input,
                              OutputView output,
                              BaseballGame baseballGame) {
        this.input = input;
        this.output = output;
        this.baseballGame = baseballGame;
        this.status = 1;
    }

    public void gameStart() {
        while (true) {
            output.printStart();
            play();
            if (status == 2) {
                break;
            }
            reset();
        }
    }

    public void play() {
        while (!baseballGame.isStrikeOut()) {
            output.printInput();
            String userNumber = input.getUserNumber();
            InputValidator.validateNumber(userNumber);
            baseballGame.play(userNumber);
            output.printResult(baseballGame.getBall(), baseballGame.getStrike());
        }
        output.printExitOrAgain();
        status = InputValidator.validateExitOrRestart(input.getExitorAgain());
    }

    public void reset() {
        this.baseballGame = new BaseballGame();
    }
}
