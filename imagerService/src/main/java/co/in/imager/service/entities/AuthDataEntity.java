package co.in.imager.service.entities;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Entity
@Component
public class AuthDataEntity {

    @org.springframework.data.annotation.Id
    private String userName;
    private String password;
}
