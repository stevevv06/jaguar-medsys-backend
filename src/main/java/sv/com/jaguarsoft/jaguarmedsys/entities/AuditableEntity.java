package sv.com.jaguarsoft.jaguarmedsys.entities;
import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public abstract class AuditableEntity {

    @CreatedBy
    protected String createdBy;

    @CreatedDate    
    protected LocalDateTime created;

    @LastModifiedBy
    protected String modifiedBy;

    @LastModifiedDate()
    protected LocalDateTime modified;

    // Getters and Setters

}