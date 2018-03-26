package sv.com.jaguarsoft.jaguarmedsys.entities;

import java.time.LocalDateTime;

import org.springframework.data.rest.core.config.Projection;
import sv.com.jaguarsoft.jaguarmedsys.entities.Patient;

import java.time.LocalDate;

@Projection(name = "PatientPrj", types = Patient.class)
public interface PatientPrj{
    Long getId();    
    String getTitle();    
    GenderPrj getGender();
    LocalDate getBirthDate();    
    String getPhone1();
    String getPhone2();
    String getEmail();      
    LocalDateTime getCreated();
    LocalDateTime getModified();

    
}
