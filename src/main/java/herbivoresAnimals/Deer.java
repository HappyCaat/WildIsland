package herbivoresAnimals;

import mainClasses.Animal;
import mainClasses.ProbabilityAnimals;

public class Deer extends HerbivoresAnimals {

    public Deer () {
        super(new ProbabilityAnimals(0,
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
                0,
                100),300,20,4,50);
    }


    @Override
    public String toString() {
        return "\uD83E\uDD8C";
    }

    @Override
    public Animal getChild() {
        return new Deer();
    }
}
