package module2;

import java.util.Map;

public class BaseEatingMapForAll {
    private final Map<AnimalsNames, Double> WolfEatMap = Map.of(
            AnimalsNames.HORSE, 0.10,
            AnimalsNames.DEER, 0.15,
            AnimalsNames.RABBIT, 0.60,
            AnimalsNames.MOUSE, 0.80,
            AnimalsNames.GOAT, 0.60,
            AnimalsNames.SHEEP, 0.70,
            AnimalsNames.BOAR, 0.15,
            AnimalsNames.BUFFALO, 0.10,
            AnimalsNames.DUCK, 0.40
    );
    private final Map<AnimalsNames, Double> BoaEatMap = Map.of(
            AnimalsNames.FOX, 0.15,
            AnimalsNames.RABBIT, 0.20,
            AnimalsNames.MOUSE, 0.40,
            AnimalsNames.DUCK, 0.10
    );
    private final Map<AnimalsNames, Double> FoxEatMap = Map.of(
            AnimalsNames.RABBIT, 0.70,
            AnimalsNames.MOUSE, 0.90,
            AnimalsNames.DUCK, 0.60,
            AnimalsNames.CATERPILLAR, 0.40
    );
    private final Map<AnimalsNames, Double> BearEatMap = Map.of(
            AnimalsNames.BOA, 0.80,
            AnimalsNames.HORSE, 1.40,
            AnimalsNames.DEER, 0.80,
            AnimalsNames.RABBIT, 0.80,
            AnimalsNames.MOUSE, 0.90,
            AnimalsNames.GOAT, 0.70,
            AnimalsNames.SHEEP, 0.70,
            AnimalsNames.BOAR, 0.50,
            AnimalsNames.BUFFALO, 0.20,
            AnimalsNames.DUCK, 0.10
    );
    private final Map<AnimalsNames, Double> EagleEatMap = Map.of(
            AnimalsNames.FOX, 0.10,
            AnimalsNames.RABBIT, 0.90,
            AnimalsNames.MOUSE, 0.90,
            AnimalsNames.DUCK, 0.80
    );
    private final Map<AnimalsNames, Double> HorseEatMap = Map.of(
            AnimalsNames.GRASS, 1.00
    );
    private final Map<AnimalsNames, Double> DeerEatMap = Map.of(
            AnimalsNames.GRASS, 1.00
    );
    private final Map<AnimalsNames, Double> RabbitEatMap = Map.of(
            AnimalsNames.GRASS, 1.00
    );
    private final Map<AnimalsNames, Double> MouseEatMap = Map.of(
            AnimalsNames.CATERPILLAR, 0.90,
            AnimalsNames.GRASS, 1.00
    );
    private final Map<AnimalsNames, Double> GoatEatMap = Map.of(
            AnimalsNames.GRASS, 1.00
    );
    private final Map<AnimalsNames, Double> SheepEatMap = Map.of(
            AnimalsNames.GRASS, 1.00
    );
    private final Map<AnimalsNames, Double> BoarEatMap = Map.of(
            AnimalsNames.MOUSE, 0.50,
            AnimalsNames.CATERPILLAR, 0.90,
            AnimalsNames.GRASS, 1.00
    );
    private final Map<AnimalsNames, Double> BuffaloEatMap = Map.of(
            AnimalsNames.GRASS, 1.00
    );
    private final Map<AnimalsNames, Double> DuckEatMap = Map.of(
            AnimalsNames.CATERPILLAR, 0.90,
            AnimalsNames.GRASS, 1.00
    );
    private final Map<AnimalsNames, Double> CaterpillarEatMap = Map.of(
            AnimalsNames.GRASS, 1.00
    );

    public Map<AnimalsNames, Double> getEatMap(AnimalsNames name) {
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
