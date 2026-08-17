package za.ac.cput.Factory;
/**
 * @author Zahrah Vermaak 221406395
 */
import za.ac.cput.Domain.UserRole;

public class UserRoleFactory {

    public static UserRole createUserRole(
            String userId,
            String roleId,
            String userRoleDescription) {

        if (userId == null || roleId == null || userRoleDescription == null) {
            return null;
        }

        return new UserRole.Builder()
                .setUserId(userId)
                .setRoleId(roleId)
                .setUserRoleDescription(userRoleDescription)
                .build();
    }
}
