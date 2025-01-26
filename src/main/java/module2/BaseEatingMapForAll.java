package module2;

import java.util.HashMap;
import java.util.Map;

public class BaseEatingMapForAll {
    private HashMap<AnimalsNames,Double> WolfEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.HORSE,0.10,
            AnimalsNames.DEER,0.15,
            AnimalsNames.RABBIT,0.60,
            AnimalsNames.MOUSE, 0.80,
            AnimalsNames.GOAT,0.60,
            AnimalsNames.SHEEP, 0.70,
            AnimalsNames.BOAR, 0.15,
            AnimalsNames.BUFFALO, 0.10,
            AnimalsNames.DUCK, 0.40
    );
    private HashMap<AnimalsNames,Double> BoaEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.FOX, 0.15,
            AnimalsNames.RABBIT, 0.20,
            AnimalsNames.MOUSE, 0.40,
            AnimalsNames.DUCK, 0.10
    );
    private HashMap<AnimalsNames,Double> FoxEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.RABBIT, 0.70,
            AnimalsNames.MOUSE,0.90,
            AnimalsNames.DUCK,0.60,
            AnimalsNames.CATERPILLAR,0.40
    );
    private HashMap<AnimalsNames,Double> BearEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.BOA, 0.80,
            AnimalsNames.HORSE, 0.40,
            AnimalsNames.DEER,0.80,
            AnimalsNames.RABBIT,0.80,
            AnimalsNames.MOUSE,0.90,
            AnimalsNames.GOAT,0.70,
            AnimalsNames.SHEEP, 0.70,
            AnimalsNames.BOAR, 0.50,
            AnimalsNames.BUFFALO,0.20,
            AnimalsNames.DUCK,0.10
    );
    private HashMap<AnimalsNames,Double> EagleEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.FOX,0.10,
            AnimalsNames.RABBIT,0.90,
            AnimalsNames.MOUSE,0.90,
            AnimalsNames.DUCK, 0.80
    );
    private HashMap<AnimalsNames,Double> HorseEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.GRASS, 1.00
    );
    private HashMap<AnimalsNames,Double> DeerEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.GRASS, 1.00
    );
    private HashMap<AnimalsNames,Double> RabbitEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.GRASS, 1.00
    );
    private HashMap<AnimalsNames,Double> MouseEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.CATERPILLAR, 0.90,
            AnimalsNames.GRASS, 1.00
    );
    private HashMap<AnimalsNames,Double> GoatEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.GRASS, 1.00
    );
    private HashMap<AnimalsNames,Double> SheepEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.GRASS, 1.00
    );
    private HashMap<AnimalsNames,Double> BoarEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.MOUSE,0.50,
            AnimalsNames.CATERPILLAR, 0.90,
            AnimalsNames.GRASS, 1.00
    );
    private HashMap<AnimalsNames,Double> BuffaloEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.GRASS, 1.00
    );
    private HashMap<AnimalsNames,Double> DuckEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.CATERPILLAR, 0.90,
            AnimalsNames.GRASS, 1.00
    );
    private HashMap<AnimalsNames,Double> CaterpillarEatMap = (HashMap<AnimalsNames, Double>) Map.of(
            AnimalsNames.GRASS, 1.00
    );

    public HashMap<AnimalsNames,Double> getEatMap(AnimalsNames name) {
        switch (name) {
            case WOLF:
                return WolfEatMap;
            case BOA:
                return BoaEatMap;
            case FOX:
                return FoxEatMap;
            case BEAR:
                return BearEatMap;
            case EAGLE:
                return EagleEatMap;
            case HORSE:
                return HorseEatMap;
            case DEER:
                return DeerEatMap;
            case RABBIT:
                return RabbitEatMap;
            case MOUSE:
                return MouseEatMap;
            case GOAT:
                return GoatEatMap;
            case SHEEP:
                return SheepEatMap;
            case BOAR:
                return BoarEatMap;
            case BUFFALO:
                return BuffaloEatMap;
            case DUCK:
                return DuckEatMap;
            case CATERPILLAR:
                return CaterpillarEatMap;
            default:
                throw new IllegalArgumentException("No eating map available for: " + name);
        }
    }
}
