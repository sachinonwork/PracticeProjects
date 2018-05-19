package co.in.wallet.service;

import co.in.wallet.controller.models.Transaction;
import co.in.wallet.service.entities.TransactionEntity;
import co.in.wallet.service.persistence.TransactionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class TransactionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TransactionService.class);
    @Autowired
    TransactionRepository transactionRepository;

    private Long timeStamp = Calendar.getInstance().getTimeInMillis();

    public Transaction postExpense(Transaction transactionRequest) {
        TransactionEntity transaction = new TransactionEntity();
        transaction.setDescription(transactionRequest.getDescription());
        transaction.setAmount(transactionRequest.getAmount());
        transaction.setCurrency(transactionRequest.getCurrency());
        transaction.setLocation(transactionRequest.getLocation());
        transaction.setCreated(Calendar.getInstance().getTime());
        transaction.setModified(Calendar.getInstance().getTime());
        transaction.setLocation(transactionRequest.getLocation());
        transaction.setVersion(timeStamp);
        transaction = transactionRepository.save(transaction);
        LOGGER.info("Transaction created with id:{} and version:{}", transaction.getId(), transaction.getVersion());
        return transactionRequest;
    }

    public Set<Transaction> getAllExpenses() {
        Iterable<TransactionEntity> transactions = transactionRepository.findAll();
        Set<Transaction> transactionResponseSet = new HashSet<>();
        transactions.forEach(transactionEntity -> {
            Transaction transaction = new Transaction();
            transaction.setDescription(transactionEntity.getDescription());
            transaction.setAmount(transactionEntity.getAmount());
            transaction.setCurrency(transactionEntity.getCurrency());
            transaction.setLocation(transactionEntity.getLocation());
            transaction.setVersion(transactionEntity.getVersion());
            transactionResponseSet.add(transaction);
        });
        return transactionResponseSet;
    }

    public Transaction getExpense(String transactionId) {
        Optional<TransactionEntity> transactionEntity = transactionRepository.findById(transactionId);
        Transaction transaction = new Transaction();
        if(transactionEntity != null && transactionEntity.isPresent()) {
            transaction.setVersion(transactionEntity.get().getVersion());
            transaction.setLocation(transactionEntity.get().getLocation());
            transaction.setCurrency(transactionEntity.get().getCurrency());
            transaction.setDescription(transactionEntity.get().getDescription());
        }
        return transaction;
    }
}
