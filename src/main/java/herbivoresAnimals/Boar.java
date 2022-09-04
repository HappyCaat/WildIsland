package herbivoresAnimals;

import mainClasses.*;
import predatorAnimals.Boa;

import java.awt.datatransfer.Clipboard;
import java.util.List;
import java.util.Random;

public class Boar extends HerbivoresAnimals {

    @Override
    public String toString() {
        return "\uD83D\uDC17";
    }

    public Boar() {
        super(new ProbabilityAnimals(0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                50,
                0,
                0,
                -1,
                0,
                0,
                90,
                100), 400, 50, 2, 50);
    }


    @Override
    public Animal getChild() {
        return new Boar();
    }
}
