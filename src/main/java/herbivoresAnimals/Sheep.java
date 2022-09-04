package herbivoresAnimals;

import mainClasses.ProbabilityAnimals;

public class Sheep extends HerbivoresAnimals {

    public Sheep (){
        super (new ProbabilityAnimals(0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                -1,
                0,
                0,
                0,
                0,
                100),70,140,3,15);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC11";
    }
}
