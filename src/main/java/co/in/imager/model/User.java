package co.in.imager.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Component
@Builder
@Getter
@Setter
@AllArgsConstructor
public class User {

    private String name;
    private String address;
    private String city;
    private AuthInfo authData;

}

