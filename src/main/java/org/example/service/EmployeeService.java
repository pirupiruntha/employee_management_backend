package org.example.service;

import org.example.model.Employee;
import org.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins="*", allowedHeaders = "*")
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public String addEmployee(Employee employee){
        employeeRepository.save(employee);
        return "Employee added";
    }

    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployee(String id) {
        return employeeRepository.findById(id);
    }

    public String updateEmployee(Employee employee){
        employeeRepository.save(employee);
        return "Employee details updated";
    }
    public String deleteEmployee(String id){
        employeeRepository.deleteById(id);
        return "Employee deleted";
    }
}
