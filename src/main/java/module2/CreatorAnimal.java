package module2;

import java.util.ArrayList;

public class CreatorAnimal {
    private final BaseEatingMapForAll baseEatingMapForAll = new BaseEatingMapForAll();
    public Herbivores createSingleAnimal(Herbivores MotherClass) {
       return new Herbivores(MotherClass.Name, MotherClass.eatMap, MotherClass.Weight, MotherClass.Height);
    }
    public Predators createSingleAnimal(Predators MotherClass) {
        return new Predators(MotherClass.Name, MotherClass.eatMap, MotherClass.Weight, MotherClass.Height);
    }

    public Grass createSingleAnimal(Grass MotherClass) {
        return new Grass(MotherClass.Name, MotherClass.eatMap, MotherClass.Weight, MotherClass.Height);
    }
    public void createSomeAnimal(GameMap map,int all) {
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                for (int k = 0; k < all ; k++) {
                        new Herbivores(AnimalsNames.DUCK, baseEatingMapForAll.getEatMap(AnimalsNames.DUCK), i, j);
                        new Herbivores(AnimalsNames.HORSE, baseEatingMapForAll.getEatMap(AnimalsNames.HORSE), i, j);
                        new Herbivores(AnimalsNames.RABBIT, baseEatingMapForAll.getEatMap(AnimalsNames.RABBIT), i, j);
                        new Herbivores(AnimalsNames.MOUSE, baseEatingMapForAll.getEatMap(AnimalsNames.MOUSE), i, j);
                }
            }
        }
    }
}
