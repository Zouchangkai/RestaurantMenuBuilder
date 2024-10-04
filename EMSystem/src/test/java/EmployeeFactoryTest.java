package com.company.employeemanagement.tests;

import com.company.employeemanagement.EmployeeFactory;
import com.company.employeemanagement.Employee;
import com.company.employeemanagement.FullTimeEmployee;
import com.company.employeemanagement.PartTimeEmployee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for EmployeeFactory.
 */
public class EmployeeFactoryTest {
    /**
     * Test the creation of a Full-Time Employee.
     */
    @Test
    public void testCreateFullTimeEmployee() {
        Employee employee = EmployeeFactory.createEmployee("fulltime");
        assertNotNull(employee);
        assertTrue(employee instanceof FullTimeEmployee);
    }

    /**
     * Test the creation of a Part-Time Employee.
     */
    @Test
    public void testCreatePartTimeEmployee() {
        Employee employee = EmployeeFactory.createEmployee("parttime");
        assertNotNull(employee);
        assertTrue(employee instanceof PartTimeEmployee);
    }

    /**
     * Test the creation of an unknown type of Employee.
     */
    @Test
    public void testCreateUnknownEmployee() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            EmployeeFactory.createEmployee("unknown");
        });
        assertEquals("Unknown employee type: unknown", exception.getMessage());
    }
}
