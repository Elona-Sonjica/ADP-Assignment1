package za.ac.cput.Repository;
/**
 * @author Zahrah Vermaak 221406395
 */


import za.ac.cput.Domain.Product;
import za.ac.cput.Domain.Role;

import java.util.List;

public interface IRoleRepository {

    Role create(Role role);

    Role read(String roleId);

    Role update(Role role);

    boolean delete(String roleId);

    boolean exists(String roleId);

    List<Role> getAll();
}

