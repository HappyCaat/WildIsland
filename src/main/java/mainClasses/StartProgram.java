package mainClasses;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class StartProgram {


    public static void main(String[] args) {

        Island island = new Island();
        Stata statistic = new Stata(island);


        ScheduledExecutorService scheduledExecutorServiceForAnimals = Executors.newScheduledThreadPool(1);

        island.createAnimalsAndPlantsOnIsland();

        Runnable islandTask = () -> {
            try {
                System.out.println("Day: " + new Counted().getId());

                island.doTick();
                System.out.println("after do tick");
                statistic.printIslandField();
                System.out.println("end of job");

            }catch (Throwable e) {
                e.printStackTrace();
                System.exit(0);
            }
        };

        scheduledExecutorServiceForAnimals.scheduleAtFixedRate(islandTask, 1, 5, TimeUnit.SECONDS);

    }

}
