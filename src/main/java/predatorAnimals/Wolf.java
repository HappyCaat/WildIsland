package predatorAnimals;

import mainClasses.Animal;
import mainClasses.ProbabilityAnimals;

public class Wolf extends PredatorAnimals {

    public Wolf () {
        super(new ProbabilityAnimals(-1,
                0,
                0,
                0,
                0,
                10,
                15,
                60,
                80,
                60,
                70,
                15,
                10,
                40,
                0, 0),50,30,3,8);

    }


    @Override
    public String toString() {
        return " \uD83D\uDC3A";
    }

    @Override
    public Animal getChild() {
        return new Wolf();
    }
}
