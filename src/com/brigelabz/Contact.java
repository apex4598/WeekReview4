package com.brigelabz;

public class Contact {
    private String firstName;
    private String lastName;
    private String cityName;

    public Contact(String firstName, String lastName, String cityName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + cityName + '\'' +
                '}';
    }



}
