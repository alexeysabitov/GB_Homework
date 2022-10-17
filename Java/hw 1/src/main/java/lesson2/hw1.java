package lesson2;

public class hw1 {
    public static void main(String[] args) {
        System.out.println(hw1(5, 10));
    }

    public static boolean hw1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

}



