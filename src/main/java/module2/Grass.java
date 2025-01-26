package module2;

import java.util.Map;

public class Grass extends Animal {
    public Grass(AnimalsNames name, Map<AnimalsNames, Double> mapEat, int weight, int height) {
        Name  = name;
        eatMap =  mapEat;
        Height = height;
        Weight = weight;
    }
    public Grass Reproduce() {
        return new CreatorAnimal().createSingleAnimal(this);
    }
}
