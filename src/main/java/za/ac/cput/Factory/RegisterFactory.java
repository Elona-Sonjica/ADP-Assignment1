package za.ac.cput.Factory;
/**
 * @author Zahrah Vermaak 221406395
 */

import za.ac.cput.Domain.Register;

public class RegisterFactory {

    public static Register createRegister(String registerId, String email) {

        if (registerId == null || email == null) {
            return null;
        }

        return new Register.Builder()
                .setRegisterId(registerId)
                .setEmail(email)
                .build();
    }
}
