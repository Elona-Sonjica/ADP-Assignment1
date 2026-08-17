package za.ac.cput.Repository;
/**
 * @author Zahrah Vermaak 221406395
 */

import za.ac.cput.Domain.Login;

public interface ILoginRepository {
    Login create(Login login);

    Login read(String username);

    Login update(Login login);

    boolean delete(String username);


}
