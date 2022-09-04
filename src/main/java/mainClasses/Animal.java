package mainClasses;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
public abstract class Animal {

    private final ProbabilityAnimals probability;
    private final double weigth;
    private final int maxAnimalsOnCell;
    private final int speedToMoveOnCell;
    private double foodToSatiate;
    private Location location;


    protected Animal(ProbabilityAnimals probability, double weigth, int maxAnimalsOnCell, int speedToMoveOnCell, double foodToSatiate) {
        this.probability = probability;
        this.weigth = weigth;
        this.maxAnimalsOnCell = maxAnimalsOnCell;
        this.speedToMoveOnCell = speedToMoveOnCell;
        this.foodToSatiate = foodToSatiate;

    }

    public void eat() {

    }

    public void move() {
        List<Location> moveTargets  = location.getNeighbors(speedToMoveOnCell);
        if (moveTargets.isEmpty()) {
            return;
        }
        Location newLocation = moveTargets.get((int) (moveTargets.size() * Math.random()));
        location.getAnimals().remove(this);
        newLocation.getAnimals().add(this);
        location = newLocation;
    }

    public void reproduction() {

    }

    public void dieOfHunger() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.weigth, weigth) == 0 && maxAnimalsOnCell == animal.maxAnimalsOnCell && speedToMoveOnCell == animal.speedToMoveOnCell && Double.compare(animal.foodToSatiate, foodToSatiate) == 0 && Objects.equals(probability, animal.probability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(probability, weigth, maxAnimalsOnCell, speedToMoveOnCell, foodToSatiate);
    }

    public void doTick() {
        move();
        eat();

    }
}
