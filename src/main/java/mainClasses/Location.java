package mainClasses;

import lombok.Getter;
import plants.Plants;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Location {
    public int x;
    public int y;
    private List<Animal> animals = new ArrayList<>();
    private List<Plants> plants = new ArrayList<>();

    public List<Location> getNeighbors(int maxDistance) {
        List<Location> result = new ArrayList<>();

        for (int i = x - maxDistance; i < x + maxDistance; i++) {
            for (int j = y - maxDistance; j < y + maxDistance; j++) {
                if (i >= 0 && i < Options.WORLD_WIDTH) {
                    if (j >= 0 && j < Options.WORLD_HEIGHT) {
                        result.add(Options.islandList.get(i).get(j));
                    }
                }
            }
        }
        return result;
    }
}
