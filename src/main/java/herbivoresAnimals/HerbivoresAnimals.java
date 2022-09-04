package herbivoresAnimals;

import mainClasses.Animal;
import mainClasses.Location;
import mainClasses.ProbabilityAnimals;
import plants.Plants;

import java.util.Comparator;
import java.util.List;

public abstract class HerbivoresAnimals extends Animal {
    public HerbivoresAnimals(ProbabilityAnimals probability, double weigth, int maxAnimalsOnCell, int speedToMoveOnCell, double foodToSatiate) {
        super(probability, weigth, maxAnimalsOnCell, speedToMoveOnCell, foodToSatiate);
    }

    @Override
    public void eat() {
        super.eat();
        List<Plants> plants = getLocation().getPlants();

        while (true) {
            if (plants.isEmpty()) {
                return;
            }

            if (currentSatiate > getFoodToSatiate()) {
                return;
            }
            plants.remove(0);
            currentSatiate += 0.3;
        }
    }

    @Override
    public Location getBestMoveLocation(List<Location> moveTargets) {
        moveTargets.sort(Comparator.comparingInt(c -> -c.getPlants().size()));
        return moveTargets.get(0);
    }

    @Override
    public Animal getChild() {
        return null;
    }
}
