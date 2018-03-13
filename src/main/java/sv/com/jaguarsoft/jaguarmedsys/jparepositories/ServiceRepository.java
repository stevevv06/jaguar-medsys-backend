package sv.com.jaguarsoft.jaguarmedsys.jparepositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sv.com.jaguarsoft.jaguarmedsys.entities.Service;

@RepositoryRestResource
public interface ServiceRepository extends JpaRepository<Service, Long> {
}
