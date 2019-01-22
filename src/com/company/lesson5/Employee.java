package com.company.lesson5;

/**
 * #Summary:
 * #Author: Andrii_Marchenko1
 * #Author’s Email:
 * #Creation Date: 1/15/2019
 * #Comments:
 */
public class Employee extends Person {
    private Long salary;
    private byte vacationDays;

    @Override
    public String getFirstName() {
        return "Vasya";
    }

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Employee(String firstName, String lastName, Long salary, byte vacationDays) {
        super(firstName, lastName);
        this.salary = salary;
        this.vacationDays = vacationDays;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public byte getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(byte vacationDays) {
        this.vacationDays = vacationDays;
    }

    @Override
    public void display() {
        System.out.println("We are in Employee: ");
        super.display();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Employee employee = (Employee) o;

        if (vacationDays != employee.vacationDays) return false;
        return salary != null ? salary.equals(employee.salary) : employee.salary == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (int) vacationDays;
        return result;
    }

    @Override
    public String toString() {
        return "Employee";
    }
}
