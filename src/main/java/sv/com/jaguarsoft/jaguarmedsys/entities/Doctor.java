package sv.com.jaguarsoft.jaguarmedsys.entities;

import lombok.*;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;

@Entity(name="doctors")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Doctor {
    @Id @GeneratedValue
    private Long id;    
    private @NonNull String fullName;
    private @NonNull String specialities;
    private @NonNull String color;
    private @NonNull LocalDateTime created;
    private LocalDateTime modified;

    @OneToMany(mappedBy="doctor", 
    targetEntity=Appointment.class, 
    fetch=FetchType.LAZY)
    private List<Appointment> appointments;     
  
}