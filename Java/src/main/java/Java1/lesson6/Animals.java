package Java1.lesson6;

public class Animals {
    protected String name;
    protected String type;
    protected int run;
    protected int swim;


    public Animals(String name) {
        this.name = name;
    }

    public void run(int dist) {
        if (this.run >= dist) System.out.println(this.type + " " + this.name + " пробежал " + dist + " м.");
        else
            System.out.println(this.type + " " + this.name + " пробежал " + dist + " м., " + this.name + " Не может бегать так далеко, возможно у него допинг");
    }

    public void swim(int dist) {
        if (this.swim >= dist) System.out.println(this.type + " " + this.name + " проплывает " + dist + " м.");
        else
            System.out.println(this.type + " " + this.name + " Проплыл: " + dist + "м. Он не может плавать так далеко. Возможно он Пёс водолаз");
    }


    public void info() {
        System.out.println(this.type + " " + this.name + " может пробежать: " + this.run + " м., и проплыть: " + this.swim + " м.");
    }
}