package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Register;


import static org.junit.jupiter.api.Assertions.*;

class RegisterFactoryTest {

    @Test
    void createRegister() {

        Register register =
                RegisterFactory.createRegister(
                        "register1",
                        "test@gmail.com"
                );

        assertNotNull(register);
        assertEquals("register1", register.getRegisterId());
        assertEquals("test@gmail.com", register.getEmail());

        System.out.println("Created: " + register);
    }

    @Test
    void createRegisterWithNullRegisterId() {

        Register register =
                RegisterFactory.createRegister(
                        null,
                        "test@gmail.com"
                );

        assertNull(register);
    }

    @Test
    void createRegisterWithNullEmail() {

        Register register =
                RegisterFactory.createRegister(
                        "register1",
                        null
                );

        assertNull(register);
    }
}

