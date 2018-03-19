package sv.com.jaguarsoft.jaguarmedsys.entities;

import lombok.*;
import com.fasterxml.jackson.annotation.*;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;

@Entity(name="services")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Service extends AuditableEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private @NonNull String title;

    @JsonBackReference
    @OneToMany(mappedBy="service", 
    targetEntity=Appointment.class, 
    fetch=FetchType.LAZY)
    private List<Appointment> appointments;

}