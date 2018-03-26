package sv.com.jaguarsoft.jaguarmedsys.jparepositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import sv.com.jaguarsoft.jaguarmedsys.entities.Patient;
import sv.com.jaguarsoft.jaguarmedsys.entities.PatientPrj;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface PatientRepository extends JpaRepository<Patient, Long> {

    @RestResource(path = "findByTitle")
    public Page<Patient> findByTitleContainingIgnoreCase(@Param("title") String title, Pageable p);
}
