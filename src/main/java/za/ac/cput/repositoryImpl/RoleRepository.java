package za.ac.cput.repositoryImpl;

import za.ac.cput.Domain.Role;
import za.ac.cput.Repository.IRoleRepository;

import java.util.*;

public class RoleRepository implements IRoleRepository {
    private static RoleRepository repository = null;
    private final List<Role> allRoles;

    private RoleRepository() {
        allRoles = new ArrayList<>();
    }

    public static RoleRepository getRepository() {
        if (repository == null) {
            repository = new RoleRepository();
        }
        return repository;
    }

    @Override
    public Role create(Role role) {
        allRoles.add(role);
        return role;
    }

    @Override
    public Role read(String roleId) {
        for (Role role : allRoles) {
            if (role.getRoleId().equals(roleId)) {
                return role;
            }
        }
        return null;
    }

    @Override
    public Role update(Role role) {
        Role existingRole = read(role.getRoleId());

        if (existingRole != null) {
            allRoles.remove(existingRole);
            allRoles.add(role);
            return role;
        }

        return null;
    }

    @Override
    public boolean delete(String roleId) {
        Role roleToDelete = read(roleId);

        if (roleToDelete != null) {
            allRoles.remove(roleToDelete);
            return true;
        }

        return false;
    }

    @Override
    public boolean exists(String roleId) {
        return read(roleId) != null;
    }

    @Override
    public List<Role> getAll() {
        return allRoles;
    }
}
