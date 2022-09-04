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
    public boolean isEaten;
    private double foodToSatiate;
    public double currentSatiate;
    private Location location;


    protected Animal(ProbabilityAnimals probability, double weigth, int maxAnimalsOnCell, int speedToMoveOnCell, double foodToSatiate) {
        this.probability = probability;
        this.weigth = weigth;
        this.maxAnimalsOnCell = maxAnimalsOnCell;
        this.speedToMoveOnCell = speedToMoveOnCell;
        this.foodToSatiate = foodToSatiate;
        this.currentSatiate = foodToSatiate / 2;

    }

    //Животное питается
    public void eat() {

    }

    //Животное перемещается по локациям
    public void move() {
        List<Location> moveTargets = location.getNeighbors(speedToMoveOnCell);
        if (moveTargets.isEmpty()) {
            return;
        }

        Location newLocation = getBestMoveLocation(moveTargets);
        location.getAnimals().remove(this);
        newLocation.getAnimals().add(this);
        location = newLocation;
    }

    public Location getBestMoveLocation(List<Location> moveTargets) {
        return moveTargets.get((int) (moveTargets.size() * Math.random()));
    }

    //Животное плодится
    public void reproduction() {
        if (currentSatiate / foodToSatiate > 0.9) {
            int count = 0;
            for (Animal animal : location.getAnimals()) {
                if (animal.getClass().equals(getClass())) {
                    count++;
                }
            }
            if (count > 50) {
                return;
            }

            Animal child = getChild();
            child.location = location;
            location.getAnimals().add(child);
            // System.out.println(child + " родился новый зверь");
        }
    }

    //Животное умирает от голода
    private void dieOfHunger() {
        if (currentSatiate <= 0) {
            location.getAnimals().remove(this);
            // System.out.println(this + " животное умерло от голода");
        }
    }

    abstract public Animal getChild();

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

    public void animalBehavior() {
        if (isEaten) {
            return;
        }
        currentSatiate -= foodToSatiate / 10.0;

        move();
        eat();
        reproduction();
        dieOfHunger();

    }
}
