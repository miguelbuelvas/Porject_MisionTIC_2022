package com.example.demo.controllers;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/user")
    public ResponseEntity<List<Employee>> buscarempleado (){ //buscar todo
        return ResponseEntity.ok(employeeService.BuscarEmplado());
    }

    @GetMapping("/user/{id}") //buscar por id
    public Optional<Employee> getEmployeeById (@PathVariable("id") Long id){
        return this.employeeService.findById(id);
    }

    @PostMapping("/user")  //guardar
    public  ResponseEntity<Employee> saveEmployee (@RequestBody Employee employee){
        try {
            Employee employeeSave = employeeService.save(employee);
            return ResponseEntity.created(new URI("/api/user"+ employeeSave.getId())).body(employeeSave);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PatchMapping("/user") //actualizar
    public  ResponseEntity<Employee> updateEmployee (@RequestBody Employee employee){
        try {
            Employee employeeSave = employeeService.save(employee);
            return ResponseEntity.created(new URI("/api/user"+ employeeSave.getId())).body(employeeSave);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping(value = "/user/{id}") //eliminar por id perfil
    public  String deleteEmployee (@PathVariable("id") Long id){
        boolean answer=employeeService.deleteById(id);
        if (answer){
            return "Se pudo eliminar correctamente el empleado con la id: "+id;
        }else{
            return "No se puedo eliminar correctamente el empleado con la id: "+id;
        }
    }
}
