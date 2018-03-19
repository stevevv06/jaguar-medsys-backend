package sv.com.jaguarsoft.jaguarmedsys.entities;

import java.time.LocalDateTime;
import java.time.LocalDate;

public interface PatientPRJ{
    Long getId();    
    String getTitle();    
    GenderPrj getGender();
    LocalDate getBirthDate();    
    String getPhone1();
    String getPhone2();
    String getEmail();      
    LocalDateTime getCreated();
    LocalDateTime getModified();

    interface GenderPrj{
        Long getId();
        String getTitle();
    }
}
