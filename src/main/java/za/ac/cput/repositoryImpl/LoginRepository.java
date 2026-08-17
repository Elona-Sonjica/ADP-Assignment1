package za.ac.cput.repositoryImpl;

import za.ac.cput.Domain.Login;
import za.ac.cput.Repository.ILoginRepository;

import java.util.*;

public class LoginRepository implements ILoginRepository {

    private static LoginRepository repository = null;
    private final List<Login> allLogins;

    private LoginRepository() {
        allLogins = new ArrayList<>();
    }

    public static LoginRepository getRepository() {
        if (repository == null) {
            repository = new LoginRepository();
        }
        return repository;
    }

    @Override
    public Login create(Login login) {
        allLogins.add(login);
        return login;
    }

    @Override
    public Login read(String username) {
        for (Login login : allLogins) {
            if (login.getUsername().equals(username)) {
                return login;
            }
        }
        return null;
    }

    @Override
    public Login update(Login login) {
        Login existingLogin = read(login.getUsername());

        if (existingLogin != null) {
            allLogins.remove(existingLogin);
            allLogins.add(login);
            return login;
        }

        return null;
    }

    @Override
    public boolean delete(String username) {
        Login loginToDelete = read(username);

        if (loginToDelete != null) {
            allLogins.remove(loginToDelete);
            return true;
        }

        return false;
    }



}
