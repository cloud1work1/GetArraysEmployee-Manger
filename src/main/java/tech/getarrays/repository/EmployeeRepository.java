package tech.getarrays.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
