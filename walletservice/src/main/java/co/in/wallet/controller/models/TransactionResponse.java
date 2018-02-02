package co.in.wallet.controller.models;

/**
 * Created by sdanayak on 1/2/18.
 */
public class TransactionResponse {

    private String message;
    private String balance;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
