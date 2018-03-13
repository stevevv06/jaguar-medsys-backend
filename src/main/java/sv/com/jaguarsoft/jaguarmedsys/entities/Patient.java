package sv.com.jaguarsoft.jaguarmedsys.entities;

import lombok.*;
import com.fasterxml.jackson.annotation.*;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;

@Entity(name="patients")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Patient {
    @Id @GeneratedValue
    private Long id;    
    private @NonNull String fullName;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="gender_id", 
        referencedColumnName="id")
    private @NonNull Gender gender;

    private LocalDate birthDate;
    private String address;
    private @NonNull String phone1;
    private String phone2;
    private String email;
    private @NonNull LocalDateTime created;
    private LocalDateTime modified;
 
    @JsonBackReference
    @OneToMany(mappedBy="patient", 
        targetEntity=Appointment.class, 
        fetch=FetchType.LAZY)
    private List<Appointment> appointments;
}