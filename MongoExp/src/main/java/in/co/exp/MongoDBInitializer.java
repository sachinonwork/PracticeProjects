package in.co.exp;

import com.mongodb.MongoClient;

/**
 * Created by sdanayak on 23/12/16.
 */
public class MongoDBInitializer {

    private static MongoClient mongoClient;

    static {
        mongoClient = new MongoClient("localhost", 27017);
    }

    public static MongoClient getMongoDBConn() {
        if(mongoClient == null) {
            mongoClient = new MongoClient("localhost", 27017);
        }
        return mongoClient;
    }

}
