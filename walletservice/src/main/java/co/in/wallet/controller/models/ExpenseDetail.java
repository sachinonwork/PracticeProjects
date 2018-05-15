package co.in.wallet.controller.models;

import org.springframework.data.annotation.Version;

/**
 * Created by sdanayak on 1/2/18.
 */

public class ExpenseDetail {

    @Version
    private Long version;
    private String type;
    private Double amount;
    private String description;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
