package com.spjdbc.jdbcdao.controller;

import com.spjdbc.jdbcdao.dao.EmployeeDao;
import com.spjdbc.jdbcdao.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/getemployees")
    public List<Employee> getEmp(){
        return employeeDao.getEmployeeList();
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        return employeeDao.insertData(employee);
    }

    @GetMapping("/getemp/{id}")
    public Employee getEmp(@PathVariable Integer id){
        return employeeDao.getEmployee(id);
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){
        return employeeDao.updateEmployee(employee);
    }

    @PostMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        return employeeDao.deleteEmployee(id);
    }

    @GetMapping("/joinData")
    public List<Map<String,Object>> getJoinData(){
        return employeeDao.getCombineData();
    }
}
