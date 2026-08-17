package za.ac.cput.repositoryImpl;

import za.ac.cput.Domain.Contact;
import za.ac.cput.Repository.IContactRepository;

import java.util.ArrayList;
import java.util.List;

public class ContactRepository implements IContactRepository {

    private static ContactRepository repository = null;
    private final List<Contact> allContacts;

    private ContactRepository() {
        allContacts = new ArrayList<>();
    }

    public static ContactRepository getRepository() {
        if (repository == null) {
            repository = new ContactRepository();
        }
        return repository;
    }

    @Override
    public Contact create(Contact contact) {
        allContacts.add(contact);
        return contact;
    }

    @Override
    public Contact read(String contactId) {
        for (Contact contact : allContacts) {
            if (contact.getContactId().equals(contactId)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact update(Contact contact) {
        Contact existingContact = read(contact.getContactId());

        if (existingContact != null) {
            allContacts.remove(existingContact);
            allContacts.add(contact);
            return contact;
        }

        return null;
    }

    @Override
    public boolean delete(String contactId) {
        Contact contactToDelete = read(contactId);

        if (contactToDelete != null) {
            allContacts.remove(contactToDelete);
            return true;
        }

        return false;
    }

    @Override
    public boolean exists(String contactId) {
        return read(contactId) != null;
    }

    @Override
    public List<Contact> getAll() {
        return allContacts;
    }
}
