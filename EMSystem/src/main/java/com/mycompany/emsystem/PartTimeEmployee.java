package com.company.employeemanagement;

/**
 * Class representing a Part-Time Employee.
 */
public class PartTimeEmployee extends Employee {

    /**
     * Constructor to create a Part-Time Employee.
     *
     * @param id                    Employee ID.
     * @param name                  Employee name.
     * @param department            Employee department.
     * @param role                  Employee role.
     * @param workingHoursPerWeek   Working hours per week.
     * @param salary                Employee salary.
     */
    public PartTimeEmployee(String id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        // Call the parent constructor to initialize employee attributes
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    @Override
    public void clockIn() {
        // Implementation for clocking in
        System.out.println(getName() + " clocked in.");
    }

    @Override
    public void clockOut() {
        // Implementation for clocking out
        System.out.println(getName() + " clocked out.");
    }

    @Override
    public void trackWorkHours() {
        // Implementation for tracking work hours
        System.out.println(getName() + " has worked for " + getWorkingHoursPerWeek() + " hours this week.");
    }
}
