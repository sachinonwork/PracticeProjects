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

    @Autowired
    private UserEntity userEntity;

    public void createUser(User userBody) {
        userEntity.setUserName(userBody.getUserId());
        //@TODO: encrypt before save
        userEntity.setPassword(userBody.getPassword());
        userEntityRepo.save(userEntity);
    }
}
