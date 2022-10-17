package lesson6;

public class Dog extends Animals {//наследующий класс

    public Dog(String name) {
        super(name);
        this.type = "Пёс";
        this.run = 500;
        this.swim = 10;

    }
}