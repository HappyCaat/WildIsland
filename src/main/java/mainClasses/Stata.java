package mainClasses;

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

        //Вывод общего количества животных каждого вида
                 Map<Animal, Long> countOfAnimal = island.getAllAnimals()
                 .stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        countOfAnimal.forEach((k, v) -> System.out.print(k + ": " + v + ", "));

        System.out.println("..............");
        System.out.println("Количество растений в локации");

        // Вывод общего количества травы
        int countOfPlants = island.getPlantsList().size();
        System.out.println("\u2618: " + countOfPlants);
        System.out.println();

    }


}
