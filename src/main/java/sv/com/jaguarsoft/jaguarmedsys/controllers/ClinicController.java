package sv.com.jaguarsoft.jaguarmedsys.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import sv.com.jaguarsoft.jaguarmedsys.entities.Clinic;
import sv.com.jaguarsoft.jaguarmedsys.jparepositories.ClinicRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class ClinicController {
    private ClinicRepository repository;

    public ClinicController(ClinicRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/clinics-service.json")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Clinic> Clinics() {
        return repository.findAll().stream()                
                .collect(Collectors.toList());
    }

   
}