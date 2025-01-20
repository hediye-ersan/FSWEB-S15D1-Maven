package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("123456789");

        Contact contact1 = Contact.createContact("Bob", "31415926");
        Contact contact2 = Contact.createContact("Alice", "16180339");

        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);

        mobilePhone.printContacts();

        Contact updatedContact = Contact.createContact("Bob Updated", "31415927");
        mobilePhone.updateContact(contact1, updatedContact);

        mobilePhone.printContacts();

        mobilePhone.removeContact(updatedContact);
        mobilePhone.printContacts();
    }
}
