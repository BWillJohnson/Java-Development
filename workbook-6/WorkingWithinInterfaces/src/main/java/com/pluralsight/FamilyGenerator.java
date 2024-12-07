package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class FamilyGenerator {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<>();
        myFamily.add(new Person("Son","Goku",51));
        myFamily.add(new Person("Monkey D.","Luffy",19));
        myFamily.add(new Person("Cid","Kagenou",17));
        myFamily.add(new Person("Kazuma","Satou",17));
        // Time to sort;
        Collections.sort(myFamily);

        for (Person person : myFamily) {
            System.out.println(person);
        }

    }



}
