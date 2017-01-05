import in.co.exp.Transaction;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RecordInsertionTest {

    @Test
    public void shouldInsertDocumentToMongoDB() {

        Transaction transaction = new Transaction();
        transaction.setAmount(100.0);
        transaction.setCurrencyCode("USD");
        transaction.setDescription("Purchased Woolen");

        boolean result = transaction.create();

        assertTrue(result);

    }
}
