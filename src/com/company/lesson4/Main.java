package com.company.lesson4;

import com.company.lesson3.Person;
import com.company.lesson3.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(2);
        mySet.add(3);

        System.out.println(mySet);

        System.out.println(mySet.contains(2));

        Test test = new Test();
        ArrayList<Person> persons = test.persons();

        HashSet<Person> setOfPersons = new HashSet<>(persons);
        for (Person person : setOfPersons) {
            System.out.println(person.getFirstName());
        }

        System.out.println(setOfPersons);

        HashMap<Integer, String> myHashMap = new HashMap<>();
        myHashMap.put(null, "Andy");
        myHashMap.put(2, "Andy1");
        myHashMap.put(null, "Andy2");
        myHashMap.put(4, null);

        for (Map.Entry<Integer, String> entry : myHashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

}
