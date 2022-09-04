package mainClasses;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Options {
    //параметры острова

    public static final int WORLD_WIDTH = 5;
    public static final int WORLD_HEIGHT = 15;


    public static final List<List<Location>> islandArray = new ArrayList<>();

    static {
        for (int i = 0; i < WORLD_WIDTH; i++) {
            islandArray.add(new ArrayList<>());
            for (int j = 0; j < WORLD_HEIGHT; j++) {
                Location loc = new Location();
                loc.x = i;
                loc.y = j;
                islandArray.get(i).add(loc);

            }
        }
    }

}