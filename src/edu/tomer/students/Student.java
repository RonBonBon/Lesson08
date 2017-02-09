package edu.tomer.students;


import edu.tomer.utils.IO;

public class Student {
    //properties
    private String firstName;
    private String lastName;

    //Constructor
    public Student(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    //default constructor
    public Student() {
        this.firstName = IO.getString("Enter First Name");
        this.lastName = IO.getString("Enter Last Name");
    }

    public void whatYourName() {
        System.out.printf(
                "My name is: %s - %s\n",
                this.firstName,
                this.lastName
        );
    }


    public void replaceYourNameWith(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    //public methods:

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

    public String getFullName() {
        return firstName + " - " + lastName;
    }
}
