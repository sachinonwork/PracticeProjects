package co.in.imager.service;


import co.in.imager.model.User;
import co.in.imager.service.entities.UserEntity;
import co.in.imager.service.entities.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterService {

    @Autowired
    private UserRepository userEntityRepo;

    public void createUser(User userBody) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userBody.getName());

         userEntityRepo.save(userEntity);
    }
}
