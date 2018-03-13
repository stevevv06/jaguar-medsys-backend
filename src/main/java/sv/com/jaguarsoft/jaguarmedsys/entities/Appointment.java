package sv.com.jaguarsoft.jaguarmedsys.entities;

import lombok.*;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;
import javax.persistence.Entity;

@Entity(name="appointments")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Appointment {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="patient_id", 
        referencedColumnName="id")
    private @NonNull Patient patient;

    @ManyToOne
    @JoinColumn(name="doctor_id", 
        referencedColumnName="id")    
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name="service_id", 
        referencedColumnName="id")
    private Service service;

    @ManyToOne
    @JoinColumn(name="clinic_id", 
        referencedColumnName="id")
    private Clinic clinic;

    private LocalDateTime start;
    private LocalDateTime end;    
    private @NonNull LocalDateTime created;
    private LocalDateTime modified;

  
}