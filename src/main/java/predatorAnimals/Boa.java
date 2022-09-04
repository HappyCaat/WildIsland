package predatorAnimals;

import mainClasses.Animal;
import mainClasses.ProbabilityAnimals;

public class Boa extends PredatorAnimals {

    public Boa () {
        super(new ProbabilityAnimals(0,
                -1,
                15,
                0,
                0,
                0,
                0,
                20,
                40,
                0,
                0,
                0,
                0,
                10,
                0,
                0),15,30,1,3);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC0D";
    }

    @Override
    public Animal getChild() {
        return new Boa();
    }
}
