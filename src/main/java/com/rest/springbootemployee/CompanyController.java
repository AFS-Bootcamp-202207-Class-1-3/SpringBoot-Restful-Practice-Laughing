package com.rest.springbootemployee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(params = {"page","pageSize"})
    public List<Company> getCompaniesByPage(int page, int pageSize){
        return companyRepository.getCompaniesByPage(page, pageSize);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Company addCompany(@RequestBody Company company){
        return companyRepository.addCompany(company);
    }

    @PutMapping("/{id}")
    public Company updateCompany(@PathVariable int id, @RequestBody Company company){
        return companyRepository.updateCompany(id,company);
    }
}
