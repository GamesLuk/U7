package h1;

import java.util.random.RandomGenerator;

public class Zahl {

    boolean even = RandomGenerator.getDefault().nextBoolean();
    boolean small = RandomGenerator.getDefault().nextBoolean();
    boolean positive = RandomGenerator.getDefault().nextBoolean();
    int num = RandomGenerator.getDefault().nextInt(-100, 101);

    public void setEven() {
        even = (num % 2 == 0);
    }

    public void setPositive() {
        positive = num > 0;
    }

    public void setSmall() {
        small = num < 100;
    }

}
