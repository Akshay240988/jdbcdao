package com.spjdbc.jdbcdao.repository;

import com.spjdbc.jdbcdao.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeRepository {

    List<Employee> getEmployeeList();

    String insertData(Employee employee);

    Employee getEmployee(Integer id);

    String updateEmployee(Employee employee);

    String deleteEmployee(Integer id);

    List <Map<String,Object>> getCombineData();
}
