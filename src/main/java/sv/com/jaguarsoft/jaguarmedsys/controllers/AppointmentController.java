package sv.com.jaguarsoft.jaguarmedsys.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import sv.com.jaguarsoft.jaguarmedsys.entities.Appointment;
import sv.com.jaguarsoft.jaguarmedsys.jparepositories.AppointmentRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class AppointmentController {
    private AppointmentRepository repository;

    public AppointmentController(AppointmentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/appointments-service.json")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Appointment> Appointments() {
        return repository.findAll().stream()                
                .collect(Collectors.toList());
    }

   
}