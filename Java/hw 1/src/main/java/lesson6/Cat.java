package lesson6;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);
        this.run = 200;
        this.type = "Кот";
    }

    @Override
    public void swim(int dist) {
        System.out.println("Кошки не плавают!");
    }
}