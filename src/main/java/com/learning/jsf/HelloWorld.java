package com.learning.jsf;

import javax.inject.Named;

@Named
public class HelloWorld {
    private String firstName;
    private String lastName;

    private HelloWorld() {}

    public HelloWorld(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String showGreeting() {
        return "Hello " + firstName + " " + lastName + "!";
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
}
