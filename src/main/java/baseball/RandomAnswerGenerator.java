package baseball;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class RandomAnswerGenerator {
    private static final int RANGE_START = 0;
    private static final int RANGE_END = 9;
    private static final int COUNT = 3;
    private RandomAnswerGenerator(){}
    public static List<Integer> create(){
        return Randoms.pickUniqueNumbersInRange(RANGE_START, RANGE_END, COUNT);
    }
}
