package com.practice.rules;

import com.practice.entities.Person;
import com.practice.entities.SaleableItem;
import org.junit.Test;

import java.util.Calendar;

import static junit.framework.Assert.assertTrue;


public class FestivalSaleRulesTest {


    @Test
    public void shouldGetFestivalDiscountForOldAge() {
        SaleableItem item = prepareItemObject();
        Person person = prepareOldAgePerson();
        assertTrue(20 == new FestivalSaleRules().getApplicableDiscount(person, item));

    }

    @Test
    public void shouldGetFestivalDiscountForOtherAge() {
        SaleableItem item = prepareItemObject();
        Person person = prepareNormalAgePerson();
        assertTrue(10 == new FestivalSaleRules().getApplicableDiscount(person, item));
    }

    private Person prepareNormalAgePerson() {
        Person person = new Person();
        person.setName("Test Person2");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1955);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 2);
        person.setDateOfBirth(calendar.getTime());
        return person;
    }

    private SaleableItem prepareItemObject() {
        SaleableItem item = new SaleableItem();
        item.setName("Kitchen Mixer");
        item.setCode("SDDF234SDss333");
        item.setCost(2345.458);
        return item;
    }

    private Person prepareOldAgePerson() {
        Person person = new Person();
        person.setName("Test Person1");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1940);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 2);
        person.setDateOfBirth(calendar.getTime());
        return person;
    }

    @Test
    public void shouldMatchAge() {
        Person person = prepareOldAgePerson();
        System.out.println("age method gave:" + person.getAgeInYears());
        assertTrue(70 == person.getAgeInYears());
    }
}
