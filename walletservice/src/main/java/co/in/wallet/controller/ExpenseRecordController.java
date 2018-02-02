package co.in.wallet.controller;


import co.in.wallet.controller.models.ExpenseDetail;
import co.in.wallet.controller.models.TransactionResponse;
import co.in.wallet.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdanayak on 1/2/18.
 */

@RestController
public class ExpenseRecordController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExpenseRecordController.class);
    TransactionService transactionService;

    @RequestMapping(value="expense", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE,
    consumes=MediaType.APPLICATION_JSON_VALUE)
    public TransactionResponse recordExpenseMade(ExpenseDetail expenseDetail) {

        LOGGER.info("Received expense record of amount:{}", expenseDetail.getAmount());
        TransactionResponse response = transactionService.postExpense(expenseDetail);
        return response;
    }

}
