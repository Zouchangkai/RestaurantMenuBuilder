package com.company.employeemanagement;

/**
 * Builder class for creating Part-Time Employees.
 */
public class PartTimeEmployeeBuilder implements EmployeeBuilder {
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void setWorkingHoursPerWeek(int hours) {
        this.workingHoursPerWeek = hours;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public Employee build() {
        return new PartTimeEmployee("PT-" + name.hashCode(), name, department, role, workingHoursPerWeek, salary);
    }
}
