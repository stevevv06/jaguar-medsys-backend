package sv.com.jaguarsoft.jaguarmedsys.jparepositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import sv.com.jaguarsoft.jaguarmedsys.entities.Gender;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface GenderRepository extends JpaRepository<Gender, Long> {

    @RestResource(path = "findByTitle", rel = "findByTitle")
    public Page<Gender> findByTitleContainingIgnoreCase(@Param("title") String title, Pageable p);
}
