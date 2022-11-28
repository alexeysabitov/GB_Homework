package Java1.lesson3;

public class hw5 {


    public static void main(String[] args) {
        doTask5(6, 3);
    }

    public static void doTask5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println("[" + i + "] - " + arr[i] + " ");
        }

    }
}
