package sv.com.jaguarsoft.jaguarmedsys.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import sv.com.jaguarsoft.jaguarmedsys.entities.Doctor;
import sv.com.jaguarsoft.jaguarmedsys.jparepositories.DoctorRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class DoctorController {
    private DoctorRepository repository;

    public DoctorController(DoctorRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/doctors-service.json")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Doctor> doctors() {
        return repository.findAll().stream()                
                .collect(Collectors.toList());
    }

   
}