package module2;

import java.util.Map;

public class Herbivores extends Animal {
    public Herbivores(AnimalsNames name, Map<AnimalsNames, Double> mapEat) {
        setName(name);
        eatMap =  mapEat;
    }
    public Herbivores Reproduce() {
        return new Herbivores(getName(), eatMap);
    }
}
