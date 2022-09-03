package herbivoresAnimals;

import mainClasses.Animal;
import mainClasses.Island;
import plants.Plants;

import java.util.List;

public abstract class HerbivoresAnimals extends Animal {
    public HerbivoresAnimals(int id, double weigth, int maxAnimalsOnCell, int speedToMoveOnCell, double foodToSatiate) {
        super(id, weigth, maxAnimalsOnCell, speedToMoveOnCell, foodToSatiate);
    }
    Island island = new Island();
    Plants plants = new Plants();


    @Override
    public void eat(List<Object> listForDelete) {


        if (listForDelete.contains(plants.toString())) {
            listForDelete.remove(plants.toString());
        }
    }
}
