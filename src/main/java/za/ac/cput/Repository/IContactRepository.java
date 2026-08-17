package za.ac.cput.Repository;
/**
 * @author Zahrah Vermaak 221406395
 */

import za.ac.cput.Domain.Contact;
import za.ac.cput.Domain.Product;

import java.util.List;

public interface IContactRepository {
    Contact create(Contact contact);

    Contact read(String contactId);

    Contact update(Contact contact);

    boolean delete(String contactId);

    boolean exists(String contactId);

    List<Contact> getAll();
}
