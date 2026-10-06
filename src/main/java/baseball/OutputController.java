package baseball;

import baseball.view.output.OutputConstant;
import baseball.view.output.OutputView;
import baseball.view.output.ResultFormat;
import java.util.Arrays;

public class OutputController {
    public static void printStart(){
        OutputView.println(OutputConstant.START_NOTICE);
    }
    public static void printInputNotice(){
        OutputView.println(OutputConstant.INPUT_NOTICE);
    }
    public static void printResult(ResultDTO resultDTO){
        String result = ResultFormat.from(resultDTO.strike(), resultDTO.ball()).format(resultDTO.strike(),resultDTO.ball());
        OutputView.printResult(result);
    }
}
