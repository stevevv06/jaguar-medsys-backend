package sv.com.jaguarsoft.jaguarmedsys.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import sv.com.jaguarsoft.jaguarmedsys.entities.Gender;
import sv.com.jaguarsoft.jaguarmedsys.jparepositories.GenderRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class GenderController {
    private GenderRepository repository;

    public GenderController(GenderRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/genders-service.json")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Gender> Genders() {
        return repository.findAll().stream()                
                .collect(Collectors.toList());
    }

   
}