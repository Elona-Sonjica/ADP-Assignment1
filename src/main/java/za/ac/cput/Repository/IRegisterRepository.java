package za.ac.cput.Repository;
/**
 * @author Zahrah Vermaak 221406395
 */

import za.ac.cput.Domain.Product;
import za.ac.cput.Domain.Register;

import java.util.List;

public interface IRegisterRepository {
    Register create(Register register);

    Register read(String registerId);

    Register update(Register register);

    boolean delete(String registerId);


}
