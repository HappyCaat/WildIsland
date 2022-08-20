package mainClasses;

import herbivoresAnimals.*;
import plants.Plants;
import predatorAnimals.*;

public class AnimalsFactory {

    public Animal creatingAnimalObject (AnimalsTypeEnum type) {

        Animal animal = null;

        switch (type) {
            case BOAR:
                break;
            case BUFFALO:
                animal = new Buffalo();
                break;
            case CATERPILLAR:
                animal = new Caterpillar();
                break;
            case DEER:
                animal = new Deer();
                break;
            case DUCK:
                animal = new Duck();
                break;
            case GOAT:
                animal = new Goat();
                break;
            case HORSE:
                animal = new Horse();
                break;
            case MOUSE:
                animal = new Mouse();
                break;
            case RABBIT:
                animal = new Rabbit();
                break;
            case SHEEP:
                animal = new Sheep();
                break;
            case BEAR:
                animal = new Bear();
                break;
            case BOA:
                animal = new Boa();
                break;
            case EAGLE:
                animal = new Eagle();
                break;
            case FOX:
                animal = new Fox();
                break;
            case WOLF:
                animal = new Wolf();
                break;
            case PLANTS:
                animal = new Plants();
                break;
        }
        return animal;

    }

}
