package Java1.lesson2;

public class hw2 {

    public static void main(String[] args) {
        hw2(-15);
    }

    static void hw2(int a) {
        if (a >= 0) {
            System.out.println(a + " Положительное");
        } else {
            System.out.println(a + " Отрицательное");
        }
    }
}