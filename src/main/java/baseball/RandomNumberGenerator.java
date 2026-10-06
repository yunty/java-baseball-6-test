package baseball;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {
    private static final int RANGE_START = 0;
    private static final int RANGE_END = 9;
    private static final int COUNT = 3;

    private RandomNumberGenerator(){}
    public static List<Integer>  create(){
        List<Integer> list = new ArrayList<>();
        while(list.size()<COUNT){
            int number = Randoms.pickNumberInRange(RANGE_START, RANGE_END);
            if(list.contains(number)){
                continue;
            }
            list.add(number);
        }
        return list;
    }
}
