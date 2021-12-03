package com.company;

public class Students {

    private String firstName;
    private String lastName;
    private String number;


    public Students() {
    }

    public Students(String firstName, String lastName, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Students{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number='" + number + '\'' +
                '}';
    }



    public boolean malibu(String text) {
        if (this.firstName.contains(text) || this.lastName.contains(text) || this.number.contains(text)) {
            return true;
        } else {
            return false;
        }
    }
}
