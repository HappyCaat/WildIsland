package plants;

import lombok.Getter;
import mainClasses.ProbabilityAnimals;

@Getter
public class Plants {

    private int weigth = 1;

    public Plants() {
        new ProbabilityAnimals(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        this.weigth = getWeigth();
    }

    @Override
    public String toString() {
        return "\u2618";
    }
}
