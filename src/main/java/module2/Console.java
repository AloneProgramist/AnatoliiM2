package module2;
import java.util.Objects;
import java.util.Scanner;
public class Console {
    private final Scanner scanner = new Scanner(System.in);
    private final RunThread runThread = new RunThread();
    private boolean isAlive = true;
    private int[] getINFO(GameMap map) {
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

    private int[] getInfoFromCell(GameMap map, int row, int col) {
        int[] InfoAnimals = {0,0,0};
        for (int i = 0; i < map.map[row][col].size(); i++) {
            if (map.map[row][col].get(i).getClass().getSimpleName().equals("Grass")) {
                InfoAnimals[2] =InfoAnimals[2]+1;
            } else if (map.map[row][col].get(i).getClass().getSimpleName().equals("Predators")) {
                InfoAnimals[1] =InfoAnimals[1]+1;
            } else if (map.map[row][col].get(i).getClass().getSimpleName().equals("Herbivores")) {
                InfoAnimals[0] =InfoAnimals[0]+1;
            }
        }
        return InfoAnimals;
    }
    private void welcome() {
        System.out.println("Головне меню");
        System.out.println("1.Запустити гру");
        System.out.println("2. Вийти");
        System.out.print("Введіть число: ");
    }
    public void ConsoleInterface(GameMap map) {
        welcome();
        int num = scanner.nextInt();
        if (num == 1) {
            while (isAlive) {
                runThread.Start(map);
                extraMethod(map);
                System.out.print("Почати наступний день (n/y): ");
                String answer = scanner.next();
                if (!answer.equalsIgnoreCase("y")) {
                    isAlive = false;
                }
            }
        }
    }
    private void extraMethod(GameMap map) {
        System.out.print("Введіть строки або none:");
        String string = scanner.next();
        if (!Objects.equals(string, "none")) {
            int num = Integer.parseInt(string);
            System.out.print("Введіть колонки: ");
            int num2 = scanner.nextInt();
            int[] info = getInfoFromCell(map,num,num2);
            System.out.println("Травоядні: " + info[0] + " Хижакі:" + info[1] + " Рослини: " + info[2]);
        } else{
            int[] info = getINFO(map);
            System.out.println("Травоядні: " + info[0] + " Хижакі:" + info[1] + " Рослини: " + info[2]);
        }
    }
}
