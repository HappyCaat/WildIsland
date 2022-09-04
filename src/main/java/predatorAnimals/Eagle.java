package predatorAnimals;

import mainClasses.ProbabilityAnimals;

public class Eagle extends PredatorAnimals {

    public Eagle () {
        super(new ProbabilityAnimals(0,
                0,
                10,
                0,
                -1,
                0,
                0,
                90,
                90,
                0,
                0,
                0,
                0,
                80,
                0,
                0),6,20,3,1);
    }

    @Override
    public String toString() {
        return "\uD83E\uDD85";
    }
}
