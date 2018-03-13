package sv.com.jaguarsoft.jaguarmedsys.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.jaguarsoft.jaguarmedsys.entities.Patient;
import sv.com.jaguarsoft.jaguarmedsys.jparepositories.PatientRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class PatientController {
    private PatientRepository repository;

    public PatientController(PatientRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/patients-service")
    public Collection<Patient> Patients() {
        return repository.findAll().stream()                
                .collect(Collectors.toList());
    }

   
}