package com.rest.springbootemployee;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CompanyRepository {

    private List<Company> companyRepository;

    public CompanyRepository(){

        List<Employee> employeeList1 = new ArrayList<Employee>() {
            {
                add(new Employee(1, "Kendrick", 22, "male", 20000));
                add(new Employee(2, "Kenssdrick", 12, "male", 30000));
                add(new Employee(3, "Kenddxrick", 22, "female", 20000));
            }
        };
        List<Employee> employeeList2 = new ArrayList<Employee>() {
            {
                add(new Employee(1, "Laughing", 22, "male", 20000));
                add(new Employee(2, "Kendraxxxxick", 12, "male", 30000));
                add(new Employee(3, "Laughinggggg", 22, "female", 20000));
            }
        };

        companyRepository = new ArrayList<Company>(){
            {
                add(new Company(1,"cool",employeeList1));
                add(new Company(2,"hot",employeeList2));
            }
        };
    }

    public List<Company> getAllCompanies() {
        return companyRepository;
    }

    public Company getCompanyByID(int id) {
        return companyRepository.stream().filter(company -> company.getId()==id).findFirst().get();
    }

    public List<Employee> getCompanyEmployeesByID(int id) {
        return getCompanyByID(id).getEmployees();
    }
}
