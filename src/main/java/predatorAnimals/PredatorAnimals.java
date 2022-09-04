package predatorAnimals;

import herbivoresAnimals.*;
import mainClasses.Animal;
import mainClasses.ProbabilityAnimals;

import java.util.List;

public abstract class PredatorAnimals extends Animal {
    public PredatorAnimals(ProbabilityAnimals probability, double weigth, int maxAnimalsOnCell, int speedToMoveOnCell, double foodToSatiate) {
        super(probability, weigth, maxAnimalsOnCell, speedToMoveOnCell, foodToSatiate);
    }


    @Override
    public void eat() {
        super.eat();

        List<Animal> animals = getLocation().getAnimals();

        int myProb = (int) (Math.random() * 100);


        while (true) {
            Animal animalToEat = null;
            for (Animal animal : animals) {
                if (canEat(animal, myProb)) {
                    animalToEat = animal;
                    break;
                }
            }

            if (animalToEat == null) {
                return;
            }


            if (currentSatiate > getFoodToSatiate()) {
                return;
            }
            animals.remove(animalToEat);

            animalToEat.isEaten = true;

            System.out.println(this + " eats " + animalToEat + " currentSatiate=" + currentSatiate + " of " + getFoodToSatiate());

            currentSatiate += 1;
        }
    }

    private boolean canEat(Animal animal, int myProb) {
        if (animal == this) {
            return false;
        }
        int prob = getProbabilityEat(animal);


        return prob > myProb;
    }

    private int getProbabilityEat(Animal animal) {
        ProbabilityAnimals probability = getProbability();

        if (animal instanceof Boar) {
            return probability.getProbabilityBoar();
        }
        if (animal instanceof Boa) {
            return probability.getProbabilityBoa();
        }
        if (animal instanceof Eagle) {
            return probability.getProbabilityEagle();
        }
        if (animal instanceof Fox) {
            return probability.getProbabilityFox();
        }
        if (animal instanceof Wolf) {
            return probability.getProbabilityWolf();
        }
        if (animal instanceof Buffalo) {
            return probability.getProbabilityBuffalo();
        }
        if (animal instanceof Caterpillar) {
            return probability.getProbabilityCaterpillar();
        }
        if (animal instanceof Deer) {
            return probability.getProbabilityDeer();
        }
        if (animal instanceof Duck) {
            return probability.getProbabilityDuck();
        }
        if (animal instanceof Goat) {
            return probability.getProbabilityGoat();
        }
        if (animal instanceof Horse) {
            return probability.getProbabilityHorse();
        }
        if (animal instanceof Mouse) {
            return probability.getProbabilityRabbit();
        }
        if (animal instanceof Sheep) {
            return probability.getProbabilitySheep();
        }


        return 0;
    }
}
