package mainClasses;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class StartProgram {

    public static void main(String[] args) {

        Island island = new Island();
        Stata statistic = new Stata(island);

        ScheduledExecutorService scheduledExecutorServiceForAnimals = Executors.newScheduledThreadPool(1);


        Runnable islandTask = () -> {
            try {

                System.out.println("День: " + new Counted().getId());
                Thread.sleep(2000);

                island.createAnimalsAndPlantsOnIsland();
                island.grassGrowth();
                statistic.printIslandField();


            } catch (Throwable e) {
                e.printStackTrace();
                System.exit(0);
            }
        };

        scheduledExecutorServiceForAnimals.scheduleAtFixedRate(islandTask, 1, 5, TimeUnit.SECONDS);

    }

}
