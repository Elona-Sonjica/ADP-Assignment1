package za.ac.cput.Repository;
/**
 * @author Zahrah Vermaak 221406395
 */
import za.ac.cput.Domain.User;

import java.util.List;

public interface IUserRepository extends IRepository<User, String> {

    User create(User user);

    User read(String userId);

    User update(User user);

    boolean delete(String userId);

    boolean exists(String userId);
    List<User> getAllUser();
}
