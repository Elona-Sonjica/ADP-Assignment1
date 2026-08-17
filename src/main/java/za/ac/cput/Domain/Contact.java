package za.ac.cput.Domain;
/**
 * @author Zahrah Vermaak 221406395
 */

public class Contact {

    private String contactId;
    private String phoneNumber;

    public Contact() {
    }

    public Contact(Builder builder) {
        this.contactId = builder.contactId;
        this.phoneNumber = builder.phoneNumber;

    }

    public String getContactId() {
        return contactId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId='" + contactId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class Builder {
        private String contactId;
        private String phoneNumber;

        public Builder setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }

    }
}
