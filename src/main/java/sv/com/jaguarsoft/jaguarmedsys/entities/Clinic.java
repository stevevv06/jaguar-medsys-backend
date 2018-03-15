package sv.com.jaguarsoft.jaguarmedsys.entities;

import lombok.*;
import com.fasterxml.jackson.annotation.*;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;

@Entity(name="clinics")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "id")
public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private @NonNull String clinic;
    private @NonNull String address;
    private @NonNull String phone1;
    private String phone2;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="company_id", 
        referencedColumnName="id")
    private @NonNull Company company;

    private @NonNull LocalDateTime created;
    private LocalDateTime modified;

    @JsonBackReference
    @OneToMany(mappedBy="clinic", 
        targetEntity=Appointment.class, 
        fetch=FetchType.LAZY)
    private List<Appointment> appointments;

  
}