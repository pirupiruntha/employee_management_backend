package org.example.controller;

import org.example.model.Employee;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("all/{id}")
    public Optional<Employee> getEmployee(@PathVariable String id){
        return employeeService.getEmployee(id);
    }

    @PutMapping("update/{id}")
    public String updateEmployee(@PathVariable String id, @RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("delete/{id}")
    public String deleteEmployee(@PathVariable String id){
        return employeeService.deleteEmployee(id);
    }

}
