package mainClasses;

import lombok.Getter;

import java.util.Objects;

@Getter
public abstract class Animal {

    private final ProbabilityAnimals probability;
    private final double weigth;
    private int maxAnimalsOnCell;
    private int speedToMoveOnCell;
    private double foodToSatiate;


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

    }

    public void reproduction() {

    }

    public void dieOfHunger() {

    }

    public String getSimpleClassName() {
        return this.getClass().getSimpleName();
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
}
