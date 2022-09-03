package predatorAnimals;

import mainClasses.Animal;

import java.util.List;

public class PredatorAnimals extends Animal {
    public PredatorAnimals(int id, double weigth, int maxAnimalsOnCell, int speedToMoveOnCell, double foodToSatiate) {
        super(id, weigth, maxAnimalsOnCell, speedToMoveOnCell, foodToSatiate);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void eat(List<Object> listForDelete) {

    }
}
