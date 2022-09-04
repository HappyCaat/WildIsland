package herbivoresAnimals;

import mainClasses.Animal;
import mainClasses.ProbabilityAnimals;

public class Goat extends HerbivoresAnimals {

    public Goat () {
        super (new ProbabilityAnimals(0,
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
                0,
                0,
                0,
                100), 60, 140,3,10);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC10";
    }

    @Override
    public Animal getChild() {
        return new Goat();
    }
}
