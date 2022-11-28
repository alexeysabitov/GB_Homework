package Java1.lesson3;

public class hw1 {
    public static void main(String[] args) {

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " - " + array[i] + " ");
            System.out.println();
        }
        System.out.println("С помощью цикла и условия заменить 0 на 1, 1 на 0");
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else array[i] = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " - " + array[i]);
            System.out.println("");
        }
    }

}









