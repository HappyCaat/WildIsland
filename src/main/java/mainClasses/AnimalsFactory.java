package mainClasses;


import herbivoresAnimals.*;
import lombok.ToString;
import predatorAnimals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@ToString

public class AnimalsFactory {

    List<Callable<Animal>> producers = new ArrayList<>();

    {
        producers.add(() -> new Boar());
        producers.add(() -> new Buffalo());
        producers.add(() -> new Caterpillar());
        producers.add(() -> new Deer());
        producers.add(() -> new Duck());
        producers.add(() -> new Goat());
        producers.add(() -> new Horse());
        producers.add(() -> new Mouse());
        producers.add(() -> new Rabbit());
        producers.add(() -> new Sheep());
        producers.add(() -> new Bear());
        producers.add(() -> new Boa());
        producers.add(() -> new Eagle());
        producers.add(() -> new Fox());

    }

    public Animal createRandomAnimal() {
        int index = (int) (producers.size() * Math.random());
        try {
            return producers.get(index).call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
