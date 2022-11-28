package JavaCore.lesson1;

import JavaCore.lesson1.animals.Cat;
import JavaCore.lesson1.animals.Dog;
import JavaCore.lesson1.obstacles.*;

public class Application {

    public static void main(String[] args) {

        Course c = new Course(new Obstacle[]{
                new Cross(15),
                new Wall(6),
                new Water(7)
        }); // Создаем полосу препятствий
        Team team = new Team("Команда-А",
                new Cat("Барсик", 10, 12, 0),
                new Dog("Дружок", 20, 5, 15),
                new Cat("Мурзик", 9, 14, 0),
                new Dog("Шарик", 25, 20, 20));
        team.getTeamInfo();

        c.doIt(team);
        team.showResults();

    }
}
