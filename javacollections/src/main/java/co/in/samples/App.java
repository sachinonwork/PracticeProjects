package co.in.samples;


import co.in.samples.model.Contact;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) {

        List<Contact> contacts = prepareRandomContacts();
        Comparator<Contact> comparator = new ContactsComparator();
        PriorityQueue<Contact> queue =
                new PriorityQueue<Contact>(10, comparator);
    }

    private static List<Contact> prepareRandomContacts() {

        List<Contact> contacts = new ArrayList<Contact>();
        Contact contact = new Contact();

        return null;
    }
}
