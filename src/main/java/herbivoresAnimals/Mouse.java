package herbivoresAnimals;

import mainClasses.ProbabilityAnimals;

public class Mouse extends HerbivoresAnimals {

    public Mouse() {
        super(new ProbabilityAnimals(0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                -1,
                0,
                0,
                0,
                0,
                0,
                90,
                100), 0.05, 500, 1, 0.01);

    }

    @Override
    public String toString() {
        return "\uD83D\uDC01";
    }
}
