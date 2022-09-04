package mainClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Stata {
    private Island island;

    public Stata(Island island) {
        this.island = island;
    }

    //Вывод острова в консоль
    public void printIslandField() {

        for (List<Location> locations : Options.islandList) {
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
        System.out.println("Всего животных на острове: " + island.getAllAnimals().size());
        System.out.println("Количество животных каждого вида в данный момент на острове");

        //Вывод общего количества животных каждого вида
        HashMap<Class, List<Animal>> countOfAnimal = new HashMap<>();
        for (Animal printAnimal : island.getAllAnimals()) {
            List<Animal> animals = countOfAnimal.get(printAnimal.getClass());
            if (animals == null) {
                animals = new ArrayList<>();
                countOfAnimal.put(printAnimal.getClass(), animals);
            }
            animals.add(printAnimal);
        }

        countOfAnimal.forEach((k, v) -> System.out.println(v.get(0) + ": " + v.size()));

        System.out.println("..............");
        System.out.println("Количество растений на острове");

        // Вывод общего количества травы
        int countOfPlants = island.getPlantsList().size();
        System.out.println("\u2618: " + countOfPlants);
        System.out.println();

    }


}
