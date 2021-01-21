package co.in.practice.simple.service.repositories;

import co.in.practice.simple.models.SalesContact;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface SalesContactRepository extends MongoRepository<SalesContact, String> {

}
