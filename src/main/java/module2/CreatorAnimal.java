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
        return new Grass(MotherClass.Name, MotherClass.Weight, MotherClass.Height);
    }
    public void createSomeAnimal(GameMap map,int all) {
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                for (int k = 0; k < all ; k++) {
                    map.map[i][j].add(new Herbivores(AnimalsNames.DUCK, baseEatingMapForAll.getEatMap(AnimalsNames.DUCK), i, j));
                    map.map[i][j].add(new Herbivores(AnimalsNames.HORSE, baseEatingMapForAll.getEatMap(AnimalsNames.HORSE), i, j));
                    map.map[i][j].add(new Herbivores(AnimalsNames.RABBIT, baseEatingMapForAll.getEatMap(AnimalsNames.RABBIT), i, j));
                    map.map[i][j].add(new Herbivores(AnimalsNames.MOUSE, baseEatingMapForAll.getEatMap(AnimalsNames.MOUSE), i, j));
                    map.map[i][j].add(new Herbivores(AnimalsNames.GOAT, baseEatingMapForAll.getEatMap(AnimalsNames.GOAT), i, j));
                    map.map[i][j].add(new Herbivores(AnimalsNames.SHEEP, baseEatingMapForAll.getEatMap(AnimalsNames.SHEEP), i, j));
                    map.map[i][j].add(new Herbivores(AnimalsNames.BOAR, baseEatingMapForAll.getEatMap(AnimalsNames.BOAR), i, j));
                    map.map[i][j].add(new Herbivores(AnimalsNames.BUFFALO, baseEatingMapForAll.getEatMap(AnimalsNames.BUFFALO), i, j));
                    map.map[i][j].add(new Herbivores(AnimalsNames.DEER, baseEatingMapForAll.getEatMap(AnimalsNames.DEER), i, j));
                    map.map[i][j].add(new Herbivores(AnimalsNames.CATERPILLAR, baseEatingMapForAll.getEatMap(AnimalsNames.CATERPILLAR), i, j));
                    map.map[i][j].add(new Predators(AnimalsNames.WOLF, baseEatingMapForAll.getEatMap(AnimalsNames.WOLF), i, j));
                    map.map[i][j].add(new Predators(AnimalsNames.BOA, baseEatingMapForAll.getEatMap(AnimalsNames.BOA), i, j));
                    map.map[i][j].add(new Predators(AnimalsNames.FOX, baseEatingMapForAll.getEatMap(AnimalsNames.FOX), i, j));
                    map.map[i][j].add(new Predators(AnimalsNames.BEAR, baseEatingMapForAll.getEatMap(AnimalsNames.BEAR), i, j));
                    map.map[i][j].add(new Predators(AnimalsNames.EAGLE, baseEatingMapForAll.getEatMap(AnimalsNames.EAGLE), i, j));
                    map.map[i][j].add(new Grass(AnimalsNames.GRASS, i, j));
                }
            }
        }
    }
}
