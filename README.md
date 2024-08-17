#EmpManage

This project is an Employee Management Service built using Spring Boot. It provides basic CRUD (Create, Read, Update, Delete) operations for managing employee data. The project is designed with RESTful APIs and is tested using JUnit and Mockito.

## Features

- **Create Employee:** Add a new employee to the system.
- **Read Employees:** Retrieve a list of all employees.
- **Update Employee:** Update the details of an existing employee.
- **Delete Employee:** Remove an employee from the system.

## Technologies Used

- **Java 17**
- **Spring Boot**
- **JUnit 5**
- **Mockito**
- **Gradle**

## Getting Started

### Prerequisites

- Java 17 or higher
- Gradle
- An IDE like IntelliJ IDEA or Eclipse

### Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/Muhamed-Yasin/employee-management-service.git
    cd employee-management-service
    ```

2. **Build the project:**
    ```bash
    ./gradlew build
    ```

3. **Run the application:**
    ```bash
    ./gradlew bootRun
    ```

4. **Run the tests:**
    ```bash
    ./gradlew test
    ```

## API Endpoints

- **POST /employees:** Add a new employee.
- **GET /employees:** Get a list of all employees.
- **PUT /employees/{id}:** Update an existing employee by ID.
- **DELETE /employees/{id}:** Delete an employee by ID.

## Testing

The project includes unit tests written with JUnit and Mockito to ensure the reliability of the application. These tests cover various scenarios such as adding and retrieving employees.

### Example Test Cases

- **Should Add New Employee:** Verifies that a new employee is successfully added to the system.
- **Should Return All Employees:** Checks if the API returns the correct list of all employees.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request or open an Issue.


### Author

[Muhamed Yasin](https://github.com/Muhamed-Yasin)
