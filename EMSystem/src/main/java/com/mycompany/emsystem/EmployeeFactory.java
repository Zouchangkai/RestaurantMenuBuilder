package com.company.employeemanagement;

/**
 * Factory class for creating Employee instances.
 */
public class EmployeeFactory {
    /**
     * Method to create an Employee based on the employee type.
     * 
     * @param type the type of employee (fulltime or parttime).
     * @return the created Employee instance.
     * @throws IllegalArgumentException if the type is unknown.
     */
    public static Employee createEmployee(String type) {
        switch (type.toLowerCase()) {
            case "fulltime":
                return new FullTimeEmployee("FT-1", "Default", "Engineering", "Developer", 40, 60000);
            case "parttime":
                return new PartTimeEmployee("PT-1", "Default", "Engineering", "Intern", 20, 30000);
            default:
                throw new IllegalArgumentException("Unknown employee type: " + type);
        }
    }
}
