package za.ac.cput.Domain;
/**
 * @author Zahrah Vermaak 221406395
 */

public class Login {

    private String username;
    private String password;

    public Login() {
    }

    public Login(Builder builder){
        this.username = builder.username;
        this.password = builder.password;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder{
        private String username;
        private String password;

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Login build(){
            return new Login(this);
        }
    }
}
