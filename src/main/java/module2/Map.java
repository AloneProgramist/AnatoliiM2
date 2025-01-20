package module2;

import java.util.ArrayList;
import java.util.List;

public class Map {
    protected int weightMAP;
    protected int heightMAP;
    protected List[][] map;
    public Map() {
        map = new List[120][50];
        for (List[] i : map) {
            for (Object j : i) {
                j = new ArrayList<Animal>();
            }
        }
    }
}