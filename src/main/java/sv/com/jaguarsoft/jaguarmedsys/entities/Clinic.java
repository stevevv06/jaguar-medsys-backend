package sv.com.jaguarsoft.jaguarmedsys.entities;

import lombok.*;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;

@Entity(name="clinics")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Clinic {
    @Id @GeneratedValue
    private Long id;    
    private @NonNull String clinic;
    private @NonNull String address;
    private @NonNull String phone1;
    private String phone2;
    @ManyToOne
    @JoinColumn(name="company_id", 
        referencedColumnName="id")
    private @NonNull Company company;
    private @NonNull LocalDateTime created;
    private LocalDateTime modified;

    @OneToMany(mappedBy="clinic", 
        targetEntity=Appointment.class, 
        fetch=FetchType.LAZY)
    private List<Appointment> appointments;

  
}