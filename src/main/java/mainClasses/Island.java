package mainClasses;

import herbivoresAnimals.Boar;
import lombok.Getter;
import plants.Plants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
@Getter
public class Island {

    Options options = new Options();


    public void createAnimalsAndPlantsOnIsland() {
        AnimalsFactory animalsFactory = new AnimalsFactory();

        List<List<Location>> islandArray = Options.islandArray;

        for (List<Location> locations : islandArray) {
            for (Location location : locations) {
                if (Math.random() > 0.5) {
                    location.animals.add(animalsFactory.createRandomAnimal());
                }
                if (Math.random() > 0.5) {
                    location.plants.add(new Plants());
                }
            }
        }
    }

    public List<Animal> getAnimalsList() {

        List<Animal> animals = new ArrayList<>();

        for (List<Location> locations : Options.islandArray) {
            for (Location location : locations) {
                if (!location.animals.isEmpty()) {
                    animals.addAll(location.animals);
                }
            }
        }

        return animals;
    }

    public List<Plants> getPlantsList() {

        List<Plants> plants = new ArrayList<>();

        for (List<Location> locations : Options.islandArray) {
            for (Location location : locations) {
                if (!location.plants.isEmpty()) {
                    plants.addAll(location.plants);
                }
            }
        }

        return plants;
    }
}
