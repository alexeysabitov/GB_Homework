package lesson6;


public class hw {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");


        Dog dog1 = new Dog("Шарик");


        cat1.info();
        dog1.info();


        System.out.println();

        dog1.run(504);
        dog1.swim(11);


        System.out.println();

        cat1.run(299);
        cat1.swim(0);

    }


}
