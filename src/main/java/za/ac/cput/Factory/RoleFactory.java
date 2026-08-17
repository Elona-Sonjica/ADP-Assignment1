package za.ac.cput.Factory;

import za.ac.cput.Domain.Role;

/**
 * @author Zahrah Vermaak 221406395
 */

public class RoleFactory {

    public static Role createRole(String roleId, String roleName, String description) {

        if (roleId == null || roleName == null || description == null) {
            return null;
        }

        return new Role.Builder()
                .setRoleId(roleId)
                .setRoleName(roleName)
                .setDescription(description)
                .build();
    }

}
