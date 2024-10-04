package com.company.employeemanagement;

/**
 * Director class for constructing Employee objects using a builder.
 */
public class EmployeeDirector {
    private EmployeeBuilder builder;

    /**
     * Constructor to initialize the builder.
     * 
     * @param builder the builder to be used for creating employees.
     */
    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    /**
     * Method to construct a Full-Time Employee.
     * 
     * @param name the name of the employee.
     * @param department the department of the employee.
     * @param role the role of the employee.
     * @param workingHoursPerWeek the working hours per week of the employee.
     * @param salary the salary of the employee.
     * @return the constructed Full-Time Employee.
     */
    public Employee constructFullTimeEmployee(String name, String department, String role, int workingHoursPerWeek, double salary) {
        builder.setName(name);
        builder.setDepartment(department);
        builder.setRole(role);
        builder.setWorkingHoursPerWeek(workingHoursPerWeek);
        builder.setSalary(salary);
        return builder.build();
    }

    /**
     * Method to construct a Part-Time Employee.
     * 
     * @param name the name of the employee.
     * @param department the department of the employee.
     * @param role the role of the employee.
     * @param workingHoursPerWeek the working hours per week of the employee.
     * @param salary the salary of the employee.
     * @return the constructed Part-Time Employee.
     */
    public Employee constructPartTimeEmployee(String name, String department, String role, int workingHoursPerWeek, double salary) {
        builder.setName(name);
        builder.setDepartment(department);
        builder.setRole(role);
        builder.setWorkingHoursPerWeek(workingHoursPerWeek);
        builder.setSalary(salary);
        return builder.build();
    }
}
