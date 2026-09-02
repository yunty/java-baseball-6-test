package View;

public class OutputView {
    
    public void printStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printInput() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printExitOrAgain() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void printResult(int ball, int strike) {
        StringBuilder result = new StringBuilder();
        if (ball != 0) {
            result.append(ball + "볼 ");
        }
        if (strike != 0) {
            result.append(strike + "스트라이크");
        }
        System.out.println(result.toString());
    }

    public void print(String s) {
        System.out.println(s);
    }
}
