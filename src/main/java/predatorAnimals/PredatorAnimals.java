package predatorAnimals;

import mainClasses.Animal;
import mainClasses.ProbabilityAnimals;

public abstract class PredatorAnimals extends Animal {
    public PredatorAnimals(ProbabilityAnimals probability, double weigth, int maxAnimalsOnCell, int speedToMoveOnCell, double foodToSatiate) {
        super(probability, weigth, maxAnimalsOnCell, speedToMoveOnCell, foodToSatiate);
    }

}
