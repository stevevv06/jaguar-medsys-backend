package sv.com.jaguarsoft.jaguarmedsys.jparepositories;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import sv.com.jaguarsoft.jaguarmedsys.entities.*;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Appointment.class);
        config.exposeIdsFor(Clinic.class);
        config.exposeIdsFor(Company.class);
        config.exposeIdsFor(Doctor.class);
        config.exposeIdsFor(Gender.class);
        config.exposeIdsFor(Patient.class);
        config.exposeIdsFor(Service.class);
    }
}