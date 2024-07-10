package ems.model;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String lastName;
    private String firstName;
    private String middleName;
    private String position;
    private String phoneNumber;
    private int salary;
    private LocalDate dateOfBirth;

    public Employee(String lastName, String firstName, String middleName, String position, String phoneNumber,
                    int salary, LocalDate dateOfBirth) {
        if (salary < 0 || dateOfBirth.isAfter(LocalDate.now()) || lastName == null || lastName.isEmpty() ||
                firstName == null || firstName.isEmpty() || position == null || position.isEmpty()) {
            throw new IllegalArgumentException("Некорректные данные при создании объекта Employee.");
        }
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Метод вычисляющий возраст сотрудника на основании текущей даты
     *
     * @return возраст сотрудника
     */
    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        return period.getYears();
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("Сотрудник: Фамилия = %s, Имя = %s," + " Отчество = %s " + "\n" +
                        "Должность = " + "%s, Номер телефона = %s, Зарплата = %d, Возраст = %d",
                getLastName(), getFirstName(), getMiddleName(), getPosition(), getPhoneNumber(), getSalary(), getAge());
    }
}
