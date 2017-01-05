package in.co.exp;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Transaction {

    private MongoDatabase mongoDB;

    public boolean create() {
        mongoDB = MongoDBInitializer.getMongoDBConn().getDatabase("transactions");
        if (null != mongoDB) {
            MongoCollection dbCollection = mongoDB.getCollection("transaction");
            Document dbObjectBuilder = new Document("description", description)
                    .append("currencyCode", currencyCode)
                    .append("amount", amount);
            dbCollection.insertOne(dbObjectBuilder);
            return true;
        }
        return false;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private String description;
    private String currencyCode;
    private double amount;
}
