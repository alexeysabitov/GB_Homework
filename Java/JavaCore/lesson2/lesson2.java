package JavaCore.lesson2;


public class lesson2 {

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"4", "4", "3", "4"}, {"4", "2", "2", "3"}, {"1", "2", "3", "4"}, {"7", "4", "10", "0"}};
        try {
            try {
                int result = method(arr);
                System.out.println("Сумма всех элементов массива равна: " + result);
            } catch (MyArraySizeException e) {
                System.out.println("Неправильный размер массива!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}