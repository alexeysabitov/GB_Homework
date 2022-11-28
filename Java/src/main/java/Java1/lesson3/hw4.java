package Java1.lesson3;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        kvadrat(a);

    }

    public static void kvadrat(int size) {

        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i == j || j == (size - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}




