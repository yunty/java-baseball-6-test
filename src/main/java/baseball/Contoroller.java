package baseball;

import baseball.view.input.InputView;
import java.util.List;

public class Contoroller {
    public void run(){
        OutputController.printStart();
        Game game = Game.create();
        while(true){
            OutputController.printInputNotice();
            String input = InputView.getUserInput();
            GameNumber userNumber = GameNumber.create(InputParse.convertStringToList(input));
            game.judge(userNumber);
        }

    }
}
