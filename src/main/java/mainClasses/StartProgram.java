package mainClasses;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class StartProgram {


    public static void main(String[] args) {

        Island island = new Island();


        ScheduledExecutorService scheduledExecutorServiceForAnimals = Executors.newScheduledThreadPool(1);

        island.createAnimalsAndPlantsOnIsland();

        Runnable islandTask = () -> {
            System.out.println("Day: " + new Counted().getId());

            island.doTick();
            Stata statistic = new Stata(island);
            statistic.printIslandField();

        };

        scheduledExecutorServiceForAnimals.scheduleAtFixedRate(islandTask, 1, 5, TimeUnit.SECONDS);

    }

}
