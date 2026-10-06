package baseball.view.output;

public final class OutputView {
    public static void println(OutputConstant outputConstant){
        System.out.printf(outputConstant.print());
    }
    public static void printStrikeBall(int strike, int ball){
        System.out.println(ball+"볼 "+strike+"스트라이크");
    }
}
