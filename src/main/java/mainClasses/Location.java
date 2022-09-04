package mainClasses;

import lombok.Getter;
import plants.Plants;
import java.util.ArrayList;
import java.util.List;
@Getter
public class Location {
    public int x;
    public int y;
    private List<Animal> animals = new ArrayList<>();
    private List<Plants> plants = new ArrayList<>();
}
