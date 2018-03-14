package sv.com.jaguarsoft.jaguarmedsys.dtos;

import lombok.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AppointmentDTO {
    private Long id;
    private Long patientId;
    private String doctorId;
    private String serviceId;
    private String clinicId;
    private LocalDateTime start;
    private LocalDateTime end;
    private LocalDateTime created;
    private LocalDateTime modified;

    
}