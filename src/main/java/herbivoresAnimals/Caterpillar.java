package herbivoresAnimals;

import mainClasses.ProbabilityAnimals;

public class Caterpillar extends HerbivoresAnimals {

    public Caterpillar() {
        super(new ProbabilityAnimals(0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                -1,
                100),0.01,1000,0,0);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC1B";
    }
}
