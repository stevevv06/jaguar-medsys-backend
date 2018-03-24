package sv.com.jaguarsoft.jaguarmedsys.entities;

import lombok.*;
import com.fasterxml.jackson.annotation.*;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;

@Entity(name="appointments")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Appointment extends AuditableEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="patient_id", 
        referencedColumnName="id")
    @JsonManagedReference
    private @NonNull Patient patient;
    
    @ManyToOne    
    @JoinColumn(name="doctor_id", 
        referencedColumnName="id")    
    @JsonManagedReference
    private Doctor doctor;

    @ManyToOne    
    @JoinColumn(name="service_id", 
        referencedColumnName="id")
    @JsonManagedReference
    private Service service;
    
    @ManyToOne
    @JoinColumn(name="clinic_id", 
        referencedColumnName="id")
    @JsonManagedReference        
    private Clinic clinic;

    private LocalDateTime start;
    private LocalDateTime end;

        
}