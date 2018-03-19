package sv.com.jaguarsoft.jaguarmedsys.entities;

import lombok.*;
import com.fasterxml.jackson.annotation.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;


@Entity(name="genders")
@EntityListeners(AuditingEntityListener.class)
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Gender extends AuditableEntity{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private @NonNull String title;    

    @JsonBackReference
    @OneToMany(mappedBy="gender", 
    targetEntity=Patient.class, 
    fetch=FetchType.LAZY)
    private List<Patient> patients;

}