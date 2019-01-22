package com.company.lesson6;

import java.util.List;

/**
 * #Summary:
 * #Author: Andrii_Marchenko1
 * #Author’s Email:
 * #Creation Date: 1/17/2019
 * #Comments:
 */
public class Plane implements Flyable {
    private String engine;
    private List<String> wings;

    @Override
    public void run() {
        System.out.println("The plain is running.");
    }

    @Override
    public void fly() {
        System.out.println("The plain is flying.");
    }

    @Override
    public void sleep() {
        System.out.println("NOTHING TO DO!!!");
    }
}
