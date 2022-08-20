package mainClasses;

public abstract class Animal {

    private int id;
    private double weigth;
    private int maxAnimalsOnCell;
    private int speedToMoveOnCell;
    private double foodToSatiate;

    public Animal(int id, double weigth, int maxAnimalsOnCell, int speedToMoveOnCell, double foodToSatiate) {
        this.id = id;
        this.weigth = weigth;
        this.maxAnimalsOnCell = maxAnimalsOnCell;
        this.speedToMoveOnCell = speedToMoveOnCell;
        this.foodToSatiate = foodToSatiate;
    }

    public void eat () {

    }

    public void move () {

    }

    public void reproduction () {


    }

    public void dieOfHunger () {


    }

}
