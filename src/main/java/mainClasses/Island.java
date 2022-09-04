package mainClasses;

import lombok.Getter;
import plants.Plants;

import java.util.*;

@Getter
public class Island {

    //Options options = new Options();


    public void createAnimalsAndPlantsOnIsland() {
        AnimalsFactory animalsFactory = new AnimalsFactory();

        List<List<Location>> islandArray = Options.islandArray;

        for (List<Location> locations : islandArray) {
            for (Location location : locations) {
                if (Math.random() > 0.5) {
                    Animal animal = animalsFactory.createRandomAnimal();
                    animal.setLocation(location);
                    location.getAnimals().add(animal);
                    break;
                }
                if (Math.random() > 0.5) {
                    location.getPlants().add(new Plants());
                }
            }
            break;
        }
    }

    public List<Animal> getAllAnimals() {

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
        for (Animal animal : getAllAnimals()) {
            animal.doTick();
        }
    }
}

