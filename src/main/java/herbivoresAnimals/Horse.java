package herbivoresAnimals;

import mainClasses.Animal;
import mainClasses.ProbabilityAnimals;

public class Horse extends HerbivoresAnimals {

    public Horse () {
        super (new ProbabilityAnimals(0,
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
                0,
                0,
                0,
                0,
                100), 400,20,4,60);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC0E";
    }

    @Override
    public Animal getChild() {
        return new Horse();
    }
}
