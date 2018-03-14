package sv.com.jaguarsoft.jaguarmedsys.dtos;

import lombok.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class AppointmentScheduleDTO {
    private Long id;
    private String title;
    private LocalDateTime start;
    private LocalDateTime end;
    private String color;
    private AppointmentDTO appointment;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the start
     */
    public LocalDateTime getStart() {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    /**
     * @return the end
     */
    public LocalDateTime getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the appointment
     */
    public AppointmentDTO getAppointment() {
        return appointment;
    }

    /**
     * @param appointment the appointment to set
     */
    public void setAppointment(AppointmentDTO appointment) {
        this.appointment = appointment;
    }

}