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

        System.out.println(personList);
    }
    public static void getPersonName(List<Person>personList){
        Scanner input = new Scanner(System.in);
        System.out.println("Hi enter the [First Name] [Last Name] of the individual you are trying to find.: ");
        String respone = input.nextLine().trim();
        boolean nameFound = false;
        for (Person person : personList) {
           if (respone.equalsIgnoreCase(person.getFirstName())|| respone.equalsIgnoreCase(person.getLastName())){
               System.out.println("Got Em: " + person.getFirstName() + person.getLastName());
            nameFound = true;
            break;
           }
        }
        if (!nameFound){
            System.err.println("Notice person is not listed.");

        }

    }
}
