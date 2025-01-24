package module2;

import java.util.HashMap;
import java.util.Map;

public class BaseEatingMapForAll {
    public HashMap<AnimalsNames,Double> WolfEatMap = (HashMap<AnimalsNames, Double>) Map.of(
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
}
