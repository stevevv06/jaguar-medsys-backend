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

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="patient_id", 
        referencedColumnName="id")
    private @NonNull Patient patient;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="doctor_id", 
        referencedColumnName="id")    
    private Doctor doctor;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="service_id", 
        referencedColumnName="id")
    private Service service;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="clinic_id", 
        referencedColumnName="id")
    private Clinic clinic;

    private LocalDateTime start;
    private LocalDateTime end;

    public Long getId(){
        return this.id;
    }

    public Patient getPatient(){
        return this.patient;
    }

    public Doctor getDoctor(){
        return this.doctor;
    }

    public Service getService(){
        return this.service;
    }
    public Clinic getClinic(){
        return this.clinic;
    }
    
}