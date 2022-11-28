package Java1.lesson7;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int x) {
        food += x;
    }

    public void printInfo() {
        System.out.println("Корма в тарелке: " + food + " грамм");
    }
}
