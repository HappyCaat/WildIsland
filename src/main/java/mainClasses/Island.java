package mainClasses;

import herbivoresAnimals.Boar;
import lombok.Getter;
import plants.Plants;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
@Getter
public class Island {

    //Options options = new Options();


    public void createAnimalsAndPlantsOnIsland() {
        AnimalsFactory animalsFactory = new AnimalsFactory();

        List<List<Location>> islandArray = Options.islandArray;

        for (List<Location> locations : islandArray) {
            for (Location location : locations) {
                if (Math.random() > 0.7) {
                    location.getAnimals().add(animalsFactory.createRandomAnimal());
                }
                if (Math.random() > 0.5) {
                    location.getPlants().add(new Plants());
                }
            }
        }
    }

    public List<Animal> getAnimalsList() {

        List<Animal> animals = new ArrayList<>();

        for (List<Location> locations : Options.islandArray) {
            for (Location location : locations) {
                if (!location.getAnimals().isEmpty()) {
                    animals.addAll(location.getAnimals());
                }
            }
        }

        return animals;
    }

    public List<Plants> getPlantsList() {

        List<Plants> plants = new ArrayList<>();

        for (List<Location> locations : Options.islandArray) {
            for (Location location : locations) {
                if (!location.getPlants().isEmpty()) {
                    plants.addAll(location.getPlants());
                }
            }
        }

        return plants;
    }

    public void doTick() {
        Set<Animal> madeTick = new HashSet<>();
        for (List<Location> locations : Options.islandArray) {
            for (Location location : locations) {
                for (Animal animal : location.getAnimals()) {

                    if (madeTick.contains(animal)) {
                        continue; // already made turn
                    }


                    animal.eat();
                }
            }
        }
    }
}
