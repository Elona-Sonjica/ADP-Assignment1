package za.ac.cput.Domain;
/**
 * @author Zahrah Vermaak 221406395
 */

public class Register {

    private String registerId;
    private String email;

    public Register() {
    }

    public Register (Builder builder){
        this.registerId = builder.registerId;
        this.email = builder.email;
    }

    public String getRegisterId() {
        return registerId;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Register{" +
                "registerId='" + registerId + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder{
        private String registerId;
        private String email;

        public Builder setRegisterId(String registerId) {
            this.registerId = registerId;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Register build(){
            return new Register(this);
        }
    }
}
