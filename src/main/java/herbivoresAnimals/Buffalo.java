package herbivoresAnimals;

import mainClasses.ProbabilityAnimals;

public class Buffalo extends HerbivoresAnimals {


    public Buffalo () {
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
                -1,
                0,
                0,
                100), 700,10,3,100);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC03";
    }
}
