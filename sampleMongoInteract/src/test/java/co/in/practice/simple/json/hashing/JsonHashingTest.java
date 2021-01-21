package co.in.practice.simple.json.hashing;

import co.in.practice.simple.models.AreaDetails;
import co.in.practice.simple.models.SalesContact;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class JsonHashingTest {


    @Test
    public void jsonHashValueMatches() {
        SalesContact salesContact1 = new SalesContact();
        salesContact1.setId("239ry2398ry3298");
        salesContact1.setName("Patrick");
        AreaDetails areaForSales1 = new AreaDetails();
        areaForSales1.setAreaName("Kharadi");
        areaForSales1.setCity("Pune");
        areaForSales1.setLocationCode(23293484);
        areaForSales1.setPinCode("411014");
        areaForSales1.setRegionCode("34r23r3");
        salesContact1.setAreaResponsible(areaForSales1);

        SalesContact salesContact2 = new SalesContact();
        salesContact2.setId("239ry2398ry3228");
        salesContact2.setName("Patrick");
        AreaDetails areaForSales2 = new AreaDetails();
        areaForSales2.setAreaName("Kharadi");
        areaForSales2.setCity("Pune");
        areaForSales2.setLocationCode(23293484);
        areaForSales2.setPinCode("411014");
        areaForSales2.setRegionCode("34r23r3");
        salesContact2.setAreaResponsible(areaForSales2);


        /*String json1ForSales1 = salesContact1.jsonString();
        String json2ForSales2 = salesContact2.jsonString();*/
        String hashForArea1 = areaForSales1.toJsonHashValue();
        String hashForArea2 = areaForSales2.toJsonHashValue();


        assertTrue(hashForArea1.equalsIgnoreCase(hashForArea2));


    }

}
