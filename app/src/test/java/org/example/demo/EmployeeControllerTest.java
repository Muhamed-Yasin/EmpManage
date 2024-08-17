package org.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

public class EmployeeControllerTest {

    @Mock
    private EmployeeManager employeeManager;

    @InjectMocks
    private EmployeeController employeeController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldReturnAllEmployees() {
        // Arrange
        Employee employee1 = new Employee("12345", "John", "Doe", "john.doe@example.com", "Developer");
        Employee employee2 = new Employee("67890", "Jane", "Smith", "jane.smith@example.com", "Manager");
        List<Employee> employeeList = Arrays.asList(employee1, employee2);
        when(employeeManager.getAllEmployees()).thenReturn(employeeList);

        // Act
        ResponseEntity<List<Employee>> response = employeeController.getAllEmployees();

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(2, response.getBody().size());
        assertEquals("John", response.getBody().get(0).getFirstName());
    }

    @Test
    public void shouldAddNewEmployee() {
        // Arrange
        Employee employee = new Employee("12345", "John", "Doe", "john.doe@example.com", "Developer");
        when(employeeManager.addEmployee(any(Employee.class))).thenReturn(employee);

        // Act
        ResponseEntity<Employee> response = employeeController.addEmployee(employee);

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("John", response.getBody().getFirstName());
    }
}
