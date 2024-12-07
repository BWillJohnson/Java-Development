package com.pluralsight;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age ;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person myFamily) {
       int lastName = this.lastName.compareTo(myFamily.lastName);

       if (lastName != 0){
           return lastName;
       }
       int firstName = this.firstName.compareTo(myFamily.firstName);
       if (firstName != 0){
           return firstName;
       }
       return Integer.compare(this.age,myFamily.age);
    }

    @Override
    public String toString() {
        return lastName + " | " + firstName + " | " + age;
    }

}
