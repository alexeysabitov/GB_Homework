package Java1.lesson5;

class Employee {
    private String name;
    private String title;
    private String email;
    private String phnumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.title = position;
        this.email = email;
        this.phnumber = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return ("ФИО: " + name + "\n"
                + "Должность: " + title + "\n-"
                + "email: " + email + "\n-"
                + "Номер телефона: " + phnumber + "\n-"
                + "Зарплата: " + salary + "\n-"
                + "Возраст: " + age);
    }
}