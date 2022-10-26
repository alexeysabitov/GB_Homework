package lesson7;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[3];
        allCats[0] = new Cat("Барсик", 100, false);
        allCats[1] = new Cat("Марсик", 150, false);
        allCats[2] = new Cat("Вася", 300, false);


        Plate plate = new Plate(500);

        plate.printInfo();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].satiety == false && allCats[i].appetite <= plate.food) {
                allCats[i].eat(plate);
                allCats[i].satiety = true;
                System.out.println("Кот " + allCats[i].name + " сыт, он съел " + allCats[i].appetite + " грамм корма!");
            } else {
                System.out.println("Кот " + allCats[i].name + " не поел, он хотел съесть " + allCats[i].appetite + " грамм корма");
            }
        }
        plate.printInfo();
        System.out.println("Сколько грамм корма добавить в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.printInfo();

        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].satiety == false && allCats[i].appetite <= plate.food) {
                allCats[i].eat(plate);
                allCats[i].satiety = true;
                System.out.println("Кот " + allCats[i].name + " съел " + allCats[i].appetite + " грамм корма!");
                plate.printInfo();
            }
        }

    }
}