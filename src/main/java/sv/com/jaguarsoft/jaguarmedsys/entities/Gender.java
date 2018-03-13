package sv.com.jaguarsoft.jaguarmedsys.entities;

import lombok.*;
import com.fasterxml.jackson.annotation.*;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;

@Entity(name="genders")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Gender {
    @Id @GeneratedValue
    private Long id;    
    private @NonNull String gender;    
    private @NonNull LocalDateTime created;
    private LocalDateTime modified;

    @JsonBackReference
    @OneToMany(mappedBy="gender", 
    targetEntity=Patient.class, 
    fetch=FetchType.LAZY)
    private List<Patient> patients;
}