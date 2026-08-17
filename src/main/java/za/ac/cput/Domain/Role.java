package za.ac.cput.Domain;
/**
 * @author Zahrah Vermaak 221406395
 */

public class Role {

    private String roleId;
    private String roleName;
    private String description;

    public Role() {
    }

    public Role (Builder builder){
        this.roleId = builder.roleId;
        this.roleName = builder.roleName;
        this.description = builder.description;

    }

    public String getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private String roleId;
        private String roleName;
        private String description;


        public Builder setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }

        public Builder setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Role build() {
            return new Role(this);
        }

    }
}
