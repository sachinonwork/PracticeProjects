package co.in.wallet.service;

import co.in.wallet.controller.models.ExpenseDetail;
import co.in.wallet.controller.models.TransactionResponse;
import co.in.wallet.service.entities.TransactionEntity;
import co.in.wallet.service.persistence.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;


    public TransactionResponse postExpense(ExpenseDetail expenseDetail) {
        TransactionEntity transaction = new TransactionEntity();
        transaction.setDescription(expenseDetail.getDescription());
        transaction.setAmount(expenseDetail.getAmount());
        transaction.setType(expenseDetail.getType());
        transaction = transactionRepository.save(transaction);
        TransactionResponse transactionResponse = new TransactionResponse();
        return transactionResponse;
    }

    public Set<ExpenseDetail> getAllExpenses() {
        Iterable<TransactionEntity> transaction = transactionRepository.findAll();
        Set<ExpenseDetail> transactionResponseSet = new HashSet<>();
        transaction.forEach(transactionEntity -> {
            ExpenseDetail expenseDetail = new ExpenseDetail();
            expenseDetail.setDescription(transactionEntity.getDescription());
            expenseDetail.setAmount(transactionEntity.getAmount());
            expenseDetail.setType(transactionEntity.getType());
            transactionResponseSet.add(expenseDetail);
        });
        return transactionResponseSet;
    }
}
