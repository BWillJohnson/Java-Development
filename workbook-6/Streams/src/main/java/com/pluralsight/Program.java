package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Son", "Goku", 737));
        personList.add(new Person("Satou", "Kazuma", 17));
        personList.add(new Person("Goddess", "Aqua", 25));
        personList.add(new Person("Darkness", "Crusader", 19));
        personList.add(new Person("Megumim", "Crimson", 15));
        personList.add(new Person("Wiz", "Lich", 20));
        personList.add(new Person("Monkey D", "Luffy", 19));
        personList.add(new Person("Roronoa", "Zoro", 21));
        personList.add(new Person("Sanji", "Black Leg", 21));
        personList.add(new Person("Nico", "Robin", 30));


        getPersonName(personList);



        int average = getAgeAverage(personList);
        System.out.println("Average age: " + average);

        int oldestAge = findOldestAge(personList);
        System.out.println("Oldest Age: " + oldestAge);

        double averageAge = calculateAverageAge(personList);
        System.out.println("Average age: " + averageAge);

        int minAge = findYoungestAge(personList);
        System.out.println("The youngest age: " + minAge);
    }


    public static void getPersonName(List<Person> personList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi enter the [First Name] or [Last Name] of the individual you are trying to find.: ");
        String response = input.nextLine().trim();
        boolean nameFound = false;
        for (Person person : personList) {
            if (response.equalsIgnoreCase(person.getFirstName()) || response.equalsIgnoreCase(person.getLastName())) {
                System.out.println("Got Em: " + person.getFirstName() + " | " + person.getLastName() + " | " + person.getAge());
                nameFound = true;
                break;
            }
        }
        if (!nameFound) {
            System.err.println("Notice person is not listed.");

        }

    }

    public static int getAgeAverage(List<Person> personList) {
        int sum = 0;
        for (Person name : personList) {
            sum += name.getAge();
        }
        return sum /personList.size();
    }
    public static int findOldestAge(List<Person>personList){
        int oldestAge = 0;
        try {
            for (Person person : personList) {
                if (person.getAge() > oldestAge){
                    oldestAge = person.getAge();
                }
            }

        } catch (Exception e) {
            System.err.println("!Notice age is invalid in memory system");
        }
        return oldestAge;

    }
    public static double calculateAverageAge(List<Person>personList){
        double sum = 0;
        for (Person person : personList) {
            sum += person.getAge();
        }
        return  sum / personList.size();
    }
    public static  int findYoungestAge(List<Person> personList){
        int minAge = Integer.MAX_VALUE;
        for (Person person : personList) {
            if (person.getAge()< minAge)
                minAge = person.getAge();

        }
        return minAge;
    }
}
