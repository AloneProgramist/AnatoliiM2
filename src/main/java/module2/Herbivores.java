package module2;

import java.util.Map;

public class Herbivores extends Animal {
    public Herbivores(AnimalsNames name, Map<AnimalsNames, Double> mapEat, int weight, int height) {
        Name  = name;
        eatMap =  mapEat;
        Height = height;
        Weight = weight;
    }
    public Herbivores Reproduce() {
        return new CreatorAnimal().createSingleAnimal(this);
    }
    @Override
    public void Day(GameMap map) {
        boolean isAte = eat(map);
        if (isAte) {
            move(map);
            Reproduce();
        }
        else {
            move(map);
            map.map[Weight][Height].remove(this);
        }
    }
}
