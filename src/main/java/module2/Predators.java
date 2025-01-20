package module2;

import java.util.Map;

public class Predators extends Animal {
    public Predators(AnimalsNames name, Map<AnimalsNames, Double> mapEat) {
        setName(name);
        eatMap =  mapEat;
    }
    public Predators Reproduce() {
        return new Predators(getName(), eatMap);
    }
}
