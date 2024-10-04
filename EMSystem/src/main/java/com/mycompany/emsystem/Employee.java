package com.company.employeemanagement;

/**
 * Abstract class representing an Employee in the organization.
 */
public abstract class Employee {
    private String id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    /**
     * Constructor to initialize Employee attributes.
     * 
     * @param id                    Employee ID.
     * @param name                  Employee name.
     * @param department            Employee department.
     * @param role                  Employee role.
     * @param workingHoursPerWeek   Working hours per week.
     * @param salary                Employee salary.
     */
    public Employee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getRole() {
        return role;
    }

    public int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    public double getSalary() {
        return salary;
    }

    // Abstract methods
    /**
     * Method to clock in for the employee.
     */
    public abstract void clockIn();

    /**
     * Method to clock out for the employee.
     */
    public abstract void clockOut();

    /**
     * Method to track work hours for the employee.
     */
    public abstract void trackWorkHours();
}
