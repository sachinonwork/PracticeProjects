package co.in.wallet.service.persistence;

import co.in.wallet.service.entities.TransactionEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sdanayak on 1/2/18.
 */
@Repository
public interface TransactionRepository extends MongoRepository<TransactionEntity, String> {
}
