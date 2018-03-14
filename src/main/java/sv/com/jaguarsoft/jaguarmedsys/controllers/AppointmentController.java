package sv.com.jaguarsoft.jaguarmedsys.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import sv.com.jaguarsoft.jaguarmedsys.dtos.AppointmentDTO;
import sv.com.jaguarsoft.jaguarmedsys.dtos.AppointmentScheduleDTO;
import sv.com.jaguarsoft.jaguarmedsys.entities.Appointment;
import sv.com.jaguarsoft.jaguarmedsys.jparepositories.AppointmentRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class AppointmentController {
    private AppointmentRepository repository;
    
    @Autowired
    private ModelMapper modelMapper;

    public AppointmentController(AppointmentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/appointments-service.json")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Appointment> Appointments() {
        return repository.findAll().stream()                
            .collect(Collectors.toList());
    }

    @GetMapping("/api/appointments-schedule-service.json")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<AppointmentScheduleDTO> AppointmentsSchedule() {
        return repository.findAll().stream()                
            .map((Appointment app) -> 
            {
                AppointmentScheduleDTO dto = new AppointmentScheduleDTO();
                dto.setId(app.getId());
                dto.setTitle(app.getPatient().getFullName());
                dto.setStart(app.getStart());
                dto.setEnd(app.getEnd());
                dto.setColor(app.getDoctor().getColor());
                AppointmentDTO adto;
                adto = modelMapper.map(app, AppointmentDTO.class);
                dto.setAppointment(adto);
                /* = new AppointmentDTO();
                adto.setId(app.getId());
                adto.setPatientId(app.getPatient().getId());
                adto.setDoctorId(app.getDoctor().getId());
                adto.setServiceId(app.getService().getId());
                adto.setClinicId(app.getClinic().getId());
                adto.setStart(app.getStart());
                adto.setEnd(app.getEnd());
                adto.setCreated(app.getCreated);
                */
                return dto;
            })
            .collect(Collectors.toList());
    }
   
}