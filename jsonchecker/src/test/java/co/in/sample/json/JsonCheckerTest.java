package co.in.sample.json;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class JsonCheckerTest {


    @Test
    public void jsonPassedIsValid() {
        String sampleJson ="{\n" +
                "  \"customInfo\" : {\n" +
                "    \"customerVisualProperties\" : {\n" +
                "      \"displayName\" : \"Jack Welch\",\n" +
                "      \"displayImage\" : {\n" +
                "        \"id\":\"32we8h73223wetrhtrh\",\n" +
                "        \"category\":\"avatar\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"wifiDetails\": {\n" +
                "      \"bSsid\":\"3498h98hewe34w\",\n" +
                "      \"location\":\"9389sdfhsd\"\n" +
                "    }\n" +
                "  }\n" +
                "  \n" +
                "}";
        JsonChecker jsonChecker = new JsonChecker();

        assertTrue(jsonChecker.isJsonValid(sampleJson));

    }
}
