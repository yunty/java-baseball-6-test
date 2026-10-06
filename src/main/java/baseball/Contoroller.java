package baseball;

import baseball.validate.InputValidator;
import baseball.view.input.InputView;

public class Contoroller {
    public void run(){
        OutputController.printStart();
        do{
            playing();
        }while(isRestart());

    }

    private void playing() {
        Game game = Game.create();
        while(game.isNotFinish()){
            OutputController.printInputNotice();
            String input = getInput();
            GameNumber userNumber = GameNumber.create(InputParse.convertStringToList(input));
            game.judge(userNumber);
            OutputController.printResult(ResultDTO.from(game.playResult));
        }
        OutputController.printCorrect();
    }

    private boolean isRestart(){
        OutputController.printRestart();
        String input = getInput();
        return RestratType.from(input) == RestratType.RESTART;
    }

    private static String getInput() {
        String input = InputView.getUserInput();
        InputValidator.validate(input);
        return input;
    }
}
