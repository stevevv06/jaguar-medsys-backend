package sv.com.jaguarsoft.jaguarmedsys.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.jaguarsoft.jaguarmedsys.entities.Service;
import sv.com.jaguarsoft.jaguarmedsys.jparepositories.ServiceRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class ServiceController {
    private ServiceRepository repository;

    public ServiceController(ServiceRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/services-service")
    public Collection<Service> Services() {
        return repository.findAll().stream()                
                .collect(Collectors.toList());
    }

   
}