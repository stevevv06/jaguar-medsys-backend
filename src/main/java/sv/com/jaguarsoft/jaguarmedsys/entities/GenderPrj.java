package sv.com.jaguarsoft.jaguarmedsys.entities;

import org.springframework.data.rest.core.config.Projection;
import sv.com.jaguarsoft.jaguarmedsys.entities.Gender;

@Projection(name = "GenderPrj", types = Gender.class)
    interface GenderPrj{
        Long getId();
        String getTitle();
    }