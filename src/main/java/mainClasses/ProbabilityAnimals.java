package mainClasses;

import lombok.Getter;

@Getter
public class ProbabilityAnimals {
    private final int probabilityBoa;
    private final int probabilityFox;
    private final int probabilityBear;
    private final int probabilityEagle;
    private final int probabilityHorse;
    private final int probabilityDeer;
    private final int probabilityRabbit;
    private final int probabilityMouse;
    private final int probabilityGoat;
    private final int probabilitySheep;
    private final int probabilityBoar;
    private final int probabilityBuffalo;
    private final int probabilityWolf;
    private final int probabilityDuck;
    private final int probabilityCaterpillar;
    private final int probabilityPlants;

    public ProbabilityAnimals(int probabilityWolf, int probabilityBoa, int probabilityFox, int probabilityBear, int probabilityEagle, int probabilityHorse, int probabilityDeer, int probabilityRabbit, int probabilityMouse, int probabilityGoat, int probabilitySheep, int probabilityBoar, int probabilityBuffalo, int probabilityDuck, int probabilityCaterpillar, int probabilityPlants) {

        this.probabilityWolf =probabilityWolf;
        this.probabilityBoa = probabilityBoa;
        this.probabilityFox = probabilityFox;
        this.probabilityBear = probabilityBear;
        this.probabilityEagle = probabilityEagle;
        this.probabilityHorse = probabilityHorse;
        this.probabilityDeer = probabilityDeer;
        this.probabilityRabbit = probabilityRabbit;
        this.probabilityMouse = probabilityMouse;
        this.probabilityGoat = probabilityGoat;
        this.probabilitySheep = probabilitySheep;
        this.probabilityBoar = probabilityBoar;
        this.probabilityBuffalo = probabilityBuffalo;
        this.probabilityDuck = probabilityDuck;
        this.probabilityCaterpillar = probabilityCaterpillar;
        this.probabilityPlants = probabilityPlants;
    }


}
