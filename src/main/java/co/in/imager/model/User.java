package co.in.imager.model;


import lombok.*;
import org.springframework.stereotype.Component;


@Component
@Builder
@Getter
@Setter
@AllArgsConstructor
public class User {

    private String userId;
    @NonNull
    private String name;
    private String address;
    private String city;
    @NonNull
    private AuthInfo authData;

}

