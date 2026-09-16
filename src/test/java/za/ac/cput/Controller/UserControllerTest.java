package za.ac.cput.Controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.Domain.User;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.MethodName.class)
class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private final String baseURL = "/api/user";

    private static final User user =
            new User.Builder()
                    .setUserId("user1")
                    .setName("John")
                    .setSurname("Doe")
                    .build();


    @Test
    void a_create() {

        ResponseEntity<User> response =
                restTemplate.postForEntity(
                        baseURL + "/create",
                        user,
                        User.class
                );

        assertNotNull(response.getBody());
        assertEquals("user1", response.getBody().getUserId());
        assertEquals("John", response.getBody().getName());
        assertEquals("Doe", response.getBody().getSurname());

        System.out.println("Created: " + response.getBody());
    }


    @Test
    void b_read() {

        ResponseEntity<User> response =
                restTemplate.getForEntity(
                        baseURL + "/read/user1",
                        User.class
                );

        assertNotNull(response.getBody());
        assertEquals("user1", response.getBody().getUserId());
        assertEquals("John", response.getBody().getName());
        assertEquals("Doe", response.getBody().getSurname());

        System.out.println("Read: " + response.getBody());
    }


    @Test
    void c_update() {

        User updatedUser =
                new User.Builder()
                        .setUserId("user1")
                        .setName("Jane")
                        .setSurname("Doe")
                        .build();

        HttpEntity<User> request =
                new HttpEntity<>(updatedUser, new HttpHeaders());

        ResponseEntity<User> response =
                restTemplate.exchange(
                        baseURL + "/update",
                        HttpMethod.PUT,
                        request,
                        User.class
                );

        assertNotNull(response.getBody());
        assertEquals("user1", response.getBody().getUserId());
        assertEquals("Jane", response.getBody().getName());
        assertEquals("Doe", response.getBody().getSurname());

        System.out.println("Updated: " + response.getBody());
    }


    @Test
    void d_getAll() {

        ResponseEntity<User[]> response =
                restTemplate.getForEntity(
                        baseURL + "/getAll",
                        User[].class
                );

        assertNotNull(response.getBody());
        assertTrue(response.getBody().length > 0);

        System.out.println("All Users:");

        for (User user : response.getBody()) {
            System.out.println(user);
        }
    }


    @Test
    void e_delete() {

        ResponseEntity<Boolean> response =
                restTemplate.exchange(
                        baseURL + "/delete/user1",
                        HttpMethod.DELETE,
                        null,
                        Boolean.class
                );

        assertNotNull(response.getBody());
        assertTrue(response.getBody());

        System.out.println("Deleted: " + response.getBody());
    }
}
