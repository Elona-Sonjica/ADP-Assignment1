package za.ac.cput.Domain;
/**
 * @author Zahrah Vermaak 221406395
 */
public class UserRole {

    private String userId;
    private String roleId;
    private String userRoleDescription;

    public UserRole() {
    }

    public UserRole (Builder builder){
        this.userId = builder.userId;
        this.roleId = builder.roleId;
        this.userRoleDescription = builder.userRoleDescription;

    }

    public String getUserId() {
        return userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public String getUserRoleDescription() {
        return userRoleDescription;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userId='" + userId + '\'' +
                ", roleId='" + roleId + '\'' +
                ", userRoleDescription='" + userRoleDescription + '\'' +
                '}';
    }

    public static class Builder{
        private String userId;
        private String roleId;
        private String userRoleDescription;

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        public Builder setUserRoleDescription(String userRoleDescription) {
            this.userRoleDescription = userRoleDescription;
            return this;
        }

        public UserRole build(){
            return new UserRole(this);
        }
    }
}
