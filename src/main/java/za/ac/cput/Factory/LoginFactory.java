package za.ac.cput.Factory;
/**
 * @author Zahrah Vermaak 221406395
 */

import za.ac.cput.Domain.Login;

public class LoginFactory {

    public static Login createLogin(String username, String password){

        if (username == null || password == null) {
            return null;
        }

        return new Login.Builder()
                .setUsername(username)
                .setPassword(password)
                .build();
    }
}
