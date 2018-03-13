package sv.com.jaguarsoft.jaguarmedsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JaguarMedsysBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaguarMedsysBackendApplication.class, args);
	}

    /*
	@Bean
    ApplicationRunner init(DoctorRepository repository) {
        return args -> {
            //Stream.of("Dr 1", "Dr 2").forEach(name -> {
                Doctor d1 = new Doctor("Dr 1", "Ortodoncia", "blue");
                repository.save(d1);                
                Doctor d2 = new Doctor("Dr 2", "Maxi", "red");            
                repository.save(d2);           
            //});
            repository.findAll().forEach(System.out::println);
        };
    }
    */
}

