package com.company.employeemanagement.tests;

import com.company.employeemanagement.EmployeeDirector;
import com.company.employeemanagement.FullTimeEmployeeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for EmployeeDirector.
 */
public class EmployeeDirectorTest {
    /**
     * Test the construction of a Full-Time Employee.
     */
    @Test
    public void testConstructFullTimeEmployee() {
        FullTimeEmployeeBuilder builder = new FullTimeEmployeeBuilder();
        EmployeeDirector director = new EmployeeDirector(builder);
        var employee = director.constructFullTimeEmployee("ChangkaiZou", "IT", "Manager", 35, 80000);
        assertEquals("ChangkaiZou", employee.getName());
        assertEquals("IT", employee.getDepartment());
        assertEquals("Manager", employee.getRole());
        assertEquals(35,employee.getWorkingHoursPerWeek());
        assertEquals(80000,employee.getSalary());
    }
}
