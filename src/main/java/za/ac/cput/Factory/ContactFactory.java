package za.ac.cput.Factory;
/**
 * @author Zahrah Vermaak 221406395
 */

import za.ac.cput.Domain.Contact;

public class ContactFactory {

    public static Contact createContact(String contactId, String phoneNumber) {

        if (contactId == null || phoneNumber == null) {
            return null;
        }

        return new Contact.Builder()
                .setContactId(contactId)
                .setPhoneNumber(phoneNumber)
                .build();
    }
}
