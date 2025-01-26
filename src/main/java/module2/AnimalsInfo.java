package module2;

public class AnimalsInfo {
    private final double[] wolfInfo = {50.0, 3.0, 8.0};
    private final double[] boaInfo = {15.0, 1.0, 3.0};
    private final double[] foxInfo = {8.0, 2.0, 2.0};
    private final double[] bearInfo = {500.0, 2.0, 80.0};
    private final double[] eagleInfo = {6.0, 3.0, 1.0};
    private final double[] horseInfo = {400.0, 4.0, 60.0};
    private final double[] deerInfo = {300.0, 4.0, 50.0};
    private final double[] rabbitInfo = {2.0, 2.0, 0.45};
    private final double[] mouseInfo = {0.05, 1.0, 0.01};
    private final double[] goatInfo = {60.0, 3.0, 10.0};
    private final double[] sheepInfo = {70.0, 3.0, 15.0};
    private final double[] boarInfo = {400.0, 2.0, 50.0};
    private final double[] buffaloInfo = {700.0, 3.0, 100.0};
    private final double[] duckInfo = {1.0, 4.0, 0.15};
    private final double[] caterpillarInfo = {0.01, 1.0, 0.0};
    private final double[] grassInfo = {1.0, 0.0, 0.0};

    public double[] getAnimalInfo(AnimalsNames name) {
        switch (name) {
            case WOLF:
                return wolfInfo;
            case BOA:
                return boaInfo;
            case FOX:
                return foxInfo;
            case BEAR:
                return bearInfo;
            case EAGLE:
                return eagleInfo;
            case HORSE:
                return horseInfo;
            case DEER:
                return deerInfo;
            case RABBIT:
                return rabbitInfo;
            case MOUSE:
                return mouseInfo;
            case GOAT:
                return goatInfo;
            case SHEEP:
                return sheepInfo;
            case BOAR:
                return boarInfo;
            case BUFFALO:
                return buffaloInfo;
            case DUCK:
                return duckInfo;
            case CATERPILLAR:
                return caterpillarInfo;
            case GRASS:
                return grassInfo;
            default:
                return null;
        }
    }

}
