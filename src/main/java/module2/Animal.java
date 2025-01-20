package module2;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class Animal {
    protected Map<AnimalsNames, Double> eatMap = new HashMap<>();
    private AnimalsNames Name;
    private int Height = 0;
    private int Weight = 0;
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

    public void move() {
        if (Weight != 120 && Height != 50) {

        }
    }
}
