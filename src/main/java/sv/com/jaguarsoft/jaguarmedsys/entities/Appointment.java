package sv.com.jaguarsoft.jaguarmedsys.entities;

import lombok.*;
import com.fasterxml.jackson.annotation.*;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;
import javax.persistence.Entity;

@Entity(name="appointments")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="patient_id", 
        referencedColumnName="id")
    private @NonNull Patient patient;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="doctor_id", 
        referencedColumnName="id")    
    private Doctor doctor;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="service_id", 
        referencedColumnName="id")
    private Service service;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="clinic_id", 
        referencedColumnName="id")
    private Clinic clinic;

    private LocalDateTime start;
    private LocalDateTime end;    
    private @NonNull LocalDateTime created;
    private LocalDateTime modified;

  
}