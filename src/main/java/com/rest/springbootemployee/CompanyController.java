package com.rest.springbootemployee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("companies")
public class CompanyController {
    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping
    public List<Company> getCompanies(){
        return companyRepository.getAllCompanies();
    }

    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable int id){
        return companyRepository.getCompanyByID(id);
    }

    @GetMapping("/{id}/employees")
    public List<Employee> getCompanyEmployeesByCompanyId(@PathVariable int id){
        return companyRepository.getCompanyEmployeesByID(id);
    }
}
