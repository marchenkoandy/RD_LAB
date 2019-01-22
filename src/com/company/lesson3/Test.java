package com.company.lesson3;

import java.util.ArrayList;

/**
 * #Summary:
 * #Author: Andrii_Marchenko1
 * #Author’s Email:
 * #Creation Date: 1/8/2019
 * #Comments:
 */
public class Test {

    public ArrayList<Person> persons() {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Andy", "Marchenko"));
        personArrayList.add(new Person("Alex", "Ostapchuk"));
        personArrayList.add(new Person("Alex", "Ostapchuk"));
        personArrayList.add(new Person("Alex", "Ostapchuk"));
        personArrayList.add(new Person("Alex", "Ostapchuk"));
        personArrayList.add(new Person("Alex", "Ostapchuk"));
        personArrayList.add(new Person("Alex", "Ostapchuk"));
        personArrayList.add(new Person("Alex", "Ostapchuk"));
        personArrayList.add(new Person("Alex", "Antonkin"));
        return personArrayList;
    }

    public Company myCompany() {
        return new Company("My", persons());
    }
}
