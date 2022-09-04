package mainClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stata {
    private Island island;

    public Stata(Island island) {
        this.island = island;
    }

    //Вывод острова в консоль
    public void printIslandField() {

        for (List<Location> locations : Options.islandArray) {
            for (Location location : locations) {
                if (!location.getAnimals().isEmpty()) {
                    String str = location.getAnimals().get(0).toString();
                    System.out.print(str);
                } else if (!location.getPlants().isEmpty()) {
                    System.out.print(location.getPlants().get(0));
                } else {
                    System.out.print(" ");
                }
                System.out.print(":");

            }
            System.out.println("| ");
        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Количество животных в данный момент в локации");


        HashMap<Class, List<Animal>> countOfAnimal = new HashMap<>();
        //Вывод общего количества животных каждого вида
        for (Animal an : island.getAllAnimals()) {
            List<Animal> animals = countOfAnimal.get(an.getClass());
            if (animals == null) {
                animals = new ArrayList<>();
                countOfAnimal.put(an.getClass(), animals);
            }
            animals.add(an);
        }


        countOfAnimal.forEach((k, v) -> System.out.print(v.get(0) + ": " + v.size() + ", "));

        System.out.println("..............");
        System.out.println("Количество растений в локации");

        // Вывод общего количества травы
        int countOfPlants = island.getPlantsList().size();
        System.out.println("\u2618: " + countOfPlants);
        System.out.println();

    }


}
