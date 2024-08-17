package org.example.demo;

import org.example.demo.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeManager {

    private List<Employee> employeeList = new ArrayList<>();

    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }
    public Employee updateEmployee(String id, Employee newEmployee) {
        Optional<Employee> optionalEmployee = employeeList.stream()
                .filter(employee -> employee.getEmployeeId().equals(id))
                .findFirst();

        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            employee.setFirstName(newEmployee.getFirstName());
            employee.setLastName(newEmployee.getLastName());
            employee.setEmail(newEmployee.getEmail());
            employee.setTitle(newEmployee.getTitle());
            return employee;
        }

        return null;
    }

    public boolean deleteEmployee(String id) {
        return employeeList.removeIf(employee -> employee.getEmployeeId().equals(id));
    }
}
