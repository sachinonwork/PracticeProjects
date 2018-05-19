package co.in.wallet.controller;


import co.in.wallet.controller.models.Transaction;
import co.in.wallet.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Transaction> recordExpenseMade(@RequestBody Transaction transaction) {

        LOGGER.info("Received expense record of amount:{}", transaction.getAmount());
        Transaction response = transactionService.postExpense(transaction);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @RequestMapping(value = "expense", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Set> getAllExpenses() {
        return ResponseEntity.ok(transactionService.getAllExpenses());
    }


    @RequestMapping(value = "expense/{transactionId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Transaction> getAllExpenses(@RequestParam String transactionId) {
        return ResponseEntity.ok(transactionService.getExpense(transactionId));
    }

}
