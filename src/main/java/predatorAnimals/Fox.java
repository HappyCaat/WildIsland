package predatorAnimals;

import mainClasses.ProbabilityAnimals;

public class Fox extends PredatorAnimals {

    public Fox () {
        super(new ProbabilityAnimals(0,
                0,
                -1,
                0,
                0,
                0,
                0,
                70,
                90,
                0,
                0,
                0,
                0,
                60,
                40,
                0), 8,30,2,2);
    }

    @Override
    public String toString() {
        return "\uD83E\uDD8A";
    }
}
