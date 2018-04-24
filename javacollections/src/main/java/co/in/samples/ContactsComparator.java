package co.in.samples;

import co.in.samples.model.Contact;

import java.util.Comparator;


public class ContactsComparator implements Comparator<Contact> {

    public int compare(Contact c1, Contact c2) {
        if (c1.getPriority() < c2.getPriority()) {
            return -1;
        }
        if (c1.getPriority() > c2.getPriority()) {
            return 1;
        }
        return 0;
    }

}
