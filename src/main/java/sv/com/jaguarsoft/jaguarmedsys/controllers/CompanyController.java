package sv.com.jaguarsoft.jaguarmedsys.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import sv.com.jaguarsoft.jaguarmedsys.entities.Company;
import sv.com.jaguarsoft.jaguarmedsys.jparepositories.CompanyRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class CompanyController {
    private CompanyRepository repository;

    public CompanyController(CompanyRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/companies-service.json")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Company> Companys() {
        return repository.findAll().stream()                
                .collect(Collectors.toList());
    }

   
}