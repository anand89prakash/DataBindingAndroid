package com.example.anandmaurya.databindingandroid;

/**
 * Created by Anand Prakash Maurya on 31/03/2019.
 */
public class UserDataModel {
    private String firstName,lastName;

    public UserDataModel(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
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
