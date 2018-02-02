package co.in.wallet.controller;


import co.in.wallet.controller.models.ExpenseDetail;
import co.in.wallet.controller.models.TransactionResponse;
import co.in.wallet.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sdanayak on 1/2/18.
 */

public class ExpenseRecordController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExpenseRecordController.class);
    TransactionService transactionService;

    public TransactionResponse recordExpenseMade(ExpenseDetail expenseDetail) {

        LOGGER.info("Received expense record of amount:{}", expenseDetail.getAmount());
        TransactionResponse response = transactionService.postExpense(expenseDetail);
        return response;
    }

}
