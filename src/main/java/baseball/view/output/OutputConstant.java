package baseball.view.output;

public enum OutputConstant {
    START_NOTICE("숫자 야구 게임을 시작합니다.\n"),
    INPUT_NOTICE("숫자를 입력해주세요. : ");

    private String comment;

    OutputConstant(String comment) {
        this.comment = comment;
    }

    public String print() {
        return comment;
    }

}
