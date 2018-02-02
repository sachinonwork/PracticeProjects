package co.in.wallet.service;

import co.in.wallet.controller.models.ExpenseDetail;
import co.in.wallet.controller.models.TransactionResponse;
import co.in.wallet.service.entities.TransactionEntity;
import co.in.wallet.service.persistence.TransactionRepository;
import org.springframework.stereotype.Component;
import sun.security.krb5.internal.ccache.MemoryCredentialsCache;

@Component
public class TransactionService {

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
}
