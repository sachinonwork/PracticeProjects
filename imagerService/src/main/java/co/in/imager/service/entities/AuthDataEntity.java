package co.in.imager.service.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@Setter
@Component
public class AuthDataEntity {

    @Id
    private String id;

    private String userName;

    private String password;
}
