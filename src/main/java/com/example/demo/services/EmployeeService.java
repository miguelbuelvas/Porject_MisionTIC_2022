package com.example.demo.services;

import com.example.demo.entities.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> BuscarEmplado() {
        return employeeRepository.findAll();
    }

    public <S extends Employee> S save(S entity) {
        return employeeRepository.save(entity);
    }

    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public boolean deleteById(Long id) {
        employeeRepository.deleteById(id);
        if (this.employeeRepository.findById(id).isPresent()) {
            return false;
        }
        return true;
    }
}
