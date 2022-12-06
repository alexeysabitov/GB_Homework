//1. Реализовать сохранение данных в csv файл;
//2. Реализовать загрузку данных из csv файла. Файл читается целиком.
// Структура csv файла:
//| Строка заголовок с набором столбцов |
//| Набор строк с целочисленными значениями |
//| * Разделитель между столбцами - символ точка с запятой (;) |
//
//Пример:
//Value 1;Value 2;Value 3
//100;200;123
//300,400,500
//Для хранения данных использовать класс вида:
//public class AppData {
//private String[] header;
//private int[][] data;
//
//// ...
//}

package JavaCore.lesson5;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class write {

    public static void main(String[] args) {

        String tempString1 = "1. Andrey, Ivanov\n";
        String tempString2 = "2. Ivan, Petrov\n";
        String tempString3 = "3. Petr, Sidorov\n";


        File file = new File("write.csv");

        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(file);
            outputStream.write(tempString1.getBytes(StandardCharsets.UTF_8));
            outputStream.write(tempString2.getBytes(StandardCharsets.UTF_8));
            outputStream.write(tempString3.getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        //чтение файла
        try (BufferedReader reader = new BufferedReader(new FileReader("write.csv"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}

