package co.in.imager.service.entities;


import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@Setter
public class UserEntity {

    @Id
    private String userId;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private String address;

    @NonNull
    private AuthDataEntity authData;
}
