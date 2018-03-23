package sv.com.jaguarsoft.jaguarmedsys.entities;

import lombok.*;
import com.fasterxml.jackson.annotation.*;


import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;


@Entity(name="genders")
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "id")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Gender extends AuditableEntity implements Serializable{
    private static final long serialVersionUID = 2637394804396045310L;
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private @NonNull String title;    

    @JsonManagedReference
    @OneToMany(mappedBy="gender", 
    targetEntity=Patient.class, 
    fetch=FetchType.LAZY)
    private List<Patient> patients;

}