package com.learning.jsf;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

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
        Authentication authentication = SecurityContextHolder
                .getContext().getAuthentication();
        return "Hello " + authentication.getName() + "!";
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
