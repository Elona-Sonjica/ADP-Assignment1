package za.ac.cput.repositoryImpl;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Register;

import static org.junit.jupiter.api.Assertions.*;

class RegisterRepositoryTest {

    private final RegisterRepository repository =
            RegisterRepository.getRepository();


    @Test
    void getRepository() {

        RegisterRepository repository1 =
                RegisterRepository.getRepository();

        RegisterRepository repository2 =
                RegisterRepository.getRepository();

        assertNotNull(repository1);
        assertSame(repository1, repository2);

        System.out.println("Repository: " + repository1);
    }


    @Test
    void create() {

        Register register =
                new Register.Builder()
                        .setRegisterId("create1")
                        .setEmail("create@gmail.com")
                        .build();

        Register created = repository.create(register);

        assertNotNull(created);
        assertEquals("create1", created.getRegisterId());
        assertEquals("create@gmail.com", created.getEmail());

        System.out.println("Created: " + created);
    }


    @Test
    void read() {

        Register register =
                new Register.Builder()
                        .setRegisterId("read1")
                        .setEmail("read@gmail.com")
                        .build();

        repository.create(register);

        Register read = repository.read("read1");

        assertNotNull(read);
        assertEquals("read1", read.getRegisterId());
        assertEquals("read@gmail.com", read.getEmail());

        System.out.println("Read: " + read);
    }


    @Test
    void update() {

        Register register =
                new Register.Builder()
                        .setRegisterId("update1")
                        .setEmail("old@gmail.com")
                        .build();

        repository.create(register);

        Register updatedRegister =
                new Register.Builder()
                        .setRegisterId("update1")
                        .setEmail("updated@gmail.com")
                        .build();

        Register updated = repository.update(updatedRegister);

        assertNotNull(updated);
        assertEquals("update1", updated.getRegisterId());
        assertEquals("updated@gmail.com", updated.getEmail());

        System.out.println("Updated: " + updated);
    }


    @Test
    void delete() {

        Register register =
                new Register.Builder()
                        .setRegisterId("delete1")
                        .setEmail("delete@gmail.com")
                        .build();

        repository.create(register);

        boolean deleted = repository.delete("delete1");

        assertTrue(deleted);

        Register read = repository.read("delete1");

        assertNull(read);

        System.out.println("Deleted: " + deleted);
    }
}
