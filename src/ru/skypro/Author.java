package ru.skypro;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAuthorFirstName() {
        return firstName;
    }

    public String getAuthorLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        if (firstName.equals(c2.firstName) && lastName.equals(c2.lastName)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
