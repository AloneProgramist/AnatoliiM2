package module2;

import java.util.ArrayList;
public class GameMap {
    protected static int weightMAP;
    protected static int heightMAP;
    protected ArrayList<Animal>[][] map;
    public void initMap() {
        map = new ArrayList[weightMAP][heightMAP];
        for (int i = 0; i < weightMAP; i++) {
            for (int j = 0; j < heightMAP; j++) {
                map[i][j] = new ArrayList<>();
            }
        }
    }


}