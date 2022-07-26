package com.rest.springbootemployee;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository {

    List<Employee> employeeRepository;

    public EmployeeRepository() {
        employeeRepository=new ArrayList<Employee>(){
           {
               add(new Employee(1,"Kendrick", 22, "male", 20000));
               add(new Employee(2,"Kendrick", 22, "male", 20000));
               add(new Employee(3,"Kendrick", 22, "female", 20000));
               add(new Employee(4,"Kendrick", 22, "male", 50000));
               add(new Employee(5,"Kendrick", 22, "female", 30000));
               add(new Employee(6,"Kendrick", 22, "male", 20000));
            }
        };
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository;
    }

    public Employee findById(int id) {
        return employeeRepository.stream().filter(employee -> employee.getId()==id).findFirst().get();
    }

    public List<Employee> getEmployeesByGender(String gender){
        return employeeRepository.stream().filter(employee -> employee.getGender().equals(gender)).collect(Collectors.toList());
    }

    public void addAEmployee(Employee employee) {
        employeeRepository.add(employee);
    }
}
