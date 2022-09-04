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

        for (int xx = x - maxDistance; xx < x + maxDistance; xx++) {
            for (int yy = y - maxDistance; yy < y + maxDistance; yy++) {
                if (xx >= 0 && xx < Options.WORLD_WIDTH) {
                    if (yy >= 0 && yy < Options.WORLD_HEIGHT) {
                        result.add(Options.islandArray.get(xx).get(yy));
                    }
                }
            }
        }
        return result;
    }
}
