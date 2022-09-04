package mainClasses;

import lombok.Getter;
import plants.Plants;

import java.util.*;

@Getter
public class Island {

    //Создание животных и растений на острове
    public void createAnimalsAndPlantsOnIsland() {
        AnimalsFactory animalsFactory = new AnimalsFactory();

        List<List<Location>> islandArray = Options.islandList;

        for (List<Location> locations : islandArray) {
            for (Location location : locations) {

                int animalCount = (int) (Math.random() * 5);
                int plantsCount = (int) (Math.random() * 200);
                for (int i = 0; i < animalCount; i++) {
                    Animal animal = animalsFactory.createRandomAnimal();
                    animal.setLocation(location);
                    location.getAnimals().add(animal);
                }

                for (int i = 0; i < plantsCount; i++) {
                    location.getPlants().add(new Plants());
                }
            }
            break;
        }
    }

    public List<Animal> getAllAnimals() {

        List<Animal> animals = new ArrayList<>();

        for (List<Location> locations : Options.islandList) {
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

        for (List<Location> locations : Options.islandList) {
            for (Location location : locations) {
                if (!location.getPlants().isEmpty()) {
                    plants.addAll(location.getPlants());
                }
            }
        }

        return plants;
    }

    public void grassGrowth() {
        for (Animal animal : getAllAnimals()) {
            animal.animalBehavior();
        }

        for (List<Location> locations : Options.islandList) {
            for (Location location : locations) {
                for (int i = 0; i < 3; i++) {
                    if (location.getPlants().size() > 200) {
                        break;
                    }
                    location.getPlants().add(new Plants());
                }
            }
        }
    }
}

