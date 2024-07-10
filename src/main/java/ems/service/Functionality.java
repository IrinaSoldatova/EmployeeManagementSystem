package ems.service;

import ems.model.Employee;

import java.time.LocalDate;

public class Functionality {

    /**
     * Метод нахождения средней зарплаты сотрудников
     *
     * @param employees сотрудники
     * @return средняя зарплата
     */
    public static float avgSalary(Employee[] employees) {
        float sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary / employees.length;
    }

    /**
     * Метод нахождения среднего возраста сотрудников
     *
     * @param employees сотрудники
     * @return средний возраст сотрудников
     */
    public static int avgAge(Employee[] employees) {
        int sumAge = 0;
        for (Employee employee : employees) {
            sumAge += employee.getAge();
        }
        return sumAge / employees.length;
    }

    /**
     * Метод сравнения возраста сотрудников
     *
     * @param dateOne дата одного сотрудника
     * @param dateTwo дата второго сотрудника
     * @return разница в возрасте
     */
    public static int compareDate(LocalDate dateOne, LocalDate dateTwo) {
        return dateOne.compareTo(dateTwo);
    }
}
