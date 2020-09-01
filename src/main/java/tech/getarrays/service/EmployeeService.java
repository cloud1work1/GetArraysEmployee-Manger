package tech.getarrays.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.getarrays.exception.UserNotFoundException;
import tech.getarrays.model.Employee;
import tech.getarrays.repository.EmployeeRepository;

@Service	
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee addEmployee(Employee employee) {
		employee.setEmpCode(UUID.randomUUID().toString());
		return employeeRepository.save(employee);
	}
	
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
	}
	
	public Employee findEmployeeById(Long id) throws UserNotFoundException {
		return employeeRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not present with id: "+ id + " "));
	}
}
