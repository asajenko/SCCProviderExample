package com.sajenko.provider.restservice;

public class User {

    private final Long id;
    private final String firstName;

    public User(Long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
}
