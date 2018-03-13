package sv.com.jaguarsoft.jaguarmedsys.entities;

import lombok.*;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;

@Entity(name="companies")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Company {
    @Id @GeneratedValue
    private Long id;    
    private @NonNull String fullName;
    private @NonNull String commercialName;
    private @NonNull String address;
    private @NonNull String phone1;
    private @NonNull String phone2;
    private byte[] logo;    
    private @NonNull LocalDateTime created;
    private LocalDateTime modified;

    @OneToMany(mappedBy="company", 
    targetEntity=Clinic.class, 
    fetch=FetchType.LAZY)
    private List<Clinic> clinics; 
}