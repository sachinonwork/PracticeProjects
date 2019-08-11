package co.in.imager.service.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AuthDataEntity {

    @Id
    private String id;

    private String userName;

    private String password;
}
