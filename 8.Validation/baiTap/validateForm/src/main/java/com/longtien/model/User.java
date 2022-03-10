package com.longtien.model;

public class User {
    private String firstName ;
    private String lastName;
    private Integer age ;
    private String phoneNumber;
    private String email;

    public User(){}

    public User(String firstName , String lastName, Integer age,String phoneNumber, String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.phoneNumber = phoneNumber;
        this.email=email;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
