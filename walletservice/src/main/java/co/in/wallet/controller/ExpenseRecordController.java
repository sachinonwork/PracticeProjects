package co.in.wallet.controller;


import co.in.wallet.controller.models.ExpenseDetail;
import co.in.wallet.controller.models.TransactionResponse;
import co.in.wallet.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * Created by sdanayak on 1/2/18.
 */

@RestController
public class ExpenseRecordController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExpenseRecordController.class);
    @Autowired
    TransactionService transactionService;

    @RequestMapping(value = "expense", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public TransactionResponse recordExpenseMade(ExpenseDetail expenseDetail) {

        LOGGER.info("Received expense record of amount:{}", expenseDetail.getAmount());
        TransactionResponse response = transactionService.postExpense(expenseDetail);
        return response;
    }

    @RequestMapping(value = "expense", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Set<ExpenseDetail> getAllExpenses() {

        return transactionService.getAllExpenses();
    }

}
