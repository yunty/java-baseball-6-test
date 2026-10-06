package baseball.view.output;

public enum OutputConstant {
    START_NOTICE("숫자 야구 게임을 시작합니다.\n"),
    INPUT_NOTICE("숫자를 입력해주세요 : "),
    CORRECT_NOTICE("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n"),
    RETRY_NOTICE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");
    private String comment;

    OutputConstant(String comment) {
        this.comment = comment;
    }

    public String print() {
        return comment;
    }

}