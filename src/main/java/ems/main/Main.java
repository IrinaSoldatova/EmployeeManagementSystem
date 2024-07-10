package ems.main;

import ems.model.Employee;
import ems.model.Supervisor;

import java.time.LocalDate;

import static ems.model.Supervisor.salaryUp;
import static ems.service.Functionality.*;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Иванов", "Иван", "Иванович", "программист",
                        "+79990002233", 200000, LocalDate.parse("1991-06-05")),
                new Employee("Петров", "Петр", "Петрович", "тестировщик",
                        "+79994445566", 100000, LocalDate.parse("1998-04-03")),
                new Employee("Сидоров", "Георгий", "Петрович", "системный администратор",
                        "+799911122233", 120000, LocalDate.parse("1973-07-08")),
                new Supervisor("Иванова", "Мария", "Ивановна", "руководитель",
                        "+79996667788", 250000, LocalDate.parse("1975-11-03")),
                new Employee("Петрова", "Екатерина", "Михайловна", "дизайнер",
                        "+79998887766", 140000, LocalDate.parse("1990-09-30"))};

        Employee employee1 = new Employee("Васильев", "Андрей",
                "Алексеевич", "менеждер по продажам",
                "+79991234567", 145000, LocalDate.parse("1986-01-01"));
        Employee employee2 = new Employee("Смирнова", "Юлия",
                "Александровна", "менеджер по закупкам",
                "+79999876543", 145000, LocalDate.parse("1991-07-11"));

        print(employees);
        salaryUp(employees, 45, 5000);
        System.out.println("=============================================================================");
        System.out.println("После повышения зарплаты:");
        print(employees);
        System.out.println("=============================================================================");
        System.out.println(avgSalary(employees));
        System.out.println(avgAge(employees));
        System.out.println(compareDate(employee2.getDateOfBirth(), employee1.getDateOfBirth()));

    }

    public static void print(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
