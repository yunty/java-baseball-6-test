package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    public static List<Integer> getNumber() {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        int index = 0;
        int randomNumber;

        while (index < 3) {
            randomNumber = random.nextInt(9) + 1;
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
                index++;
            }
        }

        return randomNumbers;
    }
}
