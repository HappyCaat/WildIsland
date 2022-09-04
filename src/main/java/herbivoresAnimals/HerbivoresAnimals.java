package herbivoresAnimals;

import mainClasses.Animal;
import mainClasses.ProbabilityAnimals;

public abstract class HerbivoresAnimals extends Animal {
    public HerbivoresAnimals(ProbabilityAnimals probability, double weigth, int maxAnimalsOnCell, int speedToMoveOnCell, double foodToSatiate) {
        super(probability, weigth, maxAnimalsOnCell, speedToMoveOnCell, foodToSatiate);
    }

}
