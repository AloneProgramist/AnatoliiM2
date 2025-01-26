package module2;
import java.util.*;

public abstract class Animal {
    protected Map<AnimalsNames, Double> eatMap = new HashMap<>();
    private AnimalsInfo animalsInfo = new AnimalsInfo();
    private AnimalsNames Name;
    private int Height = 0;
    private int Weight = 0;
    private boolean isAte;
    public AnimalsNames getName() {
        return Name;
    }
    public void setName(AnimalsNames name) {
        Name = name;
    }


    public boolean eat(GameMap map) {
        ArrayList<Animal> animalsMap = map.map[Weight][Height];
        Set<AnimalsNames> namesEatAnimals = eatMap.keySet();
        Random random = new Random();
        for (Animal animal : animalsMap) {
            for (AnimalsNames name : namesEatAnimals) {
                if (animal.Name == name) {
                    Double value = eatMap.get(name);
                    if (random.nextDouble() <= value) {
                        double[] thisAnimalNeedToFullEat = animalsInfo.getAnimalInfo(Name);
                        double[] animalWhoEaten = animalsInfo.getAnimalInfo(animal.Name);
                        if (thisAnimalNeedToFullEat[2]/2 <= animalWhoEaten[0]) {
                            animalsMap.remove(animal);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
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
            Random random = new Random();
            int randomNUM;
            if (Weight > 0 && Weight < GameMap.weightMAP && Height > 0 && Height < GameMap.heightMAP) {
                randomNUM = random.nextInt(0,4);
                switch (randomNUM) {
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
            } else if (Weight == GameMap.weightMAP && Height == GameMap.heightMAP) {
                randomNUM = random.nextInt(0,2);
                switch (randomNUM) {
                    case 0:
                        Down(map);
                        break;
                    case 1:
                        Left(map);
                        break;
                }
            } else if (Weight == 0 && Height == 0) {
                randomNUM = random.nextInt(0,2);
                switch (randomNUM) {
                    case 0:
                        Up(map);
                        break;
                    case 1:
                        Right(map);
                        break;
                }
            } else if (Weight > 0 && Weight < GameMap.weightMAP && Height == 0) {
                randomNUM = random.nextInt(0,3);
                switch (randomNUM) {
                    case 0:
                        Up(map);
                        break;
                    case 1:
                        Right(map);
                        break;
                    case 2:
                        Left(map);
                        break;
                }
            } else if (Weight > 0 && Weight < GameMap.weightMAP && Height == GameMap.heightMAP) {
                randomNUM = random.nextInt(0,3);
                switch (randomNUM) {
                    case 0:
                        Down(map);
                        break;
                    case 1:
                        Right(map);
                        break;
                    case 2:
                        Left(map);
                        break;
                }
            } else if (Weight == 0 && Height > 0 && Height < GameMap.heightMAP) {
                randomNUM = random.nextInt(0,3);
                switch (randomNUM) {
                    case 0:
                        Down(map);
                        break;
                    case 1:
                        Right(map);
                        break;
                    case 2:
                        Up(map);
                        break;
                }
            } else if (Weight == GameMap.weightMAP && Height > 0 && Height < GameMap.heightMAP) {
                randomNUM = random.nextInt(0,3);
                switch (randomNUM) {
                    case 0:
                        Down(map);
                        break;
                    case 1:
                        Left(map);
                        break;
                    case 2:
                        Up(map);
                        break;
                }
            } else if (Weight == GameMap.weightMAP && Height == 0) {
                randomNUM = random.nextInt(0, 2);
                switch (randomNUM) {
                    case 0:
                        Left(map);
                        break;
                    case 1:
                        Up(map);
                        break;
                }
            } else if (Weight == 0 && Height == GameMap.heightMAP) {
                randomNUM = random.nextInt(0, 2);
                switch (randomNUM) {
                    case 0:
                        Right(map);
                        break;
                    case 1:
                        Down(map);
                        break;
                }
            }

    }
    public void moveACoupleOfTimes(GameMap map, int times) {
        for (int i = 0; i < times ; i++) {
            move(map);
        }
    }
    private void Up(GameMap map) {
        Height=Height+1;
        map.map[Weight][Height-1].remove(this);
        map.map[Weight][Height].add(this);
    }
    private void Down(GameMap map) {
        Height=Height-1;
        map.map[Weight][Height+1].remove(this);
        map.map[Weight][Height].add(this);
    }
    private void Left(GameMap map) {
        Weight =Weight-1;
        map.map[Weight+1][Height].remove(this);
        map.map[Weight][Height].add(this);
    }
    private void Right(GameMap map) {
        Weight =Weight+1;
        map.map[Weight-1][Height].remove(this);
        map.map[Weight][Height].add(this);
    }
}
