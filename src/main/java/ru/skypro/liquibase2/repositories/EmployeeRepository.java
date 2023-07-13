package ru.skypro.liquibase2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.liquibase2.department.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
