package baseball;

import baseball.view.output.OutputConstant;
import baseball.view.output.OutputView;

public class OutputController {
    public static void printStart(){
        OutputView.println(OutputConstant.START_NOTICE);
    }
    public static void printInputNotice(){
        OutputView.println(OutputConstant.INPUT_NOTICE);
    }
}
