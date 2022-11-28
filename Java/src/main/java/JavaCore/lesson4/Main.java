package JavaCore.lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август");

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }

        Phonebook phonebook = new Phonebook();
        System.out.println("*******************************************");

        phonebook.add("Иванов", "8-923-000-11-11");
        phonebook.add("Иванов", "8-923-000-11-12");
        phonebook.add("Петров", "8-923-000-22-21");
        phonebook.add("Сидоров", "8-923-000-33-31");
        phonebook.add("Сидоров", "8-923-000-33-32");
        System.out.println("*******************************************");

        System.out.println("Получаем номера");
        System.out.printf("Иванов: ");
        System.out.println(phonebook.get("Иванов"));
        System.out.printf("Петров: ");
        System.out.println(phonebook.get("Петров"));
        System.out.printf("Сидоров: ");
        System.out.println(phonebook.get("Сидоров"));
        System.out.printf("Кузнецов: ");
        System.out.println(phonebook.get("Кузнецов"));

        System.out.println("*******************************************");

        System.out.println("Добавляем номер к контркту");
        phonebook.add("Петров", "8-923-000-22-22");
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
    }
}
