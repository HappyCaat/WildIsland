package herbivoresAnimals;

import mainClasses.Animal;
import mainClasses.ProbabilityAnimals;

public class Rabbit extends HerbivoresAnimals {

    public Rabbit () {
        super (new ProbabilityAnimals(0,
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
                0,
                0,
                100),2,150,2,0.45);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC07";
    }

    @Override
    public Animal getChild() {
        return new Rabbit();
    }
}
