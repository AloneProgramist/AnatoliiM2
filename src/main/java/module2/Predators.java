package module2;

import java.util.Map;

public class Predators extends Animal {
    public Predators(AnimalsNames name, Map<AnimalsNames, Double> mapEat, int weight, int height) {
        Name  = name;
        eatMap =  mapEat;
        Height = height;
        Weight = weight;
    }
    public Predators Reproduce() {
       return new CreatorAnimal().createSingleAnimal(this);
    }
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
