package co.in.imager.model;


import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Builder
@Setter
@AllArgsConstructor
@Component
public class AuthInfo {


    @NonNull
    private String userName;
    @NonNull
    private String password;
}
