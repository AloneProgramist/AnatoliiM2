package module2;
import java.util.ArrayList;
public class RunThread {
    private ArrayList<Runnable> arrayListRunnable;
    private int[] startingNUM= new int[8];
    private int[] endingNUM = new int[8];
    private int[] startingNUMTWO= new int[8];
    private int[] endingNUMTWO = new int[8];
    public void Start(GameMap map32) {
        fillArray(startingNUM, (GameMap.weightMAP-1)/8,(GameMap.weightMAP-1)%8);
        fillArrayForEND(endingNUM, (GameMap.weightMAP-1)/8,(GameMap.weightMAP-1)%8);
        fillArray(startingNUMTWO,(GameMap.heightMAP-1)/8, (GameMap.heightMAP-1)%8);
        fillArrayForEND(endingNUMTWO,(GameMap.heightMAP-1)/8, (GameMap.heightMAP-1)%8);
        initRunnable(map32);
        for (Runnable runnable : arrayListRunnable) {
            runnable.run();
        }
    }
    private void fillArray(int[] Array, int num, int FormulNum) {
        int factor = 1;
        for (int i = 0; i < Array.length; i++) {
            if (i == 0) {
                Array[i] = 1;
            } else if (i == Array.length-1) {
                Array[i] = num*factor+FormulNum;
            } else {
                Array[i] = num*factor;
                factor++;
            }
        }
    }
    private void fillArrayForEND(int[] Array, int num, int FormulNum) {
        int factor = 1;
        for (int i = 0; i < Array.length; i++) {
             if (i == Array.length-1) {
                Array[i] = num*factor+FormulNum;
            } else {
                Array[i] = num*factor;
                factor++;
            }
        }
    }
    private void initRunnable(GameMap map32) {
        arrayListRunnable = new ArrayList<Runnable>();
        for (int i = 0; i < 8; i++) {
            int finalI = i;
            arrayListRunnable.add(() -> {
                for (int j = startingNUM[finalI]-1; j < endingNUM[finalI]; j++) {
                    for (int k = startingNUMTWO[finalI]-1; k < endingNUMTWO[finalI] ; k++) {
                        for (int l = 0; l < map32.map[j][k].size(); l++) {
                            map32.map[j][k].get(l).Day(map32);
                        }
                    }
                }
            });
        }
    }
}
