package za.ac.cput.Domain;

/**
 * @author Zahrah Vermaak 221406395
 */

public class User {

    private String userId;
    private String name;
    private String surname;


    public User() {
    }

    private User(Builder builder) {
        this.userId = builder.userId;
        this.name = builder.name;
        this.surname = builder.surname;

    }

    public String getUserId() {
        return userId;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }


    public String getFullName() {
        return "Name: " + name + " " + "Surname: " + surname;
    }



    public static class Builder {
        private String userId;
        private String name;
        private String surname;


        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }



        public User build() {
            return new User(this);
        }


    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
