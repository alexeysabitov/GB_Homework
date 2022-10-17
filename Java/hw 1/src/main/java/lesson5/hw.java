package lesson5;

public class hw {
    public static void main(String[] args) {
        Employee[] sotrudnik = new Employee[5];
        sotrudnik[0] = new Employee("Иванов Иван Иванович", "Директор", "ivanov@mail.ru", "8-923-123-00-11", 60000, 41);
        sotrudnik[1] = new Employee("Петров Петр Петрович", "Менеджр", "petrov@mail.ru", "8-923-123-00-22", 40000, 32);
        sotrudnik[2] = new Employee("Сидоров Николай Андреевич", "Бухгалтер", "sidorov@mail.ru", "8-923-123-00-33", 40000, 63);
        sotrudnik[3] = new Employee("Ивашкина Зоя Николаевна", "Секретарь", "Ivashkina@mail.ru", "8-923-123-00-33", 30000, 18);
        sotrudnik[4] = new Employee("Андреев Сергей Сергеевич", "Менеджер", "Andreev@mail.ru", "8-923-123-00-44", 4000, 21);
        for (Employee employee : sotrudnik)
            if (employee.getAge() > 40)
                System.out.println(employee);

    }
}

