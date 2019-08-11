package co.in.imager.service.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "users")
public interface UserRepository extends JpaRepository<UserEntity, String> {

}
