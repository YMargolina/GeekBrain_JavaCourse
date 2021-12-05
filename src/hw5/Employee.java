package hw5;

import java.util.Arrays;

public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void employeeInfo() {
        System.out.println(name + " " + position + " " + email + " " + phone + " " + salary + " " + age);
    }

    public static void main(String[] arg) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Mironova Maria", "Accounter", "mirmar@mail.ru", "812346589", 55000, 58);
        persArray[2] = new Employee("Aronova Marina", "Economist", "aramar@mail.ru", "897456135", 50000, 50);
        persArray[3] = new Employee("Aronov Sergey", "Plumber", "aronser@mail.ru", "815546589", 55000, 39);
        persArray[4] = new Employee("Sergeev Agafon", "Engineer", "sergaf@mail.ru", "812666589", 55000, 41);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                persArray[i].employeeInfo();
            }
        }
    }
}


