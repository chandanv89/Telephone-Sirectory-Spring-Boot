package com.github.chandanv89.telephonedirectory.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * The type Contact.
 */
public class Contact {
    @JsonIgnore
    @JsonProperty("id")
    private String id;

    @JsonProperty("fullName")
    private String fullName;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("contactNumbers")
    private List<ContactNumber> contactNumbers;

    @JsonProperty("emails")
    private List<Email> emails;

    /**
     * Instantiates a new Contact.
     */
    public Contact() {
        this.id = UUID.randomUUID().toString();
        this.contactNumbers = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    /**
     * Instantiates a new Contact.
     *
     * @param fullName the full name
     */
    public Contact(String fullName) {
        this.id = UUID.randomUUID().toString();
        this.fullName = fullName;
        setNameComponents();
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Gets full name.
     *
     * @return the full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets full name.
     *
     * @param fullName the full name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
        setNameComponents();
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets contact numbers.
     *
     * @return the contact numbers
     */
    public List<ContactNumber> getContactNumbers() {
        return contactNumbers;
    }

    /**
     * Sets contact numbers.
     *
     * @param contactNumbers the contact numbers
     */
    public void setContactNumbers(List<ContactNumber> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    /**
     * Gets emails.
     *
     * @return the emails
     */
    public List<Email> getEmails() {
        return emails;
    }

    /**
     * Sets emails.
     *
     * @param emails the emails
     */
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumbers=" + contactNumbers +
                ", emails=" + emails +
                '}';
    }

    private void setNameComponents() {
        String[] names;

        if (fullName.contains(",")) {
            names = fullName.split(",");
        } else if (fullName.contains(" ")) {
            names = fullName.split(" ");
        } else {
            names = new String[2];
            names[0] = fullName;
            names[1] = "";
        }

        this.lastName = names[0].trim();
        this.firstName = names[1].trim();
    }
}
