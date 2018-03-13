package sv.com.jaguarsoft.jaguarmedsys.jparepositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import sv.com.jaguarsoft.jaguarmedsys.entities.Clinic;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface ClinicRepository extends JpaRepository<Clinic, Long> {
}
