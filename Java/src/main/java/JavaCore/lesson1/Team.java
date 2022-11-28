package JavaCore.lesson1;

import JavaCore.lesson1.animals.Cat;
import JavaCore.lesson1.animals.Dog;
import JavaCore.lesson1.obstacles.Obstacle;


public class Team {
    private String name;
    private Participant participants[];

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Participant... participantsGiven) {
        this.name = name;
        this.participants = participantsGiven;
    }

    public void getTeamInfo() {
        System.out.println("Команда: " + this.name);
        for (Participant participant : participants) {
            if (participant instanceof Dog) {
                System.out.println("Собака " + participant.getName());
            }
            if (participant instanceof Cat) {
                System.out.println("Кот " + participant.getName());
            }

        }
    }


    public void showResults() {
        for (Participant participant : participants) {
            if (!participant.isOnDistance()) {
                break;
            }
        }
    }

    public void doIt(Obstacle obstacle) {
        for (Participant participant : participants) {
            obstacle.doIt(participant);

        }
    }


}
