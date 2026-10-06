package baseball.view.output;

public final class OutputView {
    public static void println(OutputConstant outputConstant){
        System.out.printf(outputConstant.print());
    }
    public static void printResult(String result){
        System.out.println(result);
    }
}
