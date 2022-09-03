package mainClasses;

import lombok.Getter;

import java.util.List;
import java.util.Objects;

@Getter
public abstract class Animal {

    private final int id;
    private final double weigth;
    private int maxAnimalsOnCell;
    private int speedToMoveOnCell;
    private double foodToSatiate;

    protected Animal(int id, double weigth, int maxAnimalsOnCell, int speedToMoveOnCell, double foodToSatiate) {
        this.id = id;
        this.weigth = weigth;
        this.maxAnimalsOnCell = maxAnimalsOnCell;
        this.speedToMoveOnCell = speedToMoveOnCell;
        this.foodToSatiate = foodToSatiate;
    }

    public void eat () {

    }

    public void move () {

    }

    public void reproduction () {

    }

    public void dieOfHunger () {

    }
    public String getSimpleClassName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && Double.compare(animal.weigth, weigth) == 0 && maxAnimalsOnCell == animal.maxAnimalsOnCell && speedToMoveOnCell == animal.speedToMoveOnCell && Double.compare(animal.foodToSatiate, foodToSatiate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, weigth, maxAnimalsOnCell, speedToMoveOnCell, foodToSatiate);
    }

    public abstract void eat(List<Object> listForDelete);
}
