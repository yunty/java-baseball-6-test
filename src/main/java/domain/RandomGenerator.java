package domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomGenerator {

    public static List<Integer> getNumber() {
        List<Integer> randomNumbers = new ArrayList<>();
        int index = 0;
        int randomNumber;

        while (index < 3) {
            randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
                index++;
            }
        }

        return randomNumbers;
    }
}
