package co.in.samples;


import org.json.JSONObject;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class StringComparisonTest {

    StringComparison stringComparison;

    @BeforeAll
    public void firstMethod() {
        System.out.println("Before all is executed...");
        StringComparison stringComparison = new StringComparison();
    }

    @Test
    public void stringArrayCompareMatches() {

        String json = "{\"key1\":\"value1\"}";
        List<String> assetKeys = new ArrayList<String>();
        assetKeys.add("deviceProp.key1");
        assetKeys.add("deviceProp.key1.key11");
        assetKeys.add("deviceProp.key1.key11.key111");

        assertTrue(stringComparison.checkForJsonKeys(new JSONObject(json), assetKeys));

    }
}
