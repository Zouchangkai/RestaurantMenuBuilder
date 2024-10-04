package com.company.employeemanagement;

/**
 * Interface for building Employee objects.
 */
public interface EmployeeBuilder {
    /**
     * Method to set the name of the employee.
     * 
     * @param name the name of the employee.
     */
    void setName(String name);

    /**
     * Method to set the department of the employee.
     * 
     * @param department the department of the employee.
     */
    void setDepartment(String department);

    /**
     * Method to set the role of the employee.
     * 
     * @param role the role of the employee.
     */
    void setRole(String role);

    /**
     * Method to set the working hours per week.
     * 
     * @param hours the working hours per week.
     */
    void setWorkingHoursPerWeek(int hours);

    /**
     * Method to set the salary of the employee.
     * 
     * @param salary the salary of the employee.
     */
    void setSalary(double salary);

    /**
     * Method to build the employee object.
     * 
     * @return the constructed Employee object.
     */
    Employee build();
}
