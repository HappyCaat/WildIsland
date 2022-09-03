package mainClasses;

import java.util.ArrayList;
import java.util.List;

public class Options {
    //параметры острова

    public static final int WORLD_WIDTH = 5;
    public static final int WORLD_HEIGHT = 15;



    public static final List<List<Location>> islandArray = new ArrayList<>();

    static {
        for (int xx = 0; xx < WORLD_WIDTH; xx++) {
            islandArray.add(new ArrayList<>());
            for (int yy = 0; yy < WORLD_HEIGHT; yy++) {
                Location loc = new Location();
                loc.x = xx;
                loc.y = yy;
                islandArray.get(xx).add(loc);

              /*  5 5 2
                2 3 4

                5 5 2 2 3 4


                [0, 1] = 2
                getIndex(0, 1)
                index = x + y * sizeX
                index = 0 + 1 * 3 = 3   */


            }
        }
    }


    public static final int [][]probability = {

            {-1,  0,  0,  0,  0, 10, 15, 60, 80, 60, 70, 15, 10, 40,  0,   0},   // id=0  wolf

            { 0, -1, 15,  0,  0,  0,  0, 20, 40,  0,  0,  0,  0, 10,  0,   0},   // id=1  boa

            { 0,  0, -1,  0,  0,  0,  0, 70, 90,  0,  0,  0,  0, 60, 40,   0},   // id=2  fox

            { 0, 80,  0, -1,  0, 40, 80, 80, 90, 70, 70, 50, 20, 10,  0,   0},   // id=3  bear

            { 0,  0, 10,  0, -1,  0,  0, 90, 90,  0,  0,  0,  0, 80,  0,   0},   // id=4  eagle

            { 0,  0,  0,  0,  0, -1,  0,  0,  0,  0,  0,  0,  0,  0,  0, 100},   // id=5  horse

            { 0,  0,  0,  0,  0,  0, -1,  0,  0,  0,  0,  0,  0,  0,  0, 100},   // id=6  deer

            { 0,  0,  0,  0,  0,  0,  0, -1,  0,  0,  0,  0,  0,  0,  0, 100},   // id=7  rabbit

            { 0,  0,  0,  0,  0,  0,  0,  0, -1,  0,  0,  0,  0,  0, 90, 100},   // id=8  mouse

            { 0,  0,  0,  0,  0,  0,  0,  0,  0, -1,  0,  0,  0,  0,  0, 100},   // id=9  goat

            { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1,  0,  0,  0,  0, 100},   // id=10 sheep

            { 0,  0,  0,  0,  0,  0,  0,  0, 50,  0,  0, -1,  0,  0, 90, 100},   // id=11 boar

            { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1,  0,  0, 100},   // id=12 buffalo

            { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, 90, 100},   // id=13 duck

            { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, -1, 100},   // id=14 caterpillar

            { 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,   0}    // id=15 plant
            // sum == 16
    };

}
