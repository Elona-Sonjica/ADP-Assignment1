package za.ac.cput.Repository;
/**
 * @author Zahrah Vermaak 221406395
 */

import za.ac.cput.Domain.Product;
import za.ac.cput.Domain.UserRole;

import java.util.List;

public interface IUserRoleRepository {
    UserRole create(UserRole userRole);

    UserRole read(String userId);

    UserRole update(UserRole userRole);

    boolean delete(String userId);


    List<UserRole> getAll();
}
