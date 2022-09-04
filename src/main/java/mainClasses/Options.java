package mainClasses;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Options {
    //параметры острова

    public static final int WORLD_WIDTH = 20;
    public static final int WORLD_HEIGHT = 15;


    public static final List<List<Location>> islandList = new ArrayList<>();

    static {
        for (int i = 0; i < WORLD_WIDTH; i++) {
            islandList.add(new ArrayList<>());
            for (int j = 0; j < WORLD_HEIGHT; j++) {
                Location location = new Location();
                location.x = i;
                location.y = j;
                islandList.get(i).add(location);

            }
        }
    }

}
