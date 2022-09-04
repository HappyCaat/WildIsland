package predatorAnimals;


import mainClasses.ProbabilityAnimals;

public class Bear extends PredatorAnimals {

    public Bear() {
        super(new ProbabilityAnimals(0,
                80,
                0,
                -1,
                0,
                40,
                80,
                80,
                90,
                70,
                70,
                50,
                20,
                10,
                0,
                0), 500, 5, 2, 8);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC3B";
    }
}
