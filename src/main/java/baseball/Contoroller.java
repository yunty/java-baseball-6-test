package baseball;

import baseball.view.input.InputView;

public class Contoroller {
    public void run(){
        OutputController.printStart();
        Game game = Game.create();
        while(game.isNotFinish()){
            OutputController.printInputNotice();
            String input = InputView.getUserInput();
            GameNumber userNumber = GameNumber.create(InputParse.convertStringToList(input));
            game.judge(userNumber);
            OutputController.printResult(ResultDTO.from(game.playResult));
        }

    }
}
