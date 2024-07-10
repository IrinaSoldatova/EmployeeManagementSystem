package ems.model;

import java.time.LocalDate;

public class Supervisor extends Employee {

    public Supervisor(String lastName, String firstName, String middleName,
                      String position, String phoneNumber, int salary, LocalDate dateOfBirth) {
        super(lastName, firstName, middleName, position, phoneNumber, salary, dateOfBirth);
    }

    /**
     * Метод для повышения зарплаты для сотрудников
     *
     * @param employees сотрудники
     * @param age       возраст
     * @param increment сумма повышения
     */
    public static void salaryUp(Employee[] employees, int age, int increment) {
        for (Employee employee : employees) {
            if ((employee.getAge() > age) && (!(employee instanceof Supervisor))) {
                int newSalary = employee.getSalary() + increment;
                employee.setSalary(newSalary);
            }
        }
    }
}
