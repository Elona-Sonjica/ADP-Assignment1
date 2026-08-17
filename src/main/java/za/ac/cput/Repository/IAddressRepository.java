package za.ac.cput.Repository;
/**
 * @author Zahrah Vermaak 221406395
 */

import za.ac.cput.Domain.Address;

import java.util.List;

public interface IAddressRepository extends IRepository<Address,String>{

    Address create(Address address);

    Address read(String addressId);

    Address update(Address address);

    boolean delete(String addressId);

    boolean exists(String addressId);

    List<Address>getAllAddress(); // create other lists
}
