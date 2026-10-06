package baseball;

public record ResultDTO(int strike, int ball) {

    public static ResultDTO from(PlayResult result) {
        int strike = result.getStrike();
        int ball = result.getBall();

        return new ResultDTO(
                strike,
                ball
        );
    }
}