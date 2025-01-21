package module2;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class Animal {
    protected Map<AnimalsNames, Double> eatMap = new HashMap<>();
    private AnimalsNames Name;
    private int Height = 30;
    private int Weight = 60;
    public AnimalsNames getName() {
        return Name;
    }
    public void setName(AnimalsNames name) {
        Name = name;
    }


    public void eat() {

    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public void move(GameMap map) {
        if (Weight != GameMap.weightMAP && Height != GameMap.heightMAP) {
            int randomNum = (int) (Math.random() * 4);
            System.out.println(randomNum);
            switch (randomNum) {
                case 0:
                    Up(map);
                    break;
                case 1:
                    Down(map);
                    break;
                case 2:
                    Left(map);
                    break;
                case 3:
                    Right(map);
                    break;
            }
        }
    }
    private void Up(GameMap map) {
        Height=+1;
        map.map[Weight][Height-1].remove(this);
        map.map[Weight][Height].add(this);
    }
    private void Down(GameMap map) {
        Height=-1;
        map.map[Weight][Height+1].remove(this);
        map.map[Weight][Height].add(this);
    }
    private void Left(GameMap map) {
        Weight =-1;
        map.map[Weight+1][Height].remove(this);
        map.map[Weight][Height].add(this);
    }
    private void Right(GameMap map) {
        Weight =+1;
        map.map[Weight-1][Height].remove(this);
        map.map[Weight][Height].add(this);
    }
}
