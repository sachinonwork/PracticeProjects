package co.in.imager.service.entities;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class UserEntity {

    @Id
    private String userId;

    @NonNull
    private String name;

    @NonNull
    private String address;

    @NonNull
    private AuthDataEntity authData;
}
