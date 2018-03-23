package sv.com.jaguarsoft.jaguarmedsys.entities;

import lombok.*;
import com.fasterxml.jackson.annotation.*;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;

@Entity(name="doctors")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Doctor extends AuditableEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private @NonNull String title;
    private @NonNull String specialities;
    private @NonNull String color;

    @JsonBackReference
    @OneToMany(mappedBy="doctor", 
    targetEntity=Appointment.class, 
    fetch=FetchType.LAZY)
    private List<Appointment> appointments;     
  
}