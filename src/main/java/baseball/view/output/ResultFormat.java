package baseball.view.output;


// 출력 전용 enum
public enum ResultFormat {
    NOTHING("낫싱"),
    ONLY_BALL("%2$d볼"),
    ONLY_STRIKE("%1$d스트라이크"),
    STRIKE_BALL("%2$d볼 %1$d스트라이크"),
    STRIKE_OUT("%1$d스트라이크");

    private final String format;

    ResultFormat(String format) {
        this.format = format;
    }

    public static ResultFormat from(int strike, int ball){
        boolean hasStrike = strike > 0;
        boolean hasBall = ball > 0;
        if(strike == 3){
            return STRIKE_OUT;
        }
        if(hasStrike && hasBall){
            return STRIKE_BALL;
        }
        if(hasStrike){
            return ONLY_STRIKE;
        }
        if(hasBall){
            return ONLY_BALL;
        }
        return NOTHING;
    }

    public String format(int strike, int ball) {
        return String.format(format, strike, ball);
    }
}
