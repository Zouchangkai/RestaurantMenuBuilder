package com.company.employeemanagement;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class to manage all employees in the system.
 */
public class EmployeeManager {
    private static EmployeeManager instance;
    private List<Employee> employees;

    /**
     * Private constructor to prevent instantiation from outside.
     */
    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    /**
     * Method to get the singleton instance of EmployeeManager.
     * 
     * @return the single instance of EmployeeManager.
     */
    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    /**
     * Method to add an employee to the system.
     * 
     * @param employee the employee to be added.
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Method to remove an employee from the system.
     * 
     * @param employee the employee to be removed.
     */
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    /**
     * Method to retrieve all employees in the system.
     * 
     * @return a list of employees.
     */
    public List<Employee> getEmployees() {
        return employees;
    }
}
