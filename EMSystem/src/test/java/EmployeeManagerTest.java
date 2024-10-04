package com.company.employeemanagement.tests;

import com.company.employeemanagement.EmployeeManager;
import com.company.employeemanagement.FullTimeEmployee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for EmployeeManager.
 */
public class EmployeeManagerTest {
    /**
     * Test the addition of an employee.
     */
    @Test
    public void testAddEmployee() {
        EmployeeManager manager = EmployeeManager.getInstance();
        FullTimeEmployee employee = new FullTimeEmployee("1", "John Doe", "IT", "Developer", 40, 70000);
        manager.addEmployee(employee);
        assertTrue(manager.getEmployees().contains(employee));
    }

    /**
     * Test the removal of an employee.
     */
    @Test
    public void testRemoveEmployee() {
        EmployeeManager manager = EmployeeManager.getInstance();
        FullTimeEmployee employee = new FullTimeEmployee("1", "Jane Doe", "IT", "Developer", 40, 70000);
        manager.addEmployee(employee);
        manager.removeEmployee(employee);
        assertFalse(manager.getEmployees().contains(employee));
    }
}
