package herbivoresAnimals;

import mainClasses.ProbabilityAnimals;

public class Duck extends HerbivoresAnimals {

    public Duck () {
        super (new ProbabilityAnimals(0,
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
                90,
                100), 1,200,4,0.15);
    }

    @Override
    public String toString() {
        return "\uD83E\uDD86";
    }
}
