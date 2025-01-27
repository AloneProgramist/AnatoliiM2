package module2;

import java.util.ArrayList;

public class Console {
    public int[] getINFO(GameMap map) {
        int[] InfoAnimals = {0,0,0};
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                for (int k = 0; k < map.map[i][j].size(); k++) {
                    if (map.map[i][j].get(k).getClass().getSimpleName().equals("Grass")) {
                        InfoAnimals[2] =InfoAnimals[2]+1;
                    } else if (map.map[i][j].get(k).getClass().getSimpleName().equals("Predators")) {
                        InfoAnimals[1] =InfoAnimals[1]+1;
                    } else if (map.map[i][j].get(k).getClass().getSimpleName().equals("Herbivores")) {
                        InfoAnimals[0] =InfoAnimals[0]+1;
                    }
                }
            }
        }
        return InfoAnimals;
    }
}
