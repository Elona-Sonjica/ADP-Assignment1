package za.ac.cput.repositoryImpl;

import za.ac.cput.Domain.UserRole;
import za.ac.cput.Repository.IUserRoleRepository;

import java.util.*;

public class UserRoleRepository implements IUserRoleRepository {

    private static UserRoleRepository repository = null;
    private final List<UserRole> allUserRoles;

    private UserRoleRepository() {
        allUserRoles = new ArrayList<>();
    }

    public static UserRoleRepository getRepository() {
        if (repository == null) {
            repository = new UserRoleRepository();
        }
        return repository;
    }

    @Override
    public UserRole create(UserRole userRole) {
        allUserRoles.add(userRole);
        return userRole;
    }

    @Override
    public UserRole read(String userId) {
        for (UserRole userRole : allUserRoles) {
            if (userRole.getUserId().equals(userId)) {
                return userRole;
            }
        }
        return null;
    }

    @Override
    public UserRole update(UserRole userRole) {
        UserRole existingUserRole = read(userRole.getUserId());

        if (existingUserRole != null) {
            allUserRoles.remove(existingUserRole);
            allUserRoles.add(userRole);
            return userRole;
        }

        return null;
    }

    @Override
    public boolean delete(String userId) {
        UserRole userRoleToDelete = read(userId);

        if (userRoleToDelete != null) {
            allUserRoles.remove(userRoleToDelete);
            return true;
        }

        return false;
    }

    @Override
    public List<UserRole> getAll() {
        return allUserRoles;
    }
}
