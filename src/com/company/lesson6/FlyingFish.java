package com.company.lesson6;

import java.util.List;

/**
 * #Summary:
 * #Author: Andrii_Marchenko1
 * #Author’s Email:
 * #Creation Date: 1/17/2019
 * #Comments:
 */
public class FlyingFish implements Flyable,Eatable{
    private String tail;
    private List<String> flippers;

    @Override
    public void run() {
        System.out.println("The FlyingFish is running.");
    }

    @Override
    public void fly() {
        System.out.println("The FlyingFish is flying.");
    }

    @Override
    public void eat() {
        System.out.println("The FlyingFish is eating.");
    }
}
