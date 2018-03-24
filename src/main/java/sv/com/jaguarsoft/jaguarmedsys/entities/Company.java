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

@Entity(name="companies")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "id")
public class Company extends AuditableEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    private @NonNull String title;
    private @NonNull String commercialName;
    private @NonNull String address;
    private @NonNull String phone1;
    private @NonNull String phone2;
    private byte[] logo;    

    @OneToMany(mappedBy="company", 
    targetEntity=Clinic.class, 
    fetch=FetchType.LAZY)
    @JsonBackReference
    private List<Clinic> clinics; 

}