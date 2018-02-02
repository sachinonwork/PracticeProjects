package co.in.wallet.service.persistence;

import co.in.wallet.service.entities.TransactionEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sdanayak on 1/2/18.
 */
public interface TransactionRepository extends CrudRepository<TransactionEntity, String> {
}
